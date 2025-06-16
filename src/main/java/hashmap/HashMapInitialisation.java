package hashmap;


import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialisation {

    public static Map<String, Integer> marksMap;

    static {
        marksMap = new HashMap<>();
        marksMap.put("A", 100);
        marksMap.put("B", 200);
    }

    public static void main(String[] args) {
        //1. Using HashMap Class
        HashMap<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        //2. Using Static Way
        System.out.println(HashMapInitialisation.marksMap.get("A"));

        //3. Immutable Map with only one single Entry
        Map<String, Integer> map3 = Collections.singletonMap("test", 100);
        System.out.println(map3.get("test"));
       // map3.put("abc", 200); --> This is not allowed, this will give UnsupportedException, It will be having only single value

        //4. JDK 8
        //toMap()
        Map<String, String> map4 = Stream.of(new String[] []{

                {"Tom", "A Grade"},
                {"Naveen", "A+ Grade"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
        System.out.println(map4.get("Tom"));
        map4.put("Lisa", "A++");
        System.out.println(map4.get("Lisa"));

        //5. Simple Entry Method -> Mutuable Enrty of the map
        Map<String, String> map5=Stream.of(
                new AbstractMap.SimpleEntry<>("Naveen", "Java"),
                new AbstractMap.SimpleEntry<>("Tom", "Python")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map5.get("Naveen"));
        map5.put("Lisa", "C++");
        System.out.println(map5.get("Lisa"));

        //6 in JDK 1.9
        //Empty map --> Creation of Empty Map
       // Map<String, String > map6 = Map.of();
        //map6.put("Lisa", "JAVA") --> UnsupportedException

        //SingleTonMap
       /*Map<String, String> singleTonMap =  Map<>.of("K1", "V1");
        singleTonMap.get("K1");
        singleTonMap.put("K2", "V2") //UnsupportedException -> This is not allowed*/

        //MultiMap --> this will allows maximum 10 Ket value pairs
        /*Map<String, String> multiMap =  Map<>.of("K1", "V1", "K2", "V2", "K3", "V3");
        multiMap.get("K1");

         */







    }
}
