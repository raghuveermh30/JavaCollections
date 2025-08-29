package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {

    public static void main(String[] args) {

        /*
         * HashMap is a class that implements the Map interface.
         * It does not maintain any order and any index.
         * It stores the value on the basis of Key and Value format.
         * Key cannot be duplicate, it should be unique, But it won;t give any error but it will pick the latest values.
         * Can store N number of Null Values but we can only store one Null key.
         * Hashmap is not Synchronized or its not Thread Safe.
         * HashTable is Synchronized or its Thread Safe.
         * HashMap is better than HashTable in terms of performance.
         * HashMap internally uses Hashing Technique to store the values.
         * Time Complexity of HashMap is O(1) for Insertion, Deletion and Accessing the values.
         * Hashcode of null key is 0.
         * Hashing collision is handled by LinkedList internally
         * Initial Capacity of HashMap is 16 and Load Factor is 0.75
         * Worst Case Time Complexity is O(n) - If all the keys are same then it will create the LinkedList internally and it will take O(n) time to access the values.
         * In Java 8, if the collision occurs and if the number of elements in the bucket is more than 8,
           then it will convert the LinkedList to Balanced Tree and the time complexity will be O(log n)
         * Balanced Tree is a data structure in which the height of the tree is log(n) where n is the number of nodes in the tree.
         * In Balanced Tree, In the left hand side all the values are less than the root node and in the right hand side all the values are greater than the root node.
         * In Balanced Tree, we can perform the operations like Insertion, Deletion and Searching
         */


        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("India", "Delihi");
        capitalMap.put("USA", "Washington DC");
        capitalMap.put("UK", "London");
        capitalMap.put("USA", "NewYork");
        capitalMap.put(null, "Berlin");
        capitalMap.put(null, "LA");
        capitalMap.put("Russia", null);
        capitalMap.put("France", null);

        //Remove the key value pair
        capitalMap.remove("France");

        //If we don;t have any key then it will give null

        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get("Germany")); //null
        System.out.println(capitalMap.get(null));
        System.out.println(capitalMap.get("France"));

        System.out.println("************");
        //Fetch or Traverse the HashMap

        //1. Using Iterator
        //Give me all the Keys which contains in particular HashMap
        //Iterate: Over the Keys: by using keySet()
        Iterator<String> iterator = capitalMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = capitalMap.get(key);
            System.out.println(key + "=" + value);
        }

        //2. using EntrySet
        System.out.println("**********");
        Iterator<Map.Entry<String, String>> iterator1 = capitalMap.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, String> entry = iterator1.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("**********");
        //3. Using Java 8
        capitalMap.forEach((K, V) -> System.out.println("key = "+K +"and value = " +V ));

    }
}
