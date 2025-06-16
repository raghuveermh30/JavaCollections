package decoratordesignpattern;

public class CreamDecorator extends CoffeeDecorator {


    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 5.5; //Additional cost
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Adding Extra Vanilla Cream"; //Additional entity called Vanilla cream
    }
}
