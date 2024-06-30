package behavior.visitor;

public class Mouse implements IComputerPart {

    @Override
    public void accept(IComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
