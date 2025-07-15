package javasessions;

import java.util.Arrays;

public class ArraysConcept {

    public static void main(String[] args) {

        /*
         * Arrays is set of Data
         * Arrays will store the similar type of data
         * Array will be allocating the continous memory allocation
         *
         * 1. Static Array: Size is Fixed
         * 2. Dynamic Array: Dynamic Size, Size is not fixed: ArrayList, Set, HashMap
         *
         * Size example --> 1000, 1004, 1008, 1013 for 4 values in the array
         *
         * Length is the variable and this will give the size of the Array
         * Arrays Performance is very High due to size is fixed and retrival will be very fast due to continous memory allcoation
         * If the size of the values are fixed, better to go with the Array
         *
         * Arrays is the class, toString is the static method
         *
         * Arrays.toString will print all the values of the array
         */

        /*
         * Two Major Limitations
         * 1. Size is Fixed
         * 2. Can Store similar data types: To Overcome this, we need to use Object Array but still it is a Static Array
         *
         * To Over cover Size is fixed, We need to use Array List
         * Instead of Static Array, We need to use Dynamic Array --> ArrayList, HashMap
         *
         * Examples of Static Array
         * Flight Booking Size = 200
         * Movie Tickets =200
         * Month Dropdown= 12
         * Country Dropdown = 233
         * Restorants in Swiggy --> Its a Dynamic Array
         *
         * In Static Array, we can loose the data
         */

        //1. Using new Keyword
        int[] a = new int[4];
        System.out.println(a[0]); //0 --> This will give 0 --> This is the default value of the Integer
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[3]);

        /*
         System.out.println(a[-1]); //Array Index OutofBound Exception
        System.out.println(a[4]); //Array Index OutofBound Exception
        */

        System.out.println("Lowest Index is " + 0);
        int len = a.length; //length is the variable
        System.out.println("Length or Size of Array " + len);
        System.out.println("Highest Index = " + (len - 1));

        // To Print all the values of array: Use loop

        for (int i = 0; i <= len - 1; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i <= len; i++) {
            //   System.out.println(a[i]); // this will print all the values, and it will give Array Index OutOfBound Exception
        }

   /*     for (int i =0; i<=len;i++){
            System.out.println(a[i]);
        }
*/

        //without for loop, want to print all the values of array

        System.out.println("********");
        System.out.println(Arrays.toString(a));

        int p[] = new int[3];
        p[1] = 100;
        p[2] = 200;
        p[0] = 'a'; //97
        System.out.println(p[1]); //100
        System.out.println(p[0]); //97
        /*
       The maximum value is 2 --> p[2]
        System.out.println(p[3]); // ArrayIndexOutOfBoundexception
        System.out.println(p[2]); // ArrayIndexOutOfBoundexception
      */

        // int p[] = new int[-4]; // This will give negativeIndexOutofBoundException

        int q[] = new int[4]; //this can be used when number of data is constant
        //Array Literals - We will use that we are not aware of number of values stored
        int num[] = {10, 20, 30, 40, 50};
        //System.out.println("********");
        System.out.println(num[0]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(Arrays.toString(num));
        num[0] = 400; //Here In Static Array, we can loosing the data, updating the other value
        System.out.println(Arrays.toString(num));
        System.out.println("********");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        String browser[] = {"Chrome", "firefox", "IE", "Edge"};
        int len1 = browser.length;
        System.out.println("********");
        System.out.println("Size of the Array : "+len1);
        System.out.println("********");
        for (String str: browser){
            System.out.println(str);
        }
    }
}
