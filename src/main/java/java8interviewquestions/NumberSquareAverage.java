package java8interviewquestions;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 10, 20, 30, 15);

        //1 100 400 900 225
        //100 900 225 --> pick only from >100

        double average = list.stream().map(e -> e * e)
                .filter(e -> e > 100)
                .mapToInt(e -> e).average().getAsDouble();
        System.out.println(average);
    }
}
