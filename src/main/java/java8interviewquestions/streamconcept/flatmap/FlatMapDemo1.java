package java8interviewquestions.streamconcept.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {

    public static void main(String[] args) {

        List<Integer> integersList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7, 5, 4, 6, 7, 7, 8, 4, 4, 3, 4, 5);
        //map operation
        List<Integer> result1 = integersList.stream().map(n -> n + 10).collect(Collectors.toList());
        result1.forEach(s -> System.out.println(s));
        System.out.println("********************");

        //flatMap Operation
        List<Integer> integersList1 = Arrays.asList(1, 2);
        List<Integer> integersList2 = Arrays.asList(3, 4);
        List<Integer> integersList3 = Arrays.asList(5, 6);

        List<List<Integer>> finalList = Arrays.asList(integersList1, integersList2, integersList3);
        List<Integer> finalListInt = finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        finalListInt.forEach(s -> System.out.println(s));
        System.out.println("******************");

        List<Integer> finalListInt1 = finalList.stream().flatMap(x -> x.stream().map(n -> n + 2)).collect(Collectors.toList());
        finalListInt1.forEach(s -> System.out.println(s));
        System.out.println("******************");

        List<Integer> finalListInt2 = finalList.stream().flatMap(x -> x.stream().map(n -> n + 2).filter(n -> n % 2 == 0)).collect(Collectors.toList());
        finalListInt2.forEach(s -> System.out.println(s));
    }
}

