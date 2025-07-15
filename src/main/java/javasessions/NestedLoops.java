package javasessions;

public class NestedLoops {

    public static void main(String[] args) {

        // Nested For Loops --> Outer and Inner Loop

        /*
         * 00 01 02 03 04 05
         * 10 11 12 13 14 15
         * 20 21 22 23 24 25
         * 30 31 32 33 34 35
         * 40 41 42 43 44 45
         * 50 51 52 53 54 55
         */

        // i --> 0 to 5 --> in Top to bottom
        // j --> 0 to 5 --> from Left to Right
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print((i + "" + j + " ")); //00 01 02 03 04 05
            }
            System.out.println();
        }

        /*
         * The out will be print in the form of Matrix
         * 6 * 6
         * The output will be form of m*n form
         * Suppose if we add the break in inner loop, then inner loop only break
         * If we write the break outer loop, then it will be applicable for both the loops
         */

        /*
         * Use Cases
         * Excel sheet in Rows and Column
         * WebTable in selenium
         * Select the Calendar value
         * Read the Json values
         */


    }
}
