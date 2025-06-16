package functionalinterfaceconceptsdet.predicate;

import java.util.function.Predicate;

public class Demo3 {


    public static void main(String[] args) {

        /**
         * Joining the Predicate using and, or & negate methods
         * p1 -> checks the number is even
         * p2 -> checks the number is > 10 or not
         */

        int arr[] = {2, 3, 5, 6, 7, 8, 9, 10, 15, 20, 25, 22, 24, 26, 28, 4};

        Predicate<Integer> p1 = (e -> e % 2 == 0);
        Predicate<Integer> p2 = (e -> e > 10);

        //Join 2 predicate using and method
        for (int i : arr) {
            //  if (p1.test(i) && p2.test(i))
            if (p1.and(p2).test(i)) {
                System.out.println(i);
            }
        }
        System.out.println("*************");

        //Join 2 predicate using or method
        for (int i : arr) {
            //  if (p1.test(i) || p2.test(i))
            if (p1.or(p2).test(i)) {
                System.out.println(i);
            }
        }

        System.out.println("*************");
        //Join 2 predicate using negate method
        for (int i : arr) {
            //  if (p1.test(i) || p2.test(i))
            if (p1.negate().test(i)) {
                System.out.println(i);
            }
        }

    }
}
