package java8interviewquestions;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 2, 211, 2, 244, 4, 6, 45, 2, 3, 56, 7, 7, 2, 23, 4, 6, 45, 3);
        Set<Integer> duplicate = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println(duplicate);


        //Using Set operations
        Set<Integer> duplicateNum = new HashSet<>();
        Set<Integer> duplicate1 = list.stream().filter(e -> !duplicateNum.add(e)).collect(Collectors.toSet());
        System.out.println(duplicate1);
        System.out.println("***********");

        //Min and Max Number
        int maxNum = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Maximum Number in the list " + maxNum);


        int minNum = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Minimum Number in the list " + minNum);
        System.out.println("***********");

        //Sort the given list in ASC and DESC
        List<Integer> ascList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending Order " + ascList);

        List<Integer> descList = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Descending Order " + descList);
        System.out.println("***********");

        //limit
        //get first 5 elements in the list and get the sum of them
        List<Integer> lmitList = list.stream().limit(5).collect(Collectors.toList());
        System.out.println("Getting only first 5 numbers " + lmitList);
        int sum1 = list.stream().limit(5).reduce((p, q) -> p + q).get();
        System.out.println("Getting the sum of only first 5 numbers" + sum1);
        System.out.println("***********");

        //skip
        //get first 5 elements in the list and get the sum of them
        List<Integer> skList = list.stream().skip(5).collect(Collectors.toList());
        System.out.println("Skipping only first 5 numbers " + skList);
        int sum2 = skList.stream().skip(5).reduce((p, q) -> p + q).get();
        System.out.println("Skipping the sum of only first 5 numbers" + sum2);
        System.out.println(sum2);
        System.out.println("***********");

        //Second Lowest and Highest Number in the list
        int secondHighestNum = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("Second Highest Number is " + secondHighestNum);

        int lowestLowestNum = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second Lowest Number is " + lowestLowestNum);

    }
}
