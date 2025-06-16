package functionalinterfaceconceptsdet;

@FunctionalInterface
interface Car {
    public String bookCar(String source, String destination);
}

class OlaCab implements Car {

    @Override
    public String bookCar(String source, String destination) {
        System.out.println("Ola cab is booked from " + source + " to " + destination);
        return ("Price is 5000 INR");
    }
}


public class Example2 {


    public static void main(String[] args) {
        Car car = new OlaCab();
        car.bookCar("Bangalore", "Chennai");

        //   Car car1 = ((source, destination) -> System.out.println("Ola cab is booked from " + source + " to " + "destination"));
        //     car1.bookCar("Hyd", "Bangalore");

        Car car2 = new OlaCab();
        String res = car2.bookCar("BLR", "MUM");
        System.out.println(res);

        Car car3 = (source, destination) -> {
            System.out.println("Ola cab is booked from " + source + " to " + "destination");
            return ("Price is 5000 INR");
        };
        System.out.println(car3.bookCar("Hyd", "Bangalore"));
    }
}
