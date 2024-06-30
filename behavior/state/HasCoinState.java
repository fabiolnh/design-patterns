package behavior.state;

public class HasCoinState implements IState {
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin ejected.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }

    @Override
    public void selectProduct() {
        System.out.println("Product selected.");
        vendingMachine.setState(vendingMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No product dispensed.");
    }
}
