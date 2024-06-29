package structure.flyweight;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        String document = "Hello, Flyweight!";
        for (char symbol : document.toCharArray()) {
            ICharacterFlyweight character = factory.getCharacter(symbol);
            character.render("Arial", 12);
        }
    }
}