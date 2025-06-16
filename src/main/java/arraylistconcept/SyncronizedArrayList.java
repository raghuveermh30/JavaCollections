package arraylistconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncronizedArrayList {

    /**
     * How to syncronize the ArrayList in the Java
     * <p>
     * There are 2 ways we can create the Syncronized Array List
     * <p>
     * copyOnWriteArrayList -> Thread Safe varient of ArrayList
     */

    public static void main(String[] args) {

        List<String> newList = Collections.synchronizedList(new ArrayList<>());
        newList.add("Java");
        newList.add("Python");
        newList.add("Ruby");

        //add, remove for Syncronized Array list, We don;t need the Syncronization operartion
        // To Fetch or Traverse the values from the above array list, we need to use the explict Syncronization

        // Explicit Synchronization
        synchronized (newList) {
            Iterator<String> it = newList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        //2. CopyOnWriteArrayList --> its a class
        // Here all the operations are synchronized, We don;t need Synchronized for any operations like Add, remove, fetch and Traverse operations

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("Tom");
        copyOnWriteArrayList.add("Peter");
        copyOnWriteArrayList.add("Steve");
        copyOnWriteArrayList.add("Naveen");

        Iterator<String> iterator = copyOnWriteArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
