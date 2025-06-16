package decoratordesignpattern;

public class SugarDecorator extends CoffeeDecorator{


    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 3.5; //Additional cost
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Adding Extra Sugar"; //Additional extra Sigar
    }
}
