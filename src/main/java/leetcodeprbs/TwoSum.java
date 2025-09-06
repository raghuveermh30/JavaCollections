package leetcodeprbs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*Problem: Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target. Assume exactly one solution.
    */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Store number to index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // Found pair
            }
            map.put(nums[i], i); // Add current
        }
        return null; // No solution (per assumption, won't happen)
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Test case 1: Standard
        int[] nums1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(solution.twoSum(nums1, 9))); // Expected: [0, 1]

        // Test case 2: Duplicates
        int[] nums2 = {3, 2, 3};
        System.out.println(Arrays.toString(solution.twoSum(nums2, 6))); // Expected: [0, 2]

        // Test case 3: Negative numbers
        int[] nums3 = {-1, -2, -3, 4};
        System.out.println(Arrays.toString(solution.twoSum(nums3, -5))); // Expected: [1, 2]

        // Test case 4: Zero target
        int[] nums4 = {0, 4, 3, 0};
        System.out.println(Arrays.toString(solution.twoSum(nums4, 0))); // Expected: [0, 3]

        // Test case 5: Large numbers (edge case)
        int[] nums5 = {Integer.MAX_VALUE, 1};
        System.out.println(Arrays.toString(solution.twoSum(nums5, Integer.MAX_VALUE + 1))); // Expected: [0, 1] (but overflow, assume valid)
    }

    /*Explanation: Use a hash map to store each number's index. For each number, check if its complement (target - num) exists in the map. If yes, return indices.
    This is efficient over brute-force.
    Complexity: Time: O(n) (single pass). Space: O(n) (map).*/
}