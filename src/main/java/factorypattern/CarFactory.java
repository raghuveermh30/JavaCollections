package factorypattern;

public class CarFactory {


    /*
     * Factory Pattern is isolation on the Object Creation.
     * We need to create the abstract class to hide the Functionality
     * The Factory Pattern is called so because it functions similarly to a real-world factory.
     * Just as a factory manufactures products without the client knowing the exact process or details of the manufacturing,
       the Factory Pattern creates objects without the client knowing the specific class or instantiation details.

    * Factory Pattern example in Java for initializing WebDriver instances for different browsers (Chrome, Firefox, Edge, Safari).
     */

    public Car getCar(String carType) {
        if (carType == null) {
            return null;
        }

        if (carType.equalsIgnoreCase("SUV")) {
            return new SUV();
        } else if (carType.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (carType.equalsIgnoreCase("Mini")) {
            return new Mini();
        }
        return null;
    }

}
