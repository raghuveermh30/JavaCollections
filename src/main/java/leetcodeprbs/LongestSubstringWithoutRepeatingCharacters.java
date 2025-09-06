package leetcodeprbs;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    //Problem: Given a string s, find the length of the longest substring without repeating characters.

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(); // Track unique chars in window
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left)); // Shrink from left
//                left++;
            }
            set.add(s.charAt(right)); // Add right
            max = Math.max(max, right - left + 1); // Update max
        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        // Test case 1: Standard
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // Expected: 3 ("abc")

        // Test case 2: All unique
        System.out.println(solution.lengthOfLongestSubstring("abcde")); // Expected: 5

        // Test case 3: All repeats
        System.out.println(solution.lengthOfLongestSubstring("bbbbb")); // Expected: 1

        // Test case 4: Empty string
        System.out.println(solution.lengthOfLongestSubstring("")); // Expected: 0

        // Test case 5: Mixed
        System.out.println(solution.lengthOfLongestSubstring("pwwkew")); // Expected: 3 ("wke")
    }

 /*   Explanation: Use a sliding window with a set for unique characters. Move the left pointer when a repeat is found.
    Track the max window size.
    Complexity: Time: O(n) (each char visited at most twice). Space: O(min(n, charset)) (set).*/


}