package functionalinterfaceconceptsdet.function;

import java.util.function.Function;

public class Demo1 {

    public static void main(String[] args) {

        Function<Integer, Integer> function = n -> (n * n);
        System.out.println(function.apply(5));
        System.out.println(function.apply(10));
        System.out.println(function.apply(12));
        System.out.println(function.apply(13));
        System.out.println("**************");

        //Length of the String
        Function<String, Integer> function1 = s -> (s.length());
        System.out.println(function1.apply("Raghu"));
        System.out.println(function1.apply("Naveen"));
        System.out.println(function1.apply("Tom"));
        System.out.println(function1.apply("Peter"));
        System.out.println("**************");


    }
}
