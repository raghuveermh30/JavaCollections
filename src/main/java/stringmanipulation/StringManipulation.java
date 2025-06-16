package stringmanipulation;

import java.util.Arrays;

public class StringManipulation {

    public static void main(String[] args) {

        /*
         * String is class, It is actually creating the char array internally
         * String can be created in 2 ways --> Literals and Object level

         */

        String str = "hi this is my java code and i am so happy";

        System.out.println("Length of the String " + str.length());
        System.out.println("Lowest Index " + 0);
        System.out.println("Highest Index " + (str.length() - 1));

        System.out.println(str.charAt(0)); //Give me the character available for the index
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2)); //space
        System.out.println(str.charAt(40));
        //  System.out.println(str.charAt(41)); StringIndexOutOfBoundsException --> SIOB
        // System.out.println(str.charAt(-1)); --> SIOB

        System.out.println(str.indexOf('h')); //0
        System.out.println(str.indexOf('i')); //1 -- 1st occurence of i

        System.out.println(str.indexOf('i', str.indexOf('i') + 1)); // -- 2nd occurence of i

        int p2 = str.indexOf('i', str.indexOf('i') + 1); //8

        System.out.println(str.indexOf('i', p2 + 1)); //8

        System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1)); //8

        int p3 = str.indexOf('i', p2 + 1);
        System.out.println(str.indexOf('i', p3 + 1));


        System.out.println("************");

        System.out.println(str.indexOf("java"));
        System.out.println(str.indexOf("code"));
        System.out.println(str.indexOf("python")); //-1

        String msg = "welcome naveen";
        System.out.println(msg.indexOf("naveen"));
        if (msg.indexOf("admin") == 8) {
            System.out.println("admin is present -- PASS");
        } else {
            System.out.println("admin is not present -- FAIL");
        }

        String t1 = "  hello world  ";
        System.out.println(t1.trim()); //Remove the spaces
        System.out.println(t1);

        //Lowercase and UpperCase
        String l1 = "hello java world";
        System.out.println(l1.toUpperCase());
        System.out.println(l1.toLowerCase());

        //Replace function
        String dob = "01-01-1990";   //01/01/1990
        System.out.println(dob.replace("-", "/"));    //01/01/1990

        String t2 = "  hello   world   ";
        System.out.println(t2.replace(" ", ""));

        //contains
        String test = "I love Java";
        System.out.println(test.contains("Java"));   //true
        System.out.println(test.contains("java"));   //false

        if (test.contains("Java")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        //equals:

        String r1 = "Hello Selenium";
        String r2 = "Hello Selenium";
        String r3 = "Hello selenium";

        System.out.println(r1.equals(r2)); //true
        System.out.println(r1.equals(r3)); //false
        System.out.println(r1.equalsIgnoreCase(r3)); //true

        System.out.println("************");

        //split
        String lang = "JAVA_PYTHON_RUBY_JS";
        String strLang[] = lang.split("_");
        for (int i = 0; i < strLang.length; i++) {
            System.out.println(strLang[i]);
        }
        System.out.println("************");
        System.out.println(Arrays.toString(strLang));
        System.out.println("************");

        String pop = "xXHelloXxXSeleniumxXTestingxXGoogleX";
        String pp[] = pop.split("xX");
        System.out.println(pp[0].length()); //this will give nothing
        System.out.println(pp[1]); //Hello
        System.out.println(pp[3]);  // AIOB
        System.out.println(pp[4]);

        System.out.println("************");
        System.out.println("naveen;automation;labs".split(";")[0]);  //naveen

        System.out.println("************");
        String otp = "your otp number is 12345";
        String otpArrray[] = otp.split(" ");
        System.out.println(otpArrray[otpArrray.length - 1]);

        String d[] = new String[2];
        d[0] = "test";
        d[1] = "pop";
        System.out.println(d[2]); //It will give AIOB

        


    }
}
