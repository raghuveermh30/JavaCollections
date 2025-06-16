package hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

    public static void main(String[] args) {


        //Synchronized method in the collections class:

        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "Raghu");
        map1.put("2", "Shruthi");
        map1.put("3", "BLR");

        //Create the synchronized map
        Map<String, String> syncMap = Collections.synchronizedMap(map1);
        System.out.println(syncMap);

        // Concurrent Hash Map - It doesn't through any ConcurrentModificationException
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("A", "Java");
        concurrentHashMap.put("B", "Python");
        concurrentHashMap.put("C", "Ruby");
        System.out.println(concurrentHashMap.get("A"));
    }
}