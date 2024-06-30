package behavior.state;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin();
        vendingMachine.selectProduct();
        vendingMachine.dispense();

        vendingMachine.insertCoin();
        vendingMachine.ejectCoin();

        vendingMachine.insertCoin();
        vendingMachine.selectProduct();
        vendingMachine.insertCoin();
        vendingMachine.dispense();
    }
}
