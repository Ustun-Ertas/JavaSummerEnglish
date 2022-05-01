package day04scannerifstatment;

import java.util.Scanner;

public class IfStatment02 {
    public static void main(String[] args) {

        //Ask the user to enter an integer then
        //print "Even" if the integer is even
        //print "Odd" if the integer is odd

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer if it is even or odd : ");
        int num=scan.nextInt();

        //"Even" means divisible by 2, "Odd" means not divisible by 2. For example: 6 is even 5 is odd.
        // In java, we have "modulus" operator. For modulus operation we use "%".
        //"modulus" operator gives you the remainder in a division operation

        //Note: "==" means equals         "!=" means does not equal
        //Note: "!true" means false       "!false" means true      "!!true" means true

        if (num%2==0){
            System.out.println("Even");
        }
        if (num%2!=0){
            System.out.println("Odd");

        }

    }
}
