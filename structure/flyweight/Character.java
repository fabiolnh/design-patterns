package structure.flyweight;

public class Character implements ICharacterFlyweight {
    private char symbol;

    public Character(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void render(String font, int size) {
        System.out.println("Rendering character '" + symbol + "' with font " + font + " and size " + size);
    }
}