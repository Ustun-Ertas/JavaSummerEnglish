package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {


        //Scanner class is used ti get data from user in Java

        //How will we get dta from user.
        //1. Step:

        Scanner scan = new Scanner(System.in);

        //2.Step:
        System.out.println("Enter you age :");

        //3.Step:

        int age=scan.nextInt();
        System.out.println("The user's age is :" +age);


    }
}
