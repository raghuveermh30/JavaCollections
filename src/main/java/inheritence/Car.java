package inheritence;

public class Car extends Vehicle{

    final int speed =100;

    public void start() {
        System.out.println("Car Start");
    }

    public void start(int a) {
        System.out.println("Car Start for Integer");
    }

    public void stop() {
        System.out.println("Car stop");
    }

    // Final method cannot be overridden
    public final void refuel() {
        System.out.println("Car got refuel");
    }

    public void applyBreak() {
        System.out.println("Car Apply Break");
    }

    //static Methods cannot be overridden
    // This is called Method Hiding --> Parent is having static method and child is also having exact same method
    public static void billing() {
        System.out.println("Car Billing");
    }

    public void getCarInfo(){
        System.out.println("Car get Info");
    }

    @Override
    public void cruseControl(){
        System.out.println("Car -- CruseControl");
    }
}
