package dataconversion;

import java.util.Arrays;

public class DataConvert {

    public static void main(String[] args) {

        /*
         * Wrapper Class --> conversion of Data Members
         * All the Wrapper classes are Immutable
         * Whenever we are comparing non-primitive then we need to use equals method
         * == will be used for primitive data type
         * No Need to create the constructor for wrapper class from Java 9
         * All the wrapper classes are final in nature
         */

        String x = "100";
        System.out.println(x + 20); //10020

        //Convert String to Integer
        int i = Integer.parseInt(x);
        System.out.println(i + 20); //120

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println("**********");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        String y = "100A";
        //  int j = Integer.parseInt(y);
        //  System.out.println(j); //java.lang.NumberFormatException

        int k = Integer.parseInt(y.replace("A", ""));
        System.out.println(k + 20);

        String p = "a";
        // System.out.println(Integer.parseInt(p)); //NumberFormatException

        //String to Integer
        String totalPrice = "1000";
        int price = Integer.parseInt(totalPrice);
        System.out.println(price);
        System.out.println(price - 100);

        //String to Double
        String str1 = "100.33";
        System.out.println(str1 + 20); //100.3320
        double d = Double.parseDouble(str1);
        System.out.println(d + 20);

        //int to String
        int h = 100;
        String t = String.valueOf(100);
        System.out.println(t + 20); //10020

        //double to String
        double marks = 200.33;
        String str2 = String.valueOf(marks);
        System.out.println(str2 + 20); //200.3320

        char ch = 'A';
        String str3 = String.valueOf(ch);
        System.out.println(str3 + 20); //A20

        //String to Boolean
        String str4 = "true";
        boolean flag = Boolean.valueOf(str4); //true
        System.out.println(flag);

        if (flag) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        String str5 = "TRUE";
        boolean flag1 = Boolean.valueOf(str5); //true
        System.out.println(flag1);

        boolean gr = true;
        String yr = String.valueOf(gr);
        System.out.println(yr);
        System.out.println(yr + 20);

        char td[] = {'J', 'A', 'V', 'A'};
        String td1 = String.valueOf(td);
        System.out.println(td1);

        Integer v = 100;
        Integer v2 = 100;

        /*if (v==v2){
            System.out.println("hi");
        }*/
        if (v.equals(v2)) {
            System.out.println("Hello");
        }

        System.out.println(v + 20); //120
        int v1 = v.intValue();
        System.out.println(v1); //100

        String rest = "I love \"Java\" code and \"selenium\" programming"; //I love "java" code
        String rest1 = "I love \"Java\" code and \"Selenium\" Programming";
        System.out.println(rest);
        System.out.println(rest1);

        String xpath = "//input[@name=\"naveen\"]";
        System.out.println(xpath);

        String data = "Vibha;Srivastava;9797;Pune;India";
        String info[] = data.split(";");
        System.out.println(Arrays.toString(info));

        String data1 = "Vibha.Srivastava.9797.Pune.India";
        String info1[] = data1.split("\\.");
        System.out.println(Arrays.toString(info1));

        String data2 = "Vibha|Srivastava|9797|Pune|India";
        String info2[] = data2.split("\\|");
        System.out.println(Arrays.toString(info2));

        String p1 = "testing";
        String p2 = "testing";
        System.out.println("Compare Function in String : " +p2.compareTo(p1)); // This will give the actually Integer

        int l1 = 07; //Octal Number
        System.out.println(l1);

        int l2 = 053; // the number starting with 0 is Octal Number: base 8
        System.out.println(l2); //43
        //053 = (0 × 8²) + (5 × 8¹) + (3 × 8⁰) = 43
        // Every digit in the octal number should be less than 8 meaning it should be 0-7 for octal number

    }
}
