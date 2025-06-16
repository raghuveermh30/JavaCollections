package hashmap;

import java.util.*;

public class HashTableDemo {

    public static void main(String[] args) {

        Map<String, Integer> marks = new Hashtable<>();
        marks.put("Naveen", 100);
        marks.put("Peter", 200);
        marks.put("Lisa", 300);
        marks.put("Roshan", 400);
      //  marks.put(null, 400); // It will give Null Pointer Exception
       // marks.put("Raghu", null); // It will give Null Pointer Exception


        System.out.println(marks.get("Naveen"));
        System.out.println(marks.get("Lisa"));
       //System.out.println(marks.get(null));
        //System.out.println(marks.get("Raghu"));

    }
}
