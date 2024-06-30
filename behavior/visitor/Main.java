package behavior.visitor;

public class Main {

    public static void main(String[] args) {
        IComputerPart computer = new Computer();
        IComputerPartVisitor visitor = new ComputerPartDisplayVisitor();
        computer.accept(visitor);
    }
}