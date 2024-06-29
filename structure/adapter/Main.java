package structure.adapter;

public class Main {
    public static void main(String[] args) {
        LegacyCardReader legacyCardReader = new LegacyCardReader();
        ICardReader cardReader = new CardReaderAdapter(legacyCardReader);

        cardReader.readCard(); // This will call swipeCard() on the legacyCardReader
    }
}