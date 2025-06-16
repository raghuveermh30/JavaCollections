package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

    public static void main(String[] args) {

        /**
         * Represents an operation that accepts a single input argument and returns no result.
         * Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
         */

        Consumer<String> func = x -> System.out.println(x);
        func.accept("This is Naveen Here !!");

        List<Integer> intArryList = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9);
        intArryList.forEach(x -> System.out.println(x));

        intArryList.forEach(System.out::println);


    }
}
