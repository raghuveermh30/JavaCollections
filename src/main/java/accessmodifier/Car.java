package accessmodifier;

public class Car {

    String name;
    public int price;
    protected String color;
    private String chasisNum;

    /**
     * There is no private class but we can create the private, public and protected constructor
     * <p>
     * Protected method also can be overridden
     *
     * Protected constructor cannot be accessed from different package parent class
     */

    public void carBilling() {
        System.out.println("car--billing");
    }

    protected void refuel() {
        System.out.println("Car--refuel");
    }


    public static void main(String[] args) {

        Car car = new Car();
        car.chasisNum = "1234";
    }
}
