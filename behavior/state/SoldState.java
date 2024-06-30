package behavior.state;

public class SoldState implements IState {
    private VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, we're already giving you a product.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Sorry, you already selected a product.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product already selected.");
    }

    @Override
    public void dispense() {
        System.out.println("Product dispensed.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }
}
