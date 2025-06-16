package javasessions;

public class CallByRef {

    String name;
    int age;

    public void m1(int a) {
        System.out.println(a);
    }

    public static void t1(CallByRef p1) { //This will be always class Name
        p1.m1(5); //p1=obj
        System.out.println(p1.name); //Naveen
        System.out.println(p1.age); //20

        /**
         * p1 =obj --> Here p1 and obj are 2 references are pointing to one single object.
         * This is called Call By Reference
         *
         * Here We are assiging the values to the obj, then the same values are applicable to p1
         */

        p1.name = "Raghu";
        p1.age = 35;

    }


    public static void main(String[] args) {
        CallByRef obj = new CallByRef();
        obj.m1(5); //Call By Value /Argument

        System.out.println(obj.name); //null
        System.out.println(obj.age); //0
        System.out.println("*****");
        obj.name = "Naveen";
        obj.age = 20;

        CallByRef.t1(obj); // Call by Reference(Object Reference)

        System.out.println("*****");
        System.out.println(obj.name);
        System.out.println(obj.age);


        /**
         * UseCases of CallByReference
         * We will be using in the POM
         * The main adv of CallByReference is to avoid creation of unnecessary objects in the class
         *
         */


    }

}
