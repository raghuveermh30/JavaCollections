package linkedintests;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {

        String sentence = "my name is Claude Claude";

        // Split by spaces
        String[] words = sentence.split(" ");

        // LinkedHashMap preserves insertion order
        Map<String, Integer> countMap = new LinkedHashMap<>();

        for (String word : words) {
            // If word exists, increment; else put 1
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }


        // Print the word counts

        countMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
