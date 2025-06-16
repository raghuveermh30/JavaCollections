package decoratordesignpattern;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.5; //Additional cost
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk"; //Additional entity called Milk added
    }
}
