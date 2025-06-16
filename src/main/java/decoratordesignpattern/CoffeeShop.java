package decoratordesignpattern;

public class CoffeeShop {

    public static void main(String[] args) {

        //Simple Coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $ " + coffee.getCost());

        //Milk Decorator
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $ " + coffee.getCost());

        //Sugar Decorator
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $ " + coffee.getCost());

        //Cream Decorator
        coffee = new CreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " $ " + coffee.getCost());

        System.out.println("Final cost on the coffee $ "+coffee.getCost());

    }
}
