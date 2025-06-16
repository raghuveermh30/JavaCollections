package superpackage;

public class Car extends Vehicle {

    int speed = 100;

    public Car(){
        System.out.println("This is my Car Default Constructor");
    }

    public Car(int a ){
        System.out.println("This is my Car Default Constructor "+a);
    }

    public Car(int a, int b){
        System.out.println("This is my Car Default Constructor "+(a+b));
    }

    public void start() {
        System.out.println("Car start");
    }

    public void refuel() {
        System.out.println("Car refuel");
    }

    public static void testing(){
        System.out.println("Testing");
    }

}
