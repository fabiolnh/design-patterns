package behavior.strategy;

public class QuickSortStrategy implements ISortingStrategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorting array using Quick Sort strategy");
        // Implementação do Quick Sort
        quickSort(numbers, 0, numbers.length - 1);
    }

    private void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int pi = partition(numbers, low, high);
            quickSort(numbers, low, pi - 1);
            quickSort(numbers, pi + 1, high);
        }
    }

    private int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (numbers[j] < pivot) {
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[high];
        numbers[high] = temp;

        return i + 1;
    }
}
