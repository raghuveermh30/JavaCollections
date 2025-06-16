package java8interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 63, 4, 5, 6, 7, 11, 2, 34, 56, 7, 7, 2, 23, 4, 6, 45, 3);
        List<Integer> evenNumbers = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers from the list " + evenNumbers);

        List<Integer> oddNumbers = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd Numbers from the list " + oddNumbers);

    }
}
