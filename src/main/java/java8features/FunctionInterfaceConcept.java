package java8features;

import java.util.function.Function;

public class FunctionInterfaceConcept {

    public static void main(String[] args) {

        /**
         * Interface Function<T,R>
         * Type Parameters:
         * T - the type of the input to the function
         * R - the type of the result of the function
         *
         */

        Function<String, Integer> func1 = x -> x.length();
        int len = func1.apply("This is Java 8");
        System.out.println(len);

        //chaining
        Function<Integer, Integer> func2 = x -> x * 2;
        int result = func1.andThen(func2).apply("This is naveen here");
        System.out.println(result);




    }
}