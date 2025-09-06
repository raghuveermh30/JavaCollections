package linkedintests;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MergeArrays {

    public static void main(String[] args) {

        int[] arr1 = {5, 3, 2};
        int[] arr2 = {9, 0, 1};

        // Merge two arrays and sort in descending order
        IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        System.out.println("*****************");

        IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().forEach(System.out::println);
    }
}
