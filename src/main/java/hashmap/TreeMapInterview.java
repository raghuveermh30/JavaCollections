package hashmap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapInterview {

    public static void main(String[] args) {

        String str = "I am Raghuveer is working in Mahatten Associates";
        String words[] = str.split(" ");

        //Approach 1
       /* TreeMap<Integer, String> treeMap = new TreeMap<>();

        for(String s: str1){
            treeMap.put( s.length(),s);
        }
        System.out.println("Highest Key " + treeMap.lastKey());
        System.out.println("Lowest Key " + treeMap.firstKey());
        System.out.println("Highest Key " + treeMap.get(treeMap.lastKey()));
*/

        //Approach 2

        String minWord = words[0];
        String maxWord = words[0];

        for (String word : words) {
            if (word.length() < minWord.length()) {
                minWord = word;
            }
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }

        // Print results
        System.out.println("Minimum length word: " + minWord + " (Length: " + minWord.length() + ")");
        System.out.println("Maximum length word: " + maxWord + " (Length: " + maxWord.length() + ")");
    }
}
