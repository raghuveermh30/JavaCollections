package javasessions;

public class TimeComplexity {

    public static void main(String[] args) {

        // TC --> Big O() --> Big O(n)

        int i = 1;
        System.out.println(i);
        // O(1) --> Constant Time


        for (int p = 1; p <= 10; p++) {
            System.out.println(p); // 1 to 10
        }

        /*
         *  How to calculate the Time Complexity
         *  1+n+n+n  --> n could be 10, 20, 30...
         * 3n+1 --> Linear Equation
         * 3n+1 --> 3n --> n --> O(n)
         * TC -->  for loop --> Big O(n)
         */

        // TC for While Loop
        int k = 1;
        while (k <= 10) {
            System.out.println(k); //1 to 10
            i++;
        }

        /*
         * 3n+1 --> 3n --> n
         * TC for while loop is Big O(n)
         * Same for do while loop as well
         */

            for (int m = 0; m <= 5; m++) {
            for (int n = 0; n <= 5; n++) {
                System.out.print((m + "" + n + " ")); //00 01 02 03 04 05
            }
            System.out.println();
        }

        /*
         * (1+n+n+n) -->Outer loop
         * (1+n+n+n) --> Inner Loop
         * (1+3n) (1+3n) --> 9n^2 + 6n + 1 --> Quadratic Equation
         * 9n^2 + 6n + 1 --> Remove constant Part --> 9n^2 + 6n
         * n(9n+6) --> n(n) --> n^2
         * Big O(n^2)
         */

        /*
         * O(Log(n))
         *
         * log n
         * n=32
         * n/2 = 16
         * n/4 = 4
         * n/8 = 2
         *
         * TC = n/k
         * log T = log (n/k)
         * log T = Logn - logk
         * Log T = 1-Logk
         * Log T = log k;
         * O(log n); --> Best example is Binary Search Algorithm
         */

    }
}
