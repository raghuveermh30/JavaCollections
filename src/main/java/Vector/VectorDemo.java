package Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> myVector = new Vector<>();
        myVector.add(10);
        myVector.add(20);
        myVector.add(30);
        myVector.add(40);
        myVector.add(50);
        myVector.add(60);
        myVector.add(70);

        System.out.println(myVector);

        System.out.println(myVector.get(2)); //30

        //Remove the element in Vector
        myVector.remove(3);
        System.out.println(myVector);


        Vector<Integer> yourVector = new Vector<>();
        yourVector.add(11);
        yourVector.add(12);
        yourVector.add(13);

        myVector.addAll(yourVector);
        System.out.println(myVector);


        //Iterate the Vector using For Loop
        for (Integer e : myVector) {
            System.out.println(e);
        }

        //Iterate the Vector using Iterator
        System.out.println("Using Iterator");
        Iterator<Integer> it = myVector.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Using Java 8 forEach and Lambda");
        myVector.forEach(System.out::println);
        System.out.println("****************");
        myVector.forEach(s -> System.out.println(s));

        System.out.println("Vector Size : " + myVector.size());


        //sort the Vector
        System.out.println("Sort the Vector");
        Collections.sort(myVector);


    }
}
