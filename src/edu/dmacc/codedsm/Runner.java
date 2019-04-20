package edu.dmacc.codedsm;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a username:");
        String userName = in.next();

        System.out.println("Enter a number");
        Integer inputNumber = in.nextInt();

        MapRepository repository = new FizzBuzzMapTwoRepository();   // change these lines
        FizzBuzzService service = new FizzBuzzServiceTwoImpl(repository);  //change these lines
        SubmissionController controller = new SubmissionControllerImpl(service);

        ConsoleInputView view = controller.submit(inputNumber, userName);
        view.render();


        try {
            File file = new File("C:/development/SundayTLW.txt");

            if (!file.exists()) file.createNewFile();

            PrintWriter pw = new PrintWriter("C:/development/Homework18/fizzbuzz_result.txt");
            pw.printf("%s,%s,%s", repository, service, controller);
            pw.println(controller.submit(inputNumber,userName));
            //pw.println(500);
            pw.close();
            System.out.println("DONE");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
