package behavior.state;

public class VendingMachine {
    private IState noCoinState;
    private IState hasCoinState;
    private IState soldState;
    private IState currentState;

    public VendingMachine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);

        currentState = noCoinState;
    }

    public void setState(IState state) {
        currentState = state;
    }

    public IState getNoCoinState() {
        return noCoinState;
    }

    public IState getHasCoinState() {
        return hasCoinState;
    }

    public IState getSoldState() {
        return soldState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void selectProduct() {
        currentState.selectProduct();
    }

    public void dispense() {
        currentState.dispense();
    }
}
