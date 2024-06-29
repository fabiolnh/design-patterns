package structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<java.lang.Character, ICharacterFlyweight> characters = new HashMap<>();

    public ICharacterFlyweight getCharacter(char symbol) {
        ICharacterFlyweight character = characters.get(symbol);
        if (character == null) {
            character = new Character(symbol);
            characters.put(symbol, character);
        }
        return character;
    }
}