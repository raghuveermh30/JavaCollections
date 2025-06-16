package java8interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 22, 222, 233, 211, 266, 244, 255, 6, 711, 2, 34, 56, 7, 7, 2, 23, 4, 6, 45, 3);
        List<Integer> numWith2List = list.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2")).map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(numWith2List);


    }
}
