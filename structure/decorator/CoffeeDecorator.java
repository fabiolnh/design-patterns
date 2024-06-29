package structure.decorator;

// Decorator
public abstract class CoffeeDecorator implements ICoffee {
    protected ICoffee decoratedCoffee;

    public CoffeeDecorator(ICoffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}