package day04scannerifstatment;

import java.util.Scanner;

public class IfStatment03 {
    public static void main(String[] args) {

        //Ask the user to enter a day name then
        //print "Weekday" for Monday,Tuesday,Wednesday,Thursday,Friday
        //print "Weekend Day" for Saturday and Sunday.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day name : ");
        String dayName = scan.next();

        //Note: In java there is OR Operator sign is "||"
        //      If you use  "||", when one is true the result will be true

        if (dayName.equals("Monday") || dayName.equals("Tuesday") || dayName.equals("Wednesday")
                || dayName.equals("Thursday") || dayName.equals("Friday")) {
            System.out.println("Weekday");

        }
        if (dayName.equals("Saturday") || dayName.equals("Sunday")) {
            System.out.println("Wekkend Day");

            //If user enter the day names in different cases like monday or m0n0Day
            //Note: Java created another method to compare 2 String, the method will give ignore cases.
            //      According to that method monday,MONDAY,m0n0Day will be same.
            //      The method is equalsIgnoreCase()
        }
        if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday")
                || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");

        }
        if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("Wekkend Day");
        }

        //make the if statement parenthesis shorter
        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") ||
                            dayName.equalsIgnoreCase("Tuesday") ||
                            dayName.equalsIgnoreCase("Wednesday") ||
                            dayName.equalsIgnoreCase("Thursday") ||
                            dayName.equalsIgnoreCase("Friday");

        if (isWeekDay){
            System.out.println("Weekday");
        }

        boolean isWeekEndDay = dayName.equalsIgnoreCase("Saturday") ||
                               dayName.equalsIgnoreCase("Sunday");
        if (isWeekEndDay) {
            System.out.println("Wekkend Day");
        }
    }
}