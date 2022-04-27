package day01datatypes;

public class C01_Variables {

    public static void main(String[] args) {

        //I am creating integer variable whose name is age

        int age =14;

        //I am creating a char variable whose name is initial

        char initial ='A';

        //let's print the values of age and initial on the console

        System.out.println(age);//12

       System.out.println(initial);//A

        //Create 3 integer variables , assign values to them, print them on the console oen by one
        // a) print them on the console one by one
        // b) print the sum of the 3 integers
        // c) Print the sum of the 3 integers by a label at the beginning. Example: 'The sum is 37'

        int i01=12; int i02=10; int i03=15;

        //a
        System.out.println(i01);//12
        System.out.println(i02);//10
        System.out.println(i03);//15

        //b
        System.out.println(i01+i02+i03);

        //c
        System.out.println("The sum is :" +i01+i02+i03);//121015

        System.out.println("The sum is :"+(i01+i02+i03));//37

        //Create 2 integer variables and print their multiplication on the console with a label

        int i04=15, i05=16;

        System.out.println("The multiplication is :"+i04*i05);//The multiplication is 240



    }
}
