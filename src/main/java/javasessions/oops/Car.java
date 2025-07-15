package javasessions.oops;

public class Car {

    String name;
    int price;
    String modelNum;
    static final int wheels = 4;// static and final(Constant) class variable
    static final int keys = 2;

    public static void main(String[] args) {

        // static int i =10; // This is not allowed
        final int days = 7;
        //days =10 --> This cannot be applicable
        int salary = days * 100;
        System.out.println(salary);

        Car c1 = new Car();
        c1.name = "BMW";
        c1.price = 60;
        c1.modelNum = "x3";


        Car c2 = new Car();
        c2.name = "Audi";
        c2.price = 65;
        c2.modelNum = "Q3";


        Car c3 = new Car();
        c3.name = "Honda";
        c3.price = 25;
        c3.modelNum = "City";

        //Cannot be changed due to final variable
        // Car.wheels=5;
        // Car.keys=3;

        // How to access the static Variable
        // using class name
        System.out.println(Car.wheels);
        //using Directly as well
        // System.out.println(wheels);
        System.out.println(Car.keys);

        // How to access the non-static Variable
        // using Object creation
        System.out.println(c1.name + " " + c1.price + " " + c1.modelNum + " " + Car.wheels);
        System.out.println(c2.name + " " + c2.price + " " + c2.modelNum + " " + Car.wheels);
        System.out.println(c3.name + " " + c3.price + " " + c3.modelNum + " " + Car.wheels);

        //Can i access static variables using the Object Ref name?
        //  System.out.println(c1.wheels);//This is possible, but it will give warning, that Static variables should be access in the static way


        /*
         * Examples of Final and static
         * Logo or Image will always Constant
         * Footer Links will be always constant
         * Title, URL will be different for every page
         *
         */
    }
}
