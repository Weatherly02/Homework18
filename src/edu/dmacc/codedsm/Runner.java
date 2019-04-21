package edu.dmacc.codedsm;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


import static javax.swing.UIManager.put;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a username:");
        String userName = in.next();

        System.out.println("Enter a number");
        Integer inputNumber = in.nextInt();

        // MapRepository repository = new FizzBuzzMapRepository();
        //FizzBuzzService service = new FizzBuzzServiceImpl(repository);
        MapRepository repository = new FizzBuzzMapTwoRepository();   // change these lines
        FizzBuzzService service = new FizzBuzzServiceTwoImpl(repository);  //change these lines
        SubmissionController controller = new SubmissionControllerImpl(service);

        ConsoleInputView view = controller.submit(inputNumber, userName);
        view.render();

            File file = new File("C:/development/Homework18/fizzbuzz_result.txt");
            if (!file.exists()) ;

            try {
                file.createNewFile();
            } catch (
                    IOException e1) {
                e1.printStackTrace();
            }

            PrintWriter pw = null;
            try {
                pw = new PrintWriter(file);
            } catch (
                    FileNotFoundException e1) {
                e1.printStackTrace();
            }
           pw.println("result = " + repository.toString());

            pw.close();
            System.out.println("DONE");

        }
    }



