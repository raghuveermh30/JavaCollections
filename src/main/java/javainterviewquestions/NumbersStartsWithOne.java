package javainterviewquestions;

import InterviewConcepts.LinearSearch;

import java.util.ArrayList;
import java.util.List;

public class NumbersStartsWithOne {

    public static void main(String[] args) {

        int arr[] = {1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};

        getNumberList(arr).forEach(System.out::println);
    }

    public static List<Integer> getNumberList(int[] arr) {
        List<Integer> numbers = new ArrayList<>();

        for (int num : arr) {
            int num1 = getFirstDigit(num);
            if (num1 == 1) {
                numbers.add(num);
            }

        }
        return numbers;
    }

    public static int getFirstDigit(int num) {
        while (num >= 10) {
            num /= 10;
        }
        return num;
    }
}
