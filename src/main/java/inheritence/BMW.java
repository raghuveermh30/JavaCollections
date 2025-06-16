package inheritence;

public class BMW extends Car {

    int speed = 200;

    int price = 70;

    //Method Overriding def has written in the TestCar Class
    @Override
    public void start() {
        System.out.println("BMW start");
    }

    @Override
    public void start(int a) {
        System.out.println("BMW start for Integer");
    }

    // This is the indivudual method of the BMW class
    public void autoParking() {
        System.out.println("BMW --Car Auto Parking");
        applyBreak(); //Method Chaining
        stop(); // this is inheritance
    }


    public void applyBreak() {
        System.out.println("BMW -- Apply break will be smooth");
    }

    //This is called Method Hiding --> Parent is having static method and child is also having exact same method
    public static void billing() {
        System.out.println("BMW Billing");
    }

    /*private void getCarInfo() { //this is the indivudal method of BMW
        System.out.println("BMW get Info");
    }
     */

    public void speedTracking() {
        System.out.println("BMW -- SpeedTracking");
    }

    @Override
    public void engine() {
        System.out.println("BMW Engine");
    }

    public void bmwLoading() {
        Truck tr = new Truck(); //BMW class having Truck class object and able to access the properties and methods --> Composition
        tr.heavyLoading();

        Audi audi = new Audi();
        audi.speedTracking();
    }

    @Override
    public void cruseControl() {
        System.out.println("BMW -- CruseControl");
    }
}
