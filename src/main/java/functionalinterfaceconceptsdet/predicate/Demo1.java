package functionalinterfaceconceptsdet.predicate;

import java.util.function.Predicate;

public class Demo1 {

    /**
     * Predicate --> One Parameter --> return value will be boolean
     * use only if we have to check any conditional check in the program
     */

    public static void main(String[] args) {

        // Example 1
        Predicate<Integer> predicate = i -> (i > 10);

        System.out.println(predicate.test(20)); //true
        System.out.println(predicate.test(5)); //false
        System.out.println(predicate.test(10)); //false
        System.out.println("**************");

        // Example 2: check the length of String is greater than 4 or not
        Predicate<String> stringPredicate = i -> (i.length() > 4);
        System.out.println(stringPredicate.test("Raghu")); //true
        System.out.println(stringPredicate.test("abv")); //false
        System.out.println(stringPredicate.test("Welcome")); //welcome
        System.out.println("**************");

        //Example 3: Print Array elements whose size is greater than 4
        String[] names = {"David", "Raghu", "Tom", "Peter", "Steve", "obj"};
        for (String name : names) {
            if (stringPredicate.test(name)) {
                System.out.println(name);
            }
        }


    }
}
