package behavior.interpreter;

public class NumberExpression implements IExpression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
