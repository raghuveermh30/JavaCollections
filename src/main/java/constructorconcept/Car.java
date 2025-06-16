package constructorconcept;

public class Car {

    String name;
    String color;
    double price;
    String model;
    String chasisNum;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Car(String name, double price, String color, String model) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.model = model;
    }

    public Car(String name, String color, double price, String model, String chasisNum) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.model = model;
        this.chasisNum = chasisNum;
    }

    public static void main(String[] args) {

        Car c1 = new Car("Nexon", "White");
        System.out.println(c1.name + " " + c1.color);

        Car c2 = new Car("BMW", 30.66, "White", "2017");
        System.out.println(c2.name + " " + c2.price + " " + c2.color + " " + c2.model);


        Car c3 = new Car("Nexon", 12.50);
        System.out.println(c3.price + " " + c3.name);

        Car c4 = new Car("Nexon", "white", 12.33, "2022", "12344");
        System.out.println(c4.name + " " + c4.color + " " + c4.price + " " + c4.model + " " + c4.chasisNum);



    }
}
