package leetcodeprbs;

public class LongestPalindromicSubstring {

   /* 2. Longest Palindromic Substring
    Problem: Given a string s, return the longest palindromic substring in s. A palindrome reads the same forwards and backwards.
*/

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";

        int start = 0, maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            // Check for odd length palindromes (single character center)
            int len1 = expandAroundCenter(s, i, i);
            // Check for even length palindromes (between two characters)
            int len2 = expandAroundCenter(s, i, i + 1);
            // Get the maximum length from both cases
            int len = Math.max(len1, len2);

            // Update result if we found a longer palindrome
            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLength);
    }

    private int expandAroundCenter(String s, int left, int right) {
        // Expand while within bounds and characters match
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return length of palindrome
        return right - left - 1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

        // Test case 1: Standard with multiple options
        System.out.println(solution.longestPalindrome("babad")); // Expected: "bab" or "aba"

        // Test case 2: Even length
        System.out.println(solution.longestPalindrome("cbbd")); // Expected: "bb"

        // Test case 3: Single character (edge case)
        System.out.println(solution.longestPalindrome("a")); // Expected: "a"

        // Test case 4: All same characters
        System.out.println(solution.longestPalindrome("aaa")); // Expected: "aaa"

        // Test case 5: No palindrome longer than 1
        System.out.println(solution.longestPalindrome("abc")); // Expected: "a" or "b" or "c"
    }


    /*Explanation: We treat each character as a potential center of a palindrome and expand outwards to find the longest one.
    We check both odd and even lengths. This avoids brute-force checks.

    Complexity: Time: O(n²) (expansion can be O(n) per center). Space: O(1) (no extra space beyond variables).*/
}
