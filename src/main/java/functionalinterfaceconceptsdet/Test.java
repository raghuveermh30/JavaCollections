package functionalinterfaceconceptsdet;

@FunctionalInterface
interface Cab {
    public void bookCab();
}

class Ola implements Cab {

    @Override
    public void bookCab() {
        System.out.println("Ola cab is booked..");
    }


}


public class Test {

    public static void main(String[] args) {
        Cab cab = new Ola();
        cab.bookCab(); //using normal approach
        System.out.println("********");

        Cab cab1 = () -> System.out.println("Ola cab is booked.."); //using functional interfacce
        cab1.bookCab();

    }


}
