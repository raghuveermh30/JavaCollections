package interviewquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordLengthMap {

    public static void main(String[] args) {

        String str = "Raghuveer is working in Manhatten Associates!";

        // Split the string by spaces and special characters
        String words[] = str.split("[\\s!]+");

        // Create a HashMap to store word-length pairs
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            // Skip empty strings
            if (!word.isEmpty()) {
                map.put(word, word.length());
            }
        }

        // Create a list to store formatted strings
        List<String> formattedList = new ArrayList<>();

        for (String word : words) {
            formattedList.add(word + " : " + word.length());
        }

       // Join the formatted strings with commas
        String result = String.join(", ", formattedList);
        System.out.println(result);

    }
}
