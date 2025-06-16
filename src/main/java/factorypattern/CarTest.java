package factorypattern;

public class CarTest {

    public static void main(String[] args) {



        CarFactory carFactory = new CarFactory();
        Car suvCar = carFactory.getCar("SUV");
        suvCar.assemble();

        Car sedanCar = carFactory.getCar("Sedan");
        sedanCar.assemble();

        Car miniCar = carFactory.getCar("Mini");
        miniCar.assemble();
    }
}
