package behavior.strategy;

public class BubbleSortStrategy implements ISortingStrategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorting array using Bubble Sort strategy");
        // Implementação do Bubble Sort
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // troca numbers[j+1] e numbers[j]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
