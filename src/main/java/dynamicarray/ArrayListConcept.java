package dynamicarray;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[] args) {

        /*
         * ArrayList will maintain the index/order
         * By default Java will be created 10 Virtual segments --> Virtual Capacity
         * Physical Capacity is 0 by default, once we add the elements then it will be increased
         * 0 to 9 segments --> 10 values will be filled, now add the value of 11th value --> ar.add(1100)
         * In the above case, before fill the 10th value then memory will add some more capacity called Load Factor
         *
         * Load Factor = Physical Capacity/2 --> 10/2 --> 5 VC
         *
         * Add the elements till 14 elements then Load Factor will be 15/2 --> 7
         *
         * 7 more virtual segments will be created, total Virtual segments are 22 --> 0 to 21
         * There are no bits and bytes in the memory
         *
         * Duplicates are allowed
         * Multiple Null values are allowed
         *
         * Primitive data type is not allowed in the Generics
         */

        ArrayList ar = new ArrayList();
        System.out.println(ar.size()); //0
        ar.add(100);
        ar.add(200);
        System.out.println(ar.size()); //2 --> VC=8, PC=12
        ar.add(300);
        ar.add(400);
        System.out.println(ar.size()); //4 --> vc = 6, pc =4

        ArrayList ar1 = new ArrayList(5);
        ar1.add(200);
        ArrayList ar2 = new ArrayList(50); //vc = 50, pc =0

    }
}
