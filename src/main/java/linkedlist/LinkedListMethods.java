package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

    public static void main(String[] args) {

        /*
         * It is the default class in the Java
         * It can be used as List, Stack, Dequeue and Queue as well as it implements List and Queue
         * It allows null values
         * It is a dynamic collection, hence Insertion and Deletion can be easily acessable
         * It can contains Duplicate elements
         * It is not thread-safe
         * In Linked List, Manipulation is fast compared to array list, Bcz we don;t need any shifting
         * It contains the pointers to the next node, Shifting is not required
         * It maintains the insertion order
         * It is better for the frequent insertion and deletion operations
         * It internally uses doubly linked list to store the elements
         * It is not suitable for the search operations, Bcz it doesn't provide the index numbers
         * It is not suitable for the random access, Bcz it doesn't provide the index numbers
         * It is suitable for the queue and stack operations
         * It is not a good choice for the memory consumption, Bcz it requires more memory
         * It is a part of Java Collections Framework
         */




        LinkedList<String> namesList = new LinkedList<>();
        System.out.println(namesList.size()); //0 --> Physical Capacity is 0
        namesList.add("Raghu");
        namesList.add("Tom");
        namesList.add("Peter");
        namesList.add("Naveen");
        System.out.println(namesList.size());

        System.out.println(namesList);
        System.out.println("First Index is : " + namesList.get(1));

        //Iterate the Linked list
        Iterator<String> it = namesList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        namesList.add(2, "ABC"); //Add the element in Particular Index
        System.out.println(namesList);
        System.out.println(namesList.get(2));
        System.out.println(namesList);

        LinkedList<String> userList = new LinkedList<>();
        userList.add("Peter");
        userList.add("Trumph");
        userList.add("BOB");
        userList.add("Tarun");
        namesList.addAll(userList);
        System.out.println(namesList);

        namesList.addFirst("Kamala");
        System.out.println(namesList);
        namesList.addLast("Shivam");
        System.out.println(namesList);

        namesList.remove(3);
        System.out.println(namesList);

        namesList.removeAll(userList);
        System.out.println(namesList);

        namesList.removeFirst();
        namesList.removeLast();
        System.out.println(namesList);

        namesList.clear();
        System.out.println(namesList);

        LinkedList<String> langList = new LinkedList<>();
        System.out.println(namesList.size()); //0 --> Physical Capacity is 0
        langList.add("Java");
        langList.add("Python");
        langList.add("Ruby");
        langList.add("JS");
        System.out.println(langList.size());

        //Reverse the Linked List
        Iterator<String> itr = langList.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        for (String  e: langList){
            System.out.println(e);
        }

        System.out.println("********");
        //sort the collection
        Collections.sort(langList);
        System.out.println(langList);
    }
}
