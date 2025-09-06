package leetcodeprbs;

public class ContainerWithMostWater {

    //Problem: Given an integer array height of length n, find two lines that together with the x-axis form a container with the most water (area).

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1; // Two pointers
        int max = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]); // Height of container
            max = Math.max(max, h * (right - left)); // Area
            if (height[left] < height[right]) {
                left++; // Move shorter line inward
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        // Test case 1: Standard
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(height1)); // Expected: 49

        // Test case 2: Two lines
        int[] height2 = {1, 1};
        System.out.println(solution.maxArea(height2)); // Expected: 1

        // Test case 3: Increasing
        int[] height3 = {1, 2, 3, 4};
        System.out.println(solution.maxArea(height3)); // Expected: 4

        // Test case 4: All same
        int[] height4 = {5, 5, 5, 5};
        System.out.println(solution.maxArea(height4)); // Expected: 15

        // Test case 5: One line (edge case)
        int[] height5 = {1};
        System.out.println(solution.maxArea(height5)); // Expected: 0 (but n>=2 per problem)
    }


/*    Explanation: Use two pointers starting from ends. Calculate area, move the pointer with shorter height inward to potentially increase area. Greedy approach.
    Complexity: Time: O(n). Space: O(1).*/
}