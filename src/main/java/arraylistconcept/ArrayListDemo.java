package arraylistconcept;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListDemo {

    public static void main(String[] args) {

        /*
        default class,  dynamic Array
        default generics
        it will maintain the indexing to store the value
        -ve Indexing is not allowed in Java
        */

        //Generics in ArrayList
        ArrayList<Object> ar = new ArrayList<>();
        ar.add(100); //0
        ar.add(200); //1
        ar.add("testing"); //2
        ar.add(true);
        ar.add(12);
        ar.add(67);

        System.out.println(ar);
        System.out.println(ar.get(2));
        System.out.println(ar.get(3));
        //System.out.println(ar.get(6)); //ArrayIndexOutOfBoundException
        //System.out.println(ar.get(-1));
        System.out.println("Array list size : "+ar.size());
        System.out.println("Lowest Index : " +ar.get(0)); //Lowest Index
        System.out.println("Highest Index : " +(ar.get(ar.size()-1))); //Highest Index




    }
}
