package stringmanipulation;

public class StringCompare {

    public static void main(String[] args) {

        /**
         * s1.equals(s2) --> this will check only the content
         * s1 == s2 --> this will check the reference
         *
         *
         */

        String s1 = "Hello Selenium"; //String literals
        String s2 = new String("Hello Selenium"); ////String new Keyword
        String s3 = "Hello Selenium";

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        System.out.println(s1 == s3); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s2==s3); //false

        String s4 = "Hello selenium";
        String str = new String("testing");


        /**
         *  This will create the 2 objects one is in Heap and one is in SCP location but the refernce will be in Heap memory
         *  String is the most common data type will be used in the application. Hence spl features has given.
         *  In the application, most of the features will be declared in the String.
         *
         *  SCP has given by java ppl due to Memory Optimization
         */

        String str1 = "testing"; //since already testing will be present int he scp, hence it won;t create the another object in the scp
        String str2 = "Testing"; //scp -1 , in above example scp =0

        String t1 = "hello";
        System.out.println(t1.concat("automation")); //helloautomation
        System.out.println(t1); //hello -> reason is Strings are immutable


        /**
         * Strings are immutable. Once Strings are created it cannot be changed
         *
         *
         */


        System.out.println(t1.concat("automation")); //helloautomation
        System.out.println(t1); //hello -> reason is Strings are immutable
        String t2 = "helloautomation"; // No objects are created
        System.out.println(t2);
        t1 = t1.concat("automation");
        System.out.println(t1.equals(t2)); //true

        String t3 = new String("cypress"); //2 objects will be created --> HEAP +SCP










    }
}
