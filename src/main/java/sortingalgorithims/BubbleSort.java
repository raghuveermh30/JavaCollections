package sortingalgorithims;

import java.util.Arrays;

public class BubbleSort {


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {20, 23, 45, 67, 10, 10, 1, 13, -40, -10, -1, 0, 67, 89, 9, 6, 13, 16};
        System.out.println("Before Sorting " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting " + Arrays.toString(arr));
    }

    //Bubble Sort has a time complexity of O(n²) in worst and average cases, and O(n) in the best case
}
