package linkedintests;

public class RearrangeArray {

    //Rearrange Array (Even First, Odd Last) — Two Pointer

    //Logic: Left pointer seeks an odd number, right pointer seeks an even number; swap them.

    int[] arr = {2, 0, 4, 0, 3, 0, 5, 0};

    int left = 0;
    int right = arr.length - 1;

    public void rearrangeArray() {
        while (left < right) {
            // Move left pointer until it finds an odd number
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            // Move right pointer until it finds an even number
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            // Swap the odd number at left with the even number at right
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        RearrangeArray rearrangeArray = new RearrangeArray();
        rearrangeArray.rearrangeArray();
        for (int num : rearrangeArray.arr) {
            System.out.print(num + " ");
        }
    }
}
