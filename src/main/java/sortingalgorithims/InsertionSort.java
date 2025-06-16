package sortingalgorithims;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1; //0
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

    }

    public static void main(String[] args) {

        int arr[] = {8, 2, 4, 1, 3, 2};
        insertionSort(arr);
        System.out.println("After Sorting the array "+ Arrays.toString(arr));
    }
}
