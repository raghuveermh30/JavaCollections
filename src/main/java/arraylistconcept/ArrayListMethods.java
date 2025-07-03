package arraylistconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("java");
        ar1.add("python");
        ar1.add("ruby");
        ar1.add("javascript");

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("testing");
        ar2.add("devops");

        //addAll();
        // ar1.addAll(ar2);
        System.out.println(ar1);

        //  ar1.addAll(2, ar2); //after the Index, the array will be adding
        System.out.println(ar1);

        //clear();
        //  ar1.clear();
        //  System.out.println(ar1);

        //clone()
        ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();
        System.out.println(cloneList);

        //contains()
        System.out.println(ar1.contains("python"));
        System.out.println(ar1.contains("c"));

        //indexOf()
        System.out.println(ar1.indexOf("ruby"));
        System.out.println(ar1.indexOf("ruby") > 0);

        //lastIndexOf();
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("naveen", "tom", "naveen", "peter", "steve", "lisa", "naveen"));
        System.out.println(list1);
        System.out.println(list1.lastIndexOf("naveen"));
        System.out.println(list1.lastIndexOf("test")); //-1 --> this will give -1

        // remove(); //removing the element
        list1.remove(1);
        System.out.println(list1);

        list1.remove("lisa");
        System.out.println(list1);

        //removeIf();
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list2.removeIf(num -> num % 2 == 0);
        System.out.println(list2); //Remove all the even numbers and it has only odd numbers

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list3.removeIf(num -> num % 2 != 0); //Remove all the odd numbers and it has only even numbers
        System.out.println(list3);

        //retainAll()
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("naveen", "tom", "peter", "steve", "lisa", "tom"));
        list4.retainAll(Collections.singleton("tom"));
        System.out.println(list4);

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15));
        ArrayList<Integer> subList = new ArrayList<>(numList.subList(0, 6));
        System.out.println(subList);

        ArrayList<String> newList = new ArrayList<>(Arrays.asList("naveen", "tom", "naveen", "peter", "steve", "lisa", "naveen"));
        Object arr[] = newList.toArray();
        System.out.println(Arrays.toString(arr));

        for (Object o : arr) {
            System.out.println(o);
        }

    }
}
