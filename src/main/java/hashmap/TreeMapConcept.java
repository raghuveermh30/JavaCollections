package hashmap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

    public static void main(String[] args) {

        /* TreeMap is a part of Java Collections Framework and it implements the Map interface.
         * TreeMap is a Red-Black tree based implementation of Map interface.
         * TreeMap is used to store key-value pairs in sorted order based on keys.
         * TreeMap is not synchronized, so it is not thread-safe.
         */

        /* Key Features of TreeMap:
         * 1. It stores key-value pairs in sorted order based on keys.
         * 2. TreeMap does not allow null keys but allows multiple null values.
         * 3. Time complexity for basic operations like add, remove, and contains is O(log n) due to the underlying Red-Black tree structure.
         * 4. Not Synchronized: TreeMap is not synchronized, which means it is not thread-safe.
         *  For concurrent use, wrap it with Collections.synchronizedMap() or use ConcurrentSkipListMap.
         */


        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1000, "Tom");
        treeMap.put(2000, "Tom");
        treeMap.put(1300, "Tom");
        treeMap.put(1900, "Tom");
        treeMap.put(3200, "Tom");

        System.out.println(treeMap);
        treeMap.forEach((K, V) -> System.out.println("Key " + K + " value " + V));
        System.out.println("Last Key " + treeMap.lastKey());
        System.out.println("First Key " + treeMap.firstKey());

        Set<Integer> keysLessThan3k = treeMap.headMap(3000).keySet();
        System.out.println(keysLessThan3k);

        Set<Integer> keysGreaterThan3k = treeMap.tailMap(3000).keySet();
        System.out.println(keysGreaterThan3k);

        System.out.println("Printing in Ascending Order");
        TreeMap<String, Integer> userMap = new TreeMap<>();
        userMap.put("James", 100);
        userMap.put("Lary", 200);
        userMap.put("Paul", 400);
        userMap.put("Tend", 50);
        userMap.put("Abi", 90);
        userMap.put("Ted", 134);
        userMap.forEach((K, V) -> System.out.println("Key " + K + " value " + V));

        System.out.println("Printing in Descending Order");
        TreeMap<String, Integer> userMap1 = new TreeMap<>(Comparator.reverseOrder());
        userMap1.put("James", 100);
        userMap1.put("Lary", 200);
        userMap1.put("Paul", 400);
        userMap1.put("Tend", 50);
        userMap1.put("Abi", 90);
        userMap1.put("Ted", 134);
        userMap1.forEach((K, V) -> System.out.println("Key " + K + " value " + V));

        TreeMap<Integer, String> treeMap3 = new TreeMap<>();
        // Add key-value pairs
        treeMap3.put(3, "Three");
        treeMap3.put(1, "One");
        treeMap3.put(2, "Two");
        treeMap3.put(4, "Four");

        //Print the TreeMap
        System.out.println("TreeMap: " + treeMap3); //Output: {1=One, 2=Two, 3=Three, 4=Four}

        //Access the value
        System.out.println(treeMap3.get(2)); //Output: Two

        //check if a key exists
        System.out.println(treeMap3.containsKey(1)); //Output: true

        //Remove a key-value pair
        treeMap3.remove(4);
        System.out.println("After removing key 4: " + treeMap3); //Output: {1=One, 2=Two, 3=Three}

        // Iterate over entries
        for (Map.Entry<Integer, String> entry : treeMap3.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }

        //To Get the Tree map in Descending order
        TreeMap<Integer, String> treeMap4 = new TreeMap<>(Comparator.reverseOrder());
        // Add key-value pairs
        treeMap4.put(3, "Three");
        treeMap4.put(1, "One");
        treeMap4.put(2, "Two");
        treeMap4.put(4, "Four");
        System.out.println("TreeMap in Descending Order: " + treeMap4); //Output: {4=Four, 3=Three, 2=Two, 1=One}

        //UseFul Methods:

        //firstKey(): Returns the smallest key.

        //lastKey(): Returns the largest key.

        //ceilingKey(K key): Returns the least key greater than or equal to the given key.

        //floorKey(key): Returns the largest key <= given key.

        TreeMap<Integer, String> treeMap6 = new TreeMap<>();
        treeMap6.put(1, "One");
        treeMap6.put(3, "Three");
        treeMap6.put(5, "Five");

        System.out.println("First Key: " + treeMap6.firstKey()); // Output: 1
        System.out.println("Last Key: " + treeMap6.lastKey()); // Output: 5
        System.out.println("Ceiling Key for 4: " + treeMap6.ceilingKey(4)); // Output: 5
        System.out.println("Floor Key for 4: " + treeMap6.floorKey(4)); // Output: 3

        /* Use TreeMap when you need sorted keys or range-based operations.
         * For unsorted maps, consider HashMap (O(1) average time complexity) instead.
         * If you need thread safety, use ConcurrentSkipListMap for a concurrent sorted map.
         */
    }
}
