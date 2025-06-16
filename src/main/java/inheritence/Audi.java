package inheritence;

public class Audi extends Car {

    @Override
    public void start() {
        System.out.println("Audi Start");
    }

    public void threadSaftey() {
        System.out.println("Audi Thread Saftey");
    }

    public void autoParking(){
        System.out.println("Audi Auto Parking");
    }

    public void speedTracking(){
        System.out.println("Audi -- SpeedTracking");
    }

}
