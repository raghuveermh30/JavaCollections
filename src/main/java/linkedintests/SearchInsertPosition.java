package linkedintests;

public class SearchInsertPosition {

    //Logic: Binary search — if target found, return its index. If not, return where it would be inserted.

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return left; // Target not found, return insertion point
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(arr, target)); // Output: 2
    }
}
