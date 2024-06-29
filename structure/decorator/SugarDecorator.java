package structure.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}