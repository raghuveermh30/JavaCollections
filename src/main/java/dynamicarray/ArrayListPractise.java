package dynamicarray;

import java.util.ArrayList;

public class ArrayListPractise {

    public static void main(String[] args) {

        ArrayList ar = new ArrayList(); //vc=10, pc =0 (Current Size)
        // This is raw type array list and it will be give anything
        System.out.println(ar.size()); //0 --> PC
        ar.add(100); //0
        ar.add(200); //1
        ar.add(300); //2
        ar.add(400); //3
        System.out.println(ar.size()); //4

       /* ar.remove(3);
        System.out.println(ar.size()); //3

        ar.remove(0);
        ar.remove(1);
        System.out.println(ar.size()); //1*/

        System.out.println(ar.get(1)); //200
        ar.remove(1);
        System.out.println(ar.get(1)); //300

        //Print all the values of Array List
        System.out.println(ar);
        //   System.out.println(ar.get(4)); --> IndexOutOfBoundsException

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        ArrayList<Integer> list = new ArrayList(); //VC =10, PC =0 --> Add the elements
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(30);

        ArrayList<Double> list1 = new ArrayList();
        list1.add(12.33);
        list1.add(32.11);
        list1.add(100.00);
        list1.add(200.00);

        ArrayList<String> browserList = new ArrayList();
        browserList.add("chrome");
        browserList.add("firefox");
        browserList.add("safari");
        browserList.add("edge");

        for (String str : browserList) {
            System.out.println(str);
            if (str.equals("chrome")) {
                System.out.println("Enter the url");
                break;
            }
        }

        ArrayList<Object> objectArrayList = new ArrayList();
        objectArrayList.add("Raghu");
        objectArrayList.add(25);
        objectArrayList.add(true);
        objectArrayList.add(20L);
        objectArrayList.add('m');
        System.out.println(objectArrayList);

        for (Object obj : objectArrayList) {
            System.out.println(obj);
        }

        ArrayList<String> studentList = new ArrayList();
        studentList.add(null);
        studentList.add("monika"); //0
        studentList.add("vibha"); //1
        studentList.add("surya"); //2
        studentList.add("monika"); //3
        studentList.add("surya"); //4
        studentList.add(null);

        System.out.println(studentList);
        System.out.println(studentList.remove(4));
        System.out.println(studentList);

        ArrayList<String> footerList = new ArrayList();
        footerList.add("Contact US");
        footerList.add("help");
        footerList.add("returns");
        footerList.add("delivery info");

        footerList.add(0, "Naveen");
        System.out.println("Updated value on the 0th position " + footerList.get(0)); //Here we are loosing the data on the 0th postion

        footerList.set(0, "Testing"); // this will not replace the existing value instead of this it will add the element in 0th position and rest elements wil shift
        System.out.println("Updated value on the 0th position " + footerList.get(0)); //Testing
        System.out.println(footerList.get(1)); //Naveen

        for (String e : footerList) {
            if (e.equals("returns")) {
                System.out.println("click on returns");
                break;
            }
        }


    }
}
