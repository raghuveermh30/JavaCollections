package arraylistconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {

    public static void main(String[] args) {

        //1 sort and equals
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        //Sort the List
        Collections.sort(l1);
        Collections.sort(l2);
        System.out.println(l1.equals(l2));

        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        Collections.sort(l3);
        System.out.println(l1.equals(l3));

        //2. Compare the Two list -> find out the additional Element
        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l5 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
      //  l4.removeAll(l5);
       // System.out.println(l4);

        //3. Find out the Missing Element
        l5.removeAll(l4);
        System.out.println(l5);

        //4. Find out the common elements
        ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("Java", "Ruby", "Pyhton", "C#", "JS"));
        ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("Java", "Ruby", "Pyhton", "C#", "PHP"));
        lang1.retainAll(lang2);
        System.out.println(lang1);






    }
}
