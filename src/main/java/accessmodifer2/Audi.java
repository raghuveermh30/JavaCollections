package accessmodifer2;

import accessmodifier.Car;

public class Audi extends Car {

    public static void main(String[] args) {

        Audi car = new Audi();
        car.color = "white";
        car.price = 20;

        //Here only protected and public can accessable

    }
}
