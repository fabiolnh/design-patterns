package structure.facade;

// Subsystem Class 2
public class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }

    public void setInput(String input) {
        System.out.println("Projector input set to " + input);
    }
}