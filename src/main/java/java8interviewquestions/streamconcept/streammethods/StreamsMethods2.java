package java8interviewquestions.streamconcept.streammethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMethods2 {

    public static void main(String[] args) {

        /* sorted() method is part of the Stream API, introduced in Java 8, and is used to sort elements in a stream
         * It is an intermediate operation that returns a new stream with elements sorted in their natural order or according to a provided comparator
         *
         */

        //sorted --> Sorting in Natural Order
        List<Integer> integersList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7, 5, 4, 6, 7, 7, 8, 4, 4, 3, 4, 5);
        List<Integer> ascList = integersList.stream().sorted().collect(Collectors.toList());
        ascList.forEach(s -> System.out.println(s));
        System.out.println("**********************");

        //sorted --> Sorting in Descending Order --> Sorting with a Custom Comparator
        List<Integer> descList = integersList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        descList.forEach(System.out::println);
        System.out.println("**********************");

        List<String> vehicleList = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        List<String> stringList = vehicleList.stream().sorted().collect(Collectors.toList());
        stringList.forEach(s -> System.out.println(s));
        System.out.println("**********************");

        List<String> vehicleList2 = vehicleList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        vehicleList2.forEach(s -> System.out.println(s));
        System.out.println("**********************");

        /* Key Concepts of sorted() in Java Streams
         * 1. Intermediate Operation: sorted() is an intermediate operation, meaning it returns a new stream and does not modify the original stream.
         * 2. Natural Order: By default, sorted() sorts elements in their natural order (ascending order for numbers and lexicographical order for strings).
         * 3. Custom Comparator: You can provide a custom comparator to sort elements in a specific order, such as descending order or based on specific criteria.
         * 4. Stability: The sorted() operation is stable, meaning that if two elements are equal, their relative order in the original stream is preserved in the sorted stream.
         * 5. Performance: Sorting can be computationally expensive, especially for large streams, so it's important to consider performance implications when using sorted().
         * 6. Terminal Operation: sorted() is not a terminal operation; it can be followed by other stream operations like filter(), map(), or collect().
         */

        List<Person> personList = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        //sortedByAge
        List<Person> sortedByAge = personList.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
        sortedByAge.stream().forEach(System.out::println);

        List<Person> sortedByAge1 = personList.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).collect(Collectors.toList());
        sortedByAge1.stream().forEach(System.out::println);

        //sortedBylength
        List<String> namesList = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> sortByLength = namesList.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        sortByLength.forEach(System.out::println);

        List<String> sortByLength1 = namesList.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).collect(Collectors.toList());
        sortByLength1.forEach(System.out::println);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
