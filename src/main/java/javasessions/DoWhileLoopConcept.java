package javasessions;

public class DoWhileLoopConcept {

    public static void main(String[] args) {

        /*
         * Do-While Loop
         * 1. The do-while loop is a control flow statement that executes a block of code at least once,
         *    and then repeats the execution as long as a specified condition evaluates to true.
         * 2. The key difference between a while loop and a do-while loop is that the do-while loop guarantees
         *    that the code block will be executed at least once, even if the condition is false on the first check.
         */

        // 1 - 10
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10);

        System.out.println("*********");
        /*
         *  Use-Cases of Do-While Loop
         *  Wait for the Element
         *  In the Do while loop there is no body
         *
         */

        int j = 1;
        do {
            j++;
            System.out.println(j);
            if (j == 7) {
                System.out.println("Hello");
            }
        }
        while (j <= 10);

        System.out.println("*********");
        int p = 10;
        do {
            System.out.println(p);
            p--;
        }
        while (p >= 0);
        // while (true); --> This will give infinte loop

        System.out.println("Printing even numbers");
        for (int k = 0; k <= 100; k++) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }

        System.out.println("Printing Odd numbers");
        for (int k = 0; k <= 100; k++) {
            if (k % 2 == 1) {
                System.out.println(k);
            }
        }

        System.out.println("************");

    }
}
