package structure.adapter;

// Adapter class
public class CardReaderAdapter implements ICardReader {
    private LegacyCardReader legacyCardReader;

    public CardReaderAdapter(LegacyCardReader legacyCardReader) {
        this.legacyCardReader = legacyCardReader;
    }

    @Override
    public void readCard() {
        // Convert the interface call to the adaptee's method
        legacyCardReader.swipeCard();
    }
}