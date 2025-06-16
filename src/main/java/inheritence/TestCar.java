package inheritence;

public class TestCar {

    public static void main(String[] args) {

        /**
         * Child class method will be called
         * MethodOverriding - when we have method in the parent class and same method in the child class with the
         * 1. same name
         * 2. same number of Parameters and sequence of the parameters should also matters
         * 3. with the same return type
         * 4. Number of lines doesn't matter in the method
         * 5. Business logic will not matter
         * 6. static methods cannot be overridden but it can be overloaded
         * 7. Private methods cannot be overridden
         * 8. A Method with the final keywords cannot be overridden
         * 9. If the particular class is the final in nature then it cannot be the parent, no one can be inherrit that class
         * 10. Overridden is only applicable for Methods, there is no concept for the variables
         * 11. Variables can also inherit
         * 12. Siblings inheritance is not allowed in the Java
         * MethodOverriding -> Poly(Many)+Morphism(forms): RunTime(Dynamic)
         */

        BMW b1 = new BMW();
        b1.start(); //Child method will be called overridden method
        b1.autoParking(); // Inherited method
        b1.stop(); //Inherited method
        BMW.billing();
        b1.refuel(); // Final methods can be called in the child but cannot be overridden
        b1.getCarInfo();
        System.out.println("BMW Car speed is " + b1.speed);
        b1.speed = 500;
        System.out.println("BMW Car speed is " + b1.speed);
        b1.speedTracking();
        b1.engine();
        b1.bmwLoading();
        b1.cruseControl();

        //Inherit from the grandparent
        System.out.println(b1.price); //50

        //update the price in the parent class
        System.out.println(b1.price); //70

        System.out.println("**************");

        Car c1 = new Car();
        c1.start(); // Parent class method will be called
        c1.stop();
        c1.refuel();
        Car.billing();
        c1.getCarInfo();
        c1.engine();
        c1.cruseControl();
        System.out.println("Car speed is " + c1.speed);


        System.out.println("**************");
        Audi audi = new Audi();
        audi.start();
        audi.stop();
        audi.refuel();
        audi.applyBreak();
        audi.threadSaftey();
        audi.autoParking();
        audi.speedTracking();
        audi.engine();
        audi.cruseControl();

        Vehicle vehicle = new Vehicle();
        vehicle.engine(); //only parent methods are accessable
        vehicle.cruseControl();

        System.out.println("**************");

        /**
         * Child class object can be reffered by Parent class reference Variable
         * This Concept is called TopCasting or UpCasting
         * with the TopCasting, We can access all the overridden and inherritted methods will be accessable but cannot access the indivudual methods
         * This is also called Is-A relationship
         *
         */

        Car c2 = new BMW();
        c2.start(); //Overridden method will be called
        c2.stop();
        c2.refuel();
        c2.applyBreak();

        //Here c2.autoParking() is not allowed
        System.out.println("**************");
        Car c3 = new Audi();
        c3.start();
        c3.stop();
        c3.refuel();

        /**
         * Parent class object can be reffered by the child class refrence variable
         * This concept is called DownCasting
         * But when we run the Downcasting object then it will give ClassCastException.
         * Downcasting is not applicable to java
         *
         */

        //  BMW bmw = (BMW) new Car();
        // bmw.start();

        System.out.println("**************");

        /**
         * Child class object is reffered by grand parent object reference variable.
         * This is called Is-A relationship
         */

        Vehicle vehicle1 = new BMW();
        vehicle1.engine();

        Vehicle vehicle2 = new Audi();
        vehicle2.engine();
    }

}
