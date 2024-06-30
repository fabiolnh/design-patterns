package behavior.interpreter;

public class SubtractExpression implements IExpression {
    private IExpression leftExpression;
    private IExpression rightExpression;

    public SubtractExpression(IExpression leftExpression, IExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return this.leftExpression.interpret() - this.rightExpression.interpret();
    }
}
