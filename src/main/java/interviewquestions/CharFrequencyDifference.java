package interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class CharFrequencyDifference {
    public static void printCharFrequencyDifferences(String s1, String s2) {
        // Count frequency of characters in both strings
        Map<Character, Integer> freq1 = countFrequencies(s1);
        Map<Character, Integer> freq2 = countFrequencies(s2);

        // Combine all characters from both strings
        Map<Character, Integer> allChars = new HashMap<>(freq1);
        freq2.keySet().forEach(c -> allChars.putIfAbsent(c, 0));

        // Print characters with differing frequencies
        for (Map.Entry<Character, Integer> entry : allChars.entrySet()) {
            char c = entry.getKey();
            int count1 = freq1.getOrDefault(c, 0);
            int count2 = freq2.getOrDefault(c, 0);
            int diff = Math.abs(count1 - count2);
            if (diff > 0) {
                System.out.println(c + " - " + diff);
            }
        }
    }

    private static Map<Character, Integer> countFrequencies(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String s1 = "aabbcc";
        String s2 = "abcccc";
        printCharFrequencyDifferences(s1, s2);
    }
}