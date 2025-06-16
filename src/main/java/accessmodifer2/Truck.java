package accessmodifer2;

import accessmodifier.Car;

public class Truck {

    public static void main(String[] args) {

        Car car = new Car();
        car.price=20;

        //Here only public property can access
    }
}
