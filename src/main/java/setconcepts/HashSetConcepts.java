package setconcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

    public static void main(String[] args) {

        /**
         * It doesn't allow any insertion order
         * it wont; allow the duplicate values
         *
         */

        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("Testing");
        hashSet.add("Beta");
        hashSet.add("Beta"); // It won't allow the duplicate values
        System.out.println(hashSet);
        hashSet.add(null);
        System.out.println(hashSet);

        System.out.println(hashSet.contains("Testing"));

        for (String s : hashSet) {
            System.out.println(s);
        }

        hashSet.remove("Beta");

        System.out.println(hashSet);

        System.out.println("******");
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