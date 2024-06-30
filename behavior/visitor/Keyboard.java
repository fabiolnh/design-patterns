package behavior.visitor;

public class Keyboard implements IComputerPart {

    @Override
    public void accept(IComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
