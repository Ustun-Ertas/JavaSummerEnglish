package day04scannerifstatment;

import java.util.Scanner;

public class IfStatment01 {
    public static void main(String[] args) {

        //Ask user to enter an integer, then
        //print "Positive" on the console if the number is positive
        //print "Negative" on the console if the number is negative
        //print "Neuter" on the console if the number is zero

        /*
        if you want to run different codes for different conditions you should use "if statment"
        example: if it rains, I will cancel the picnic.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the an integer to check its sign :");
        int num = scan.nextInt();

        if (num>0){
            System.out.println("Positive");
        }

        if (num<0){
            System.out.println("Negative");
        }
        if (num==0){
            System.out.println("Neuter");

        }
    }
}
