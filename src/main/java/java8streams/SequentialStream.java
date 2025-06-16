package java8streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream {

    public static void main(String[] args) {

        /**
         * Once stream is used and closed,then we cannot be used the same stream again, we will get IllegalException
         *
         */

        //1.
        Stream<String> seqStream = Stream.of("Naveen", "Tom", "Selvin");
        seqStream.forEach(x -> System.out.println(x));
        System.out.println("**************");

        //2.
        Arrays.asList("a1", "a2", "a3", "b1", "b2", "b3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("**************");

        //3. Range 1 to 5:
        IntStream.range(1,11).forEach(System.out::println);
        System.out.println("**************");

        //4. any calculations
        Arrays.stream(new int[] {1,2,3,4,5})
                .map(n -> 2*n+1)
                .average()
                .ifPresent(System.out::println);
        System.out.println("**************");

        //5. String Objects --> get the maximum number in the given array
        Stream.of("a1", "a2", "a3", "a111")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
        System.out.println("**************");

        //6. Double to String Objects --> a1, a2, a3
        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a"+i)
                .forEach(System.out::println);
        System.out.println("**************");

        //7. Limit function
        Stream.iterate(0, n->n+1).limit(10).forEach(x -> System.out.println(x));
        System.out.println("**************");

        //8. Odd numbers --> 10 odd numbers
        Stream.iterate(0, n -> n+1).filter(x -> x%2!=0).limit(10).forEach(System.out::println);
        System.out.println("**************");

        //9. Even numbers --> 10 odd numbers
        Stream.iterate(0, n -> n+1).filter(x -> x%2==0).limit(10).forEach(System.out::println);
    }

}
