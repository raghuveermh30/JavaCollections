package javasessions;

public class StringConcatination {

    public static void main(String[] args) {

        /**
         * String is a Class, Its a non-premetive data type
         * String is a default class
         *
         *
         */

        String name = "Naveen";
        String num = "1000";
        String x = "Hello";
        String y = "Selenium";

        int a = 100;
        int b = 200;

        double c = 12.33;
        double d = 12.44;

        System.out.println(a + b); //300
        System.out.println(x + y); //HelloSelenium
        System.out.println(x + a); //Hello100 --> concatenation operator
        System.out.println(x + a + y + b); //Hello100Selenium200
        System.out.println(a + b + x + y); //300HelloSelenium
        System.out.println(x + y + a + b); //HelloSelenium100200
        System.out.println(a + b + x + y + a + b); // 300HelloSelenium100200
        System.out.println(x + y + (a + b)); //HelloSelenium300
        System.out.println(a + b + x + y + a + b + c + d);//300HelloSelenium10020012.3312.44
        System.out.println(a + b + x + y + (a + b + c + d)); //300HelloSelenium324.77
        System.out.println(a + b + c + d + x + y); //324.77HelloSelenium

        System.out.println("the value of a " + a);
        System.out.println("the value of b " + b);
        System.out.println("the sum of a and b " + (a + b));

        char ch = 'a';
        String str = "Selenium";
        System.out.println(str + ch);

        // String can be contactinated with any data type

        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1); //a
        System.out.println(c2); //b
        System.out.println(c1 + c2); // It will give the ASCII value
        System.out.println(c2 - c1); // 1

        // Range
        // a-z --> 97 to 122 for lower case
        // A-Z --> 65 to 90 for upper case
        // 0-9 --> 48 to 57 for number 0 to 9

        System.out.println('A' + 'B'); //131

        // Characters are behaving like numeric data type

        System.out.println(c1 + c2 + '0' + 'A'); //308

        System.out.println(str + c1 + c2); //Seleniumab
        System.out.println(str + (c1 + c2)); //Selenium195

        System.out.println((byte) c1); // Get the Ascii value of 'a'
        System.out.println((byte) '$'); // Get the Ascii value of '$'
        System.out.println((int) c1); // Get the Ascii value of 'a'

        char ct = '*';
        System.out.println((byte) ct); // Get the Ascii value of '*'
        System.out.println('*');
        System.out.println('a' + 0); //97
        System.out.println('$' + 0); //36
        System.out.println('a' + 10 + 20 - 10); //117

        System.out.println("Naveen" + 'm'); //Naveenm

        System.out.println('a' + 'c' + '0' + '9' + 'A' + "Hello" + 'a' + 'b');//366Helloab

        boolean flag = true;
        System.out.println(flag);

        String u = "yes";
        System.out.println(flag + u); //trueyes

        System.out.println("a" + "b"); //ab
        System.out.println('a'+'b'); //195

    }
}
