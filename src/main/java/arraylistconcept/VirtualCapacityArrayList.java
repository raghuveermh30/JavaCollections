package arraylistconcept;

import java.util.ArrayList;

public class VirtualCapacityArrayList {

    public static void main(String[] args) {

        /*
        Virtual Capacity of the Arraylist is 10 by default.
        Physical Capacity of the Arraylist is 0 by default.
         */

        ArrayList<Object> objectArrayList = new ArrayList();
        System.out.println(objectArrayList.size()); //Physical Capacity PC=0

        objectArrayList.add(100);
        System.out.println(objectArrayList.size()); //PC=1, VC=9

        objectArrayList.add(200);
        objectArrayList.add(300);
        objectArrayList.add(400);
        objectArrayList.add(500);
        System.out.println(objectArrayList.size()); //PC=5, VC=5

        // change the Virtual Capacity
        ArrayList<Object> objectArrayList1 = new ArrayList(20); //Here Initial VC is 20, We have given the value to this array list as 20
        objectArrayList1.add(10);
        objectArrayList1.add(20);
        System.out.println(objectArrayList1.get(0));


    }
}
