package javainterviewquestions;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    public static void main(String[] args) {
        String str = "abcabcbb"; //3
        String str1 = "bbbbb"; //1
        String str2 = "pwwkew"; //3
        String str3 = "naveen"; //4
        String str4 = "raghu";

        lengthOfLongestSubstring(str);
        lengthOfLongestSubstring(str1);
        lengthOfLongestSubstring(str2);
        lengthOfLongestSubstring(str3);
        lengthOfLongestSubstring(str4);
        //Time complexity: O(n), where n is the length of the string
    }

    public static int lengthOfLongestSubstring(String s) {

        int start = 0, maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currChar = s.charAt(end);
            if (charIndexMap.containsKey(currChar)) { //if the character is repeated --> Here a is repeated --> a=0
                start = Math.max(start, charIndexMap.get(currChar) + 1); //move the start index to the right of the last occurrence
            }
            charIndexMap.put(currChar, end);//a=0, b=1, c=2,
            maxLength = Math.max(maxLength, end - start + 1); //abcabcbb -> 3
            System.out.println(maxLength);
        }

        System.out.println("Length of the longest substring without repeating characters: " + maxLength);
        return maxLength;
    }
}
