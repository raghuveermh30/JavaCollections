package java8interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 63, 4, 5, 6, 7,11, 2, 34, 56, 7, 7, 2, 23, 4, 6, 45, 3);
        Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
        System.out.println("Sum of all the numbers is " + sum.get());


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum1 = list1.stream().reduce((a, b) -> a + b);
        System.out.println("Sum of all the numbers is " + sum1.get());
    }
}
