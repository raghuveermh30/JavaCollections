package java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterations {

    public static void main(String[] args) {

        ArrayList<String> tvSeriers = new ArrayList<>();
        tvSeriers.add("GameOfThrones");
        tvSeriers.add("Friends");
        tvSeriers.add("Breaking Bad");
        tvSeriers.add("The Big Bang Theory");
        tvSeriers.add("The Walking Dead");
        tvSeriers.add("Prison Break");

        //Using Java 8 with for-each loop and lambda expression
        System.out.println("***Print using foreach with Lambda using Java 8 *******");
        tvSeriers.forEach(shows -> {
            System.out.println(shows);
        });


        System.out.println("***Print using Iterator *******");
        //2. Using Iterator
        Iterator<String> it = tvSeriers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //3 using Iterator and Java 8   forEachRemaining Method--
        System.out.println("***Print using Iterator and  forEachRemaining method *******");
        it = tvSeriers.iterator();
        it.forEachRemaining(show -> System.out.println(show));


        //4. Using for each loop
        for (String str : tvSeriers) {
            System.out.println(str);
        }

        //5. Using for Loop with index order
        for (int i = 0; i < tvSeriers.size(); i++) {
            System.out.println(tvSeriers.get(i));
        }

        //6. Using List Iterator to traverse from both the directions
        System.out.println("***Print Using List Iterator to traverse from both the directions *******");
        ListIterator<String> listIterator = tvSeriers.listIterator(tvSeriers.size());
        while (listIterator.hasPrevious()) {
            String show = listIterator.previous();
            System.out.println(show);
        }


    }
}
