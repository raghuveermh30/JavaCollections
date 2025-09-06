package setconcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

    public static void main(String[] args) {

        /*
         * It doesn't allow any insertion order
         * it wont; allow the duplicate values
         * Null Values are allowed
         * It is not synchronized
         * It is the best approach for search operations
         * It is the implementation of Set interface
         * It uses the Hashing Mechanism to store the values
         * It is a part of Java Collections Framework
         * It is better for the search operations
         * It is not suitable for the frequent insertion and deletion operations
         * It is not suitable for the random access, Bcz it doesn't provide the index numbers
         * Initial Capacity of HashSet is 16 and Load Factor is 0.75
         * Time Complexity of HashSet is O(1) for Insertion, Deletion and Accessing the values.
         * Worst Case Time Complexity is O(n) - If all the keys are same then it will create the LinkedList internally and it will take O(n) time to access the values.
         */

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Alpha");
        hashSet.add("Testing");
        hashSet.add("Beta");
        hashSet.add("Beta"); // It won't allow the duplicate values
        System.out.println(hashSet);
        hashSet.add(null);
        System.out.println(hashSet);

        System.out.println(hashSet.contains("Testing"));//true

        System.out.println("*** Using Enhanced for loop ****");
        for (String s : hashSet) {
            System.out.println(s);
        }

        hashSet.remove("Beta");

        System.out.println(hashSet);

        System.out.println("*** Using Iterator ****");
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Set<Integer> firstSet = new HashSet<>();
        firstSet.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 6, 7, 7, 7, 88, 8, 9, 9}));

        Set<Integer> secondSet = new HashSet<>();
        secondSet.addAll(Arrays.asList(new Integer[]{1, 2, 3, 0, 13, 1, 9, 9}));

        // Get the union
        Set<Integer> union = new HashSet<>(firstSet);
        union.addAll(secondSet);
        System.out.println("Union of both sets : " + union);


        // Intersection set
        Set<Integer> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        System.out.println("Inter Section of both sets : " + intersection);

        //Get the Differences
        Set<Integer> differences = new HashSet<>(firstSet);
        differences.retainAll(secondSet);
        System.out.println("Difference of both sets : " + intersection);

    }
}