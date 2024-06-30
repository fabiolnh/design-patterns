package behavior.iterator;

public interface IAggregate<T> {
    IIterator<T> createIterator();
}
