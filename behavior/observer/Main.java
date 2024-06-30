package behavior.observer;

public class Main {
    public static void main(String[] args) {
        NewsChannel newsChannel = new NewsChannel();

        IObserver subscriber1 = new Subscriber("John");
        IObserver subscriber2 = new Subscriber("Alice");
        IObserver subscriber3 = new Subscriber("Bob");

        newsChannel.registerObserver(subscriber1);
        newsChannel.registerObserver(subscriber2);
        newsChannel.registerObserver(subscriber3);

        newsChannel.setNews("Breaking News: New Observer Pattern Implemented!");
        
        newsChannel.removeObserver(subscriber2);

        newsChannel.setNews("Update: Observer Pattern Example Updated!");
    }
}
