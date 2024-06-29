package structure.facade;

// Subsystem Class 1
public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void play(String movie) {
        System.out.println("Playing " + movie);
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }
}