package java8interviewquestions.streamconcept.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {

        //distinct(), count(), limit()
        //distinct(), limit() --> Non Terminal Method
        //count(), forEach --> Terminal Method
        List<Integer> integersList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7, 5, 4, 6, 7, 7, 8, 4, 4, 3, 4, 5);
        List<Integer> distinctList = integersList.stream().distinct().collect(Collectors.toList());
        distinctList.forEach(s -> System.out.println(s));
        System.out.println("*******************");
        integersList.stream().collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("*******************");
        integersList.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println("*******************");

        //count()
        long count = integersList.stream().count();
        System.out.println(count);
        long count1 = integersList.stream().distinct().count();
        System.out.println(count1);
        long count2 = integersList.stream().collect(Collectors.toSet()).stream().count();
        System.out.println(count2);
        System.out.println("*******************");

        //limit()
        List<Integer> list = integersList.stream().limit(4).collect(Collectors.toList());
        list.forEach(s -> System.out.println(s));
        System.out.println("*******************");

        //cont()
        List<Integer> evenNumList = integersList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        evenNumList.forEach(s -> System.out.println(s));
        System.out.println("Even number count are in the list is " + evenNumList.stream().count());
        System.out.println("*******************");

        List<Integer> oddNumList = integersList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        oddNumList.forEach(s -> System.out.println(s));
        System.out.println("Odd number count are in the list is " + oddNumList.stream().count());
        System.out.println("*******************");

        //min()
        int minValue = integersList.stream().min((val1, val2) -> val1.compareTo(val2)).get();
        System.out.println("Minimum Value : "+minValue);

        //max()
        int maxValue = integersList.stream().max((val1, val2) -> val1.compareTo(val2)).get();
        System.out.println("Maximum Value : "+maxValue);
        System.out.println("*******************");

        //reduce() -> reduce() operation in Streams is used to combine elements of a stream into a single result by applying a binary operation
        List<String> stringList = Arrays.asList("A", "a", "B", "b", "c", "d", "12", "1", "2", "3");
        Optional<String> reduced = stringList.stream().reduce((value, combinedValue) -> combinedValue + value);
        String reducuedString = reduced.get();
        System.out.println(reducuedString);
        System.out.println("*******************");

        Object arrp[] = stringList.stream().toArray();
        for (int i = 0; i < arrp.length; i++) {
            System.out.println(arrp[i]);
        }
    }
}
