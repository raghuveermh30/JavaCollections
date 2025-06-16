package arraylistconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 6, 6, 43, 6, 7, 4, 6, 1, 2, 4, 23, 4, 7, 87, 43, 6, 78, 432, 5, 59, 9, 22, 1, 2 ));

        //1. Using LinkedHashSet --> (Set family)
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(arrayList);
        ArrayList<Integer> numberList = new ArrayList<>(linkedHashSet);
        System.out.println("Using LinkedHashSet --> " +numberList);

        //2. JDK 8 --> Using Streams
        ArrayList<Integer> marksList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 6, 6, 43, 6, 7, 4, 6, 1, 2, 4, 23, 4, 7, 87, 43, 6, 78, 432, 5, 59, 9, 22, 1, 2 ));
        List<Integer> uniqueEle = marksList.stream().distinct().collect(Collectors.toList());
        System.out.println("Using Java 8 " + uniqueEle);




    }
}
