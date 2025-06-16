package javasessions;

public class MathematicalOperations {

    public static void main(String[] args) {

        System.out.println(1 + 2); //3
        System.out.println(10 / 2); //5
        System.out.println(9 / 2); //4 --> Output will always be Integer

        System.out.println(9.0 / 2); //4.5 --> Output will be always Floating number

        System.out.println(9.0 / 2.0); //4.5 --> Output will be always Floating

        // System.out.println(9/0); //Divide by Zero Exception --> It will give Arithematic Exception

        System.out.println(0 / 9); //0 --> this will always 0

        System.out.println(9.0 / 0); //Infinity

        System.out.println(9 / 0.0); //Infinity

        System.out.println(9.0 / 0.0); //Infinity

        // Infinity is applied only for double data type

        //   System.out.println(0/0); ////Divide by Zero Exception --> It will give Arithematic Exception

        System.out.println(0.0 / 0); //NaN --> Not a Number

        // System.out.println(-1/0); ////Divide by Zero Exception --> It will give Arithematic Exception

        System.out.println(0 / 0.0); //NaN --> Not a Number

        System.out.println(2 / 9); //0

        System.out.println(2 / 9.0); //0.2222222222222222

        System.out.println(0.0 / 0.0); //NaN

        // System.out.println(-12/0); Divide by Zero Exception --> It will give Arithematic Exception

        System.out.println(0 / 9.0); //0.0

        System.out.println(10 % 2); //0

        System.out.println(9 % 2); //1

        System.out.println(100 % 3); //1

        //System.out.println(9%0); //Divide by Zero Exception --> It will give Arithematic Exception

        System.out.println(0 % 9); //0

        System.out.println(10 % 0.0); //NaN

        System.out.println(10 % 0.1); //0.09999999999999945

        System.out.println(0.1+0.2); //0.30000000000000004

        System.out.println(0.1+0.4); //0.5

    }
}
