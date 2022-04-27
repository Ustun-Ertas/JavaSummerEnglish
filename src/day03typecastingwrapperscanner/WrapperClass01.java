package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {
        /*
        1) Java created a new structure by putting some methods into primitive data types,that structure is called:
        "Wrapper Class"
        2) boolean ==> Boolean
           char==>Character
           byte==>Byte
           short==>Short
           int==>Integer
           long==>Long
           float==>Float
           double==>Double
       3) Wrapper Class are non-primitive, and they stared in Heap Memory

         */

        //How to covert primitive data types to wapper classes: Aoutboxing
         char c='d';
         Character wc=c;

         int i=12;
         Integer wi=i;

         float f=1.2F;

         float wf=f;

        //How to conver wrapper classes to primitive data types: Unboxing

        short s=23;
        short ps=s;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //Find the min and max value of byte data type

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //Find the min and max value of short data type
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);








    }
}
