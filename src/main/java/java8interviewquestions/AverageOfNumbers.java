package java8interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double average = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(average);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 63, 4, 5, 6, 711, 2, 34, 56, 7, 7, 2, 23, 4, 6, 45, 3);
        double average1 = list1.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(average1);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, -2, -3, 4, -8);
        double average2 = list2.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(average2);

    }
}
