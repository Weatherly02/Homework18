package edu.dmacc.codedsm;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a username:");
        String userName = in.next();

        System.out.println("Enter a number");
        Integer inputNumber = in.nextInt();

        FizzBuzzService service = new FizzBuzzServiceImpl();
        SubmissionController controller = new SubmissionControllerImpl(service);

        controller.submit(inputNumber, userName);

    }
}
