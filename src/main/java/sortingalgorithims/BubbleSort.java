package sortingalgorithims;

import java.util.Arrays;

public class BubbleSort {


    public static void bubbleSort(int arr[]) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    //Swap the variables
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {20, 23, 45, 67, 10, 10, 1, 13, -40, -10, -1, 0, 67, 89, 9, 6, 13, 16};
        System.out.println("Before Sorting " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting " + Arrays.toString(arr));
    }
}
