package behavior.strategy;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 9, 3, 7};

        ArraySorter sorter = new ArraySorter();

        // Bubble Sort
        sorter.setStrategy(new BubbleSortStrategy());
        sorter.sortArray(numbers.clone());

        // Quick Sort
        sorter.setStrategy(new QuickSortStrategy());
        sorter.sortArray(numbers.clone());
    }
}