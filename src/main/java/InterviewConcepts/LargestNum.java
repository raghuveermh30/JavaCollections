package InterviewConcepts;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class LargestNum {

    public static void main(String[] args) {

        int x = 100;
        int y = 200;
        int z = 300;

        if (x >= y && x >= z) {
            System.out.println("X is the greatest");
        } else if (y >= z) {
            System.out.println("Y is the greatest");
        } else {
            System.out.println("Z is the greatest");
        }


        // Store numbers in a TreeMap with the number as key and label as value
        TreeMap<Integer, String> numbers = new TreeMap<>(Comparator.reverseOrder());
        numbers.put(x, "X");
        numbers.put(y, "Y");
        numbers.put(z, "Z");

        // Get the largest number (first key in reverse-ordered TreeMap)
        Map.Entry<Integer, String> largest = numbers.firstEntry();
        System.out.println(largest.getValue() + " is the greatest (" + largest.getKey() + ")");

    }
}
