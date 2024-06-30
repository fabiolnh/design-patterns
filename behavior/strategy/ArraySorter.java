package behavior.strategy;

public class ArraySorter {
    private ISortingStrategy strategy;

    public void setStrategy(ISortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] numbers) {
        strategy.sort(numbers);
    }
}
