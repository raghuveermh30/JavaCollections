package sortingalgorithims;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int arr[]) {

        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int min_index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j; //Searching for lowest element in the loop
                }
            }
            int lowest_number = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = lowest_number;

        }
    }

    public static void main(String[] args) {

        int arr[] = {8, 2, 4, 1, 3, 2, 0, -1, -1, 3, 4, -8, 11};
        selectionSort(arr);
        System.out.println("After Sorting the array " + Arrays.toString(arr));
    }
}

