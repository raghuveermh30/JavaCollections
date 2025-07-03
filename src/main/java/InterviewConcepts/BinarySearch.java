package InterviewConcepts;

import java.util.Scanner;

public class BinarySearch {
    // Optimized binary search for sorted array (ascending order)
    public static int binarySearch(int[] arr, int element, int low, int high) {
        if (arr == null || arr.length == 0) return -1; // Handle null or empty array

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid integer overflow
            if (arr[mid] == element) return mid;
            if (arr[mid] < element) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9}; // Sorted array
        int element = 6; // Hardcoded element to search

        int result = binarySearch(arr, element, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("Element " + element + " not found.");
        } else {
            System.out.println("Element " + element + " found at index " + result);
        }
    }
}
