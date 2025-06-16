package javasessions;

import javax.swing.*;

public class Loops {

    public static void main(String[] args) {

        //1 to 10
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(10);

        /**
         * Whenever we have repetative task, in that case we need to use links
         * In the applications, How many footer Links are there
         */

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
            //++i, i=i+1 --> We can add this as well
        }

        int k = 1;
        while (k >= 50) {
            System.out.println("Hello");
        }

        // 1 to 50
        int p = 1;
        while (p <= 50) {
            System.out.println(p);
            if (p == 5) {
                System.out.println("Bye!!");
                break;
            }
            p++;
        }

        //10 to 1
        int t = 10;
        while (t >= 1) {
            System.out.println(t);
            t--;
            //--t --> These are also we can use
            //t=t-1
        }

        //-10 to -1

        int u = -10;
        while (u <= -1) {
            System.out.println(u);
            u++;
        }

        System.out.println("For Loop");
        //2. For Loop
        //1-10
        for (int d = 1; d <= 10; d++) {
            System.out.println(d);
        }

        for (int d = 1; d <= 10; ) {
            System.out.println(d);
            d++; //This will also execute due to once condition is satisfied then it will execute
        }

        for (byte b = 1; b <= 10; b++) {
            System.out.println(b);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println((byte) c);
        }

        for (double d = 1.0; d <= 5; d++) {
            System.out.println(d);
        }

        /**
         * When to use while loop?
         * When Number of iterations are not fixed, then use while loop
         * Calendar Handling will be done in Selenium
         * Infinite scrolling on the applications like linkedin, Fb, intagram
         * Wait for Element on the Page: 5, 10, 15, 20, 25, 30 --> the moment the element will be appear then break the loop
         * Wait for Page Loading -> once my page will be available then break the loop
         * WebTable with the Pagination:
         * Carsoules: There is no fixed time to find the element in the ecommerce
         */

        /**
         * When to use For Loop?
         * When Number of Iterations are Fixed
         * Month Dropdown --> 1 to 12
         * Year DropDown --> 1990 to 2025
         * Country DropDown --> 233 countries are there
         * Arrays, ArrayList: for Loop
         * To check the footer Links
         * DropDown with the Fixed data
         * Movie tickets on BookMyshow: 120 seats
         */

       /* for (;;){
            System.out.println("welcome to Hotel Taj"); // this will give infinite loop, bcz condition is not there
        }*/

      /*  while (true){
            System.out.println("Welcome To Hotel Taj");
        }*/
        // int i=1 //deadcode or unreachable code

        for (int l = 0; l < 10; ) {
            l++;
            System.out.println(l);
        }

        int n = 1;
        while (true) {
            System.out.println(n);
            n++;
            if (n == 11) {
                break;
            }
        }
    }
}
