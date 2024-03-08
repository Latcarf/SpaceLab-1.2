package Collection.Task7;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 45, 32, 2, 78, 543, 11, 33};

        SortingAlgorithms.bubbleSort(array);

        SortingAlgorithms.selectionSort(array);

        SortingAlgorithms.insertionSort(array);

        SortingAlgorithms.mergeSort(array);

        SortingAlgorithms.quickSort(array);

    }
}