package day02dataTypes;

public class DataTypes01 {
        /*
       What is the difference between "primitive" and "non-primitive" data types?
    1)primitive daya types contain just values, non-primitive data types contain value +method
    2)primitive data type names use just lowercase characters,but non-primitive data type names use uppercase at the beginning
    3)primitive data types were created by Java, developers cannot create primitive data types.But non-primitive data types
        But non-primitive data types can be created by Java and by any developer
    4) non-primitive data types uses same size area in memory but primitive data types can use different size area in memory

        */

    public static void main(String[] args) {


    //Primitive data types: boolean, char, byte, short,int,long,float, double,
    //1) boolean: boolean has 2 values which are true or false. A boolean variable uses just a bit in the memory
        boolean isRetired = false;
        boolean isOld = true;

    //2) char: char is for just a single character. It uses 16 bits(2 bytes) in memory
        char initial ='A';

    //3) byte:byte is for whole numbers between -128 and 127. It uses 8 bits(1 byte) in memory
    byte age=12;

    //4)short: short is for whole numbers between -32768 and 32767.It uses 16 bits(2 byte) in memory
        short numberOfStudentInASchool=2134;

    //5) int: int is for whole numbers between -2, 147,648 and 2,247, 487,647.It uses 32 bits(4 byte) in memory
        int annualProfitOfAplle=20000000;

    //6) long: long is for whole numbers between -9,223,372,036,854,755, and 9,223,372,036,854,755,,807.
        // It uses 64 bits(8 byte) in memory
        //Do not forget to put "L"to the end of the value in long data type
        long populationOfTheWorlds=7000000000L;

        //7) float: float is for decimals. It uses 32 bits in memory
        //Do not forget to put "F"to the end of the value in float data type

        float priceOfShirt= 19.99F;

        //8) double: double is for decimals.It uses 64 bits in memory
        //In double, decimal part can contain up to 16 digits
        double weightOfAccel=0.0000123004;


    //Non-Primitive Data:String
    String s ="Ali";
        System.out.println(s.toUpperCase());//ALI

        System.out.println(s.toLowerCase());//ali

}
}