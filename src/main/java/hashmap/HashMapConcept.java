package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    public static void main(String[] args) {

        /*
         * HashMap works internally by underlying data structure called Hashing
         *
         * Refer the Notes -> Have written the concepts of Hashmap Internally works
         *
         *
         */


        Map<String, Integer> marks = new HashMap<>();

        marks.put("Nav", 100);
        marks.put("Tom", 200);
        marks.put("Peter", 300);
        marks.put("Naveen", 400);

        marks.put(null, 500);
        marks.put(null, 700);






    }
}
