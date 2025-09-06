package InterviewConcepts;

import java.util.*;

public class Test {

    public static void main(String[] args) {


        //Merge two lists of integers and remove duplicates.

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

       // list1.addAll(list2);

        Set<Integer> set1 = new HashSet<>(mergedList);

        System.out.println(set1);

    }
}
