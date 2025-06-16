package hashmap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

    public static void main(String[] args) {


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



     }
}
