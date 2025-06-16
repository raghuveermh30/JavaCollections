package java8interviewquestions.streamconcept.streammethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMethods2 {

    public static void main(String[] args) {

        //sorted
        List<Integer> integersList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7, 5, 4, 6, 7, 7, 8, 4, 4, 3, 4, 5);
        List<Integer> ascList = integersList.stream().sorted().collect(Collectors.toList());
        ascList.forEach(s -> System.out.println(s));
        System.out.println("**********************");

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


    }
}
