package leetcodeprbs;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    /*Problem: Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.*/

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // Prefix sum to frequency
        map.put(0, 1); // Base case for sum == k
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num; // Current prefix sum
            count += map.getOrDefault(sum - k, 0); // Add frequency of (sum - k)
            map.put(sum, map.getOrDefault(sum, 0) + 1); // Update frequency
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK solution = new SubarraySumEqualsK();

        // Test case 1: Standard
        int[] nums1 = {1, 1, 1};
        System.out.println(solution.subarraySum(nums1, 2)); // Expected: 2

        // Test case 2: Negatives
        int[] nums2 = {1, 2, 3, -3, 3};
        System.out.println(solution.subarraySum(nums2, 3)); // Expected: 3

        // Test case 3: Zero sum
        int[] nums3 = {0, 0, 0};
        System.out.println(solution.subarraySum(nums3, 0)); // Expected: 6

        // Test case 4: No subarray
        int[] nums4 = {1, 2, 3};
        System.out.println(solution.subarraySum(nums4, 7)); // Expected: 0

        // Test case 5: Single element
        int[] nums5 = {5};
        System.out.println(solution.subarraySum(nums5, 5)); // Expected: 1
    }

   /* Explanation: Use prefix sums and a map to count how many times (current sum - k) has occurred.
    This finds subarrays efficiently without nested loops.

    Complexity: Time: O(n). Space: O(n).*/
}
