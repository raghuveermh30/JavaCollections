package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {

    public static void main(String[] args) {

        /*
         * It stores the value on the basis of Key and Value.
         * Key cannot be duplicate, it should be unique, But it won;t give any error but it will pick the latest values.
         * Can store N number of Null Values but we can only store only one Null key.
         * Hashmap is not Synchronized or its not Thread Safe.
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
        capitalMap.remove("France");

        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get("Germany")); //null
        System.out.println(capitalMap.get(null));
        System.out.println(capitalMap.get("France"));

        System.out.println("************");
        //Fetch or Traverse the HashMap

        //1. Using Iterator
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
