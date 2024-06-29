package structure.adapter;

// Adaptee class with a different interface
public class LegacyCardReader {
    public void swipeCard() {
        System.out.println("Card swiped using LegacyCardReader");
    }
}