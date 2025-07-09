package java8interviewquestions.streamconcept.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods4 {

    public static void main(String[] args) {

        //findAny()
        /* findAny() method is a terminal operation in the Stream API
         * used to retrieve an arbitrary element from a stream
         * It returns an Optional<T> describing some element of the stream, or an empty Optional if the stream is empty
         * It does not guarantee which element will be returned if the stream has multiple elements
         */

        System.out.println("****** Find Any **********");

        List<Integer> integersList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7, 5, 4, 6, 7, 7, 8, 4, 4, 3, 4, 5);
        Optional<Integer> integerOptional = integersList.stream().findAny();
        System.out.println(integerOptional.get());
        System.out.println("****************");
        //Suppose if its empty collection, then it will return NoSuchElementException
        List<Integer> integersList1 = Arrays.asList();
        //  int emptyValue = integersList1.stream().findAny().get();
        //  System.out.println(emptyValue); //NoSuchElementException

        List<String> stringList = Arrays.asList("A", "a", "B", "b", "c", "d", "12", "1", "2", "3");
        Optional<String> result = stringList.stream().findAny();
        result.ifPresent(s -> System.out.println(s)); // A or a or B or b or c or d or 12 or 1 or 2 or 3
        System.out.println("****************");
        String result1 = result.get();
        System.out.println(result1);

        //Parallel Stream
        Optional<String> result2 = stringList.parallelStream().findAny();
        result2.ifPresent(s -> System.out.println(s)); // A or a or B or b or c or d or 12 or 1 or 2 or 3
        System.out.println("****************");
        String result3 = result2.get();
        System.out.println(result3);

        //Empty Stream
        List<String> emptyList = Arrays.asList();
        emptyList.stream().findAny().ifPresent(System.out::println); // This will not print anything as the stream is empty

        System.out.println("****** Find First **********");

        /* findFirst() method is a terminal operation in the Stream API
         * used to retrieve the first element of a stream
         * It returns an Optional<T> describing the first element of the stream, or an empty Optional if the stream is empty
         * It guarantees that the first element will be returned if it exists
         * It stops processing as soon as it finds the first element, making it efficient for large or infinite streams.
         * Once findFirst() is called, the stream is consumed, and no further operations can be performed on it.
         * Commonly used with filter() to find the first element that satisfies a condition.
         */

        //findFirst()
        Optional<Integer> integerOptional1 = integersList.stream().findFirst();
        System.out.println(integerOptional1.get());

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        numbers.stream().filter(num -> num % 2 == 0)
                .findFirst()
                .ifPresent(num -> System.out.println("First even number: " + num)); // Output: First even number: 2

        // Parallel Stream
        numbers.parallelStream().filter(num -> num % 2 == 0).findFirst().ifPresent(System.out::println); // Output: 2 or 8 depending on the parallel execution

        // Empty Stream
        List<String> emptyStringList = Arrays.asList();
        emptyStringList.stream().findFirst().ifPresent(System.out::println); // This will not print anything as the stream is empty

    }
}
