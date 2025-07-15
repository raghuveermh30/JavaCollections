package sortingalgorithims;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int arr[]) {

        // Start from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; // Element to be inserted
            int j = i - 1; //0 // Index of last element in sorted portion

            // Move elements of arr[0..i-1] that are greater than current
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current; // Place key in its correct position
        }

    }

    public static void main(String[] args) {

        int arr[] = {8, 2, 4, 1, 3, 2};
        insertionSort(arr);
        System.out.println("After Sorting the array "+ Arrays.toString(arr));
    }

    /*
     *This implementation:
     *
     * Takes an array of integers as input
     * Iterates through the array starting from the second element
     * For each element (current), compares it with previous elements
     * Shifts larger elements one position ahead
     * Inserts the key in its correct position
     * Time complexity: O(n²) in worst and average cases, O(n) in best case
     * Space complexity: O(1) as it's an in-place sorting algorithm
     *
     */
}
