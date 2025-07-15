package sortingalgorithims;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int arr[]) {

        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            // Find the minimum element in unsorted portion
            int min_index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j; //Searching for lowest element in the loop
                }
            }
            // Swap the found minimum element with the first element of unsorted portion
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

    /*
     * How it works:
     * The algorithm divides the array into sorted and unsorted portions.
     * It repeatedly finds the minimum element from the unsorted portion.
     * Swaps it with the first element of the unsorted portion.
     * The sorted portion grows from left to right.
     * Time Complexity: O(n²) in all cases
     * Space Complexity: O(1) as it's an in-place sorting algorithm
     */
}

