package arraylistconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class GenericArrayList {

    public static void main(String[] args) {

        // Generics in ArrayList
        ArrayList<Integer> marksList = new ArrayList<>();
        marksList.add(100);
        marksList.add(200);
        marksList.add(300);

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(100.0);
        doubleList.add(12.33);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Raghu"); //0
        stringArrayList.add("Shru"); //1
        stringArrayList.add("Tom"); //2
        stringArrayList.add("Peter"); //3
        stringArrayList.add("Lisa"); //4

        //ArrayList Iteration Concept using below ways\
        //1. Typical for loop

        for(int i =0; i<stringArrayList.size();i++){
            System.out.println(stringArrayList.get(i));
        }

        System.out.println("********");
        //2. for-each loop
        for (String s : stringArrayList){
            System.out.println(s);
        }

        System.out.println("********");
        //3 Using Lambda function
        stringArrayList.stream().forEach( ele -> System.out.println(ele));

        System.out.println("********");
        //4 Using Iterator
       Iterator<String> it = stringArrayList.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }
        System.out.println("********");
       //List with other Collection
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println(numberList);

        System.out.println("********");
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Java", "Python", "JS", "PHP"));
        System.out.println(stringList.size());
        System.out.println(stringList);

    }
}
