package structure.decorator;

// ConcreteDecorators
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 1.5;
    }
}