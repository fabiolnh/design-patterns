package behavior.visitor;

public interface IComputerPart {
    void accept(IComputerPartVisitor visitor);
}
