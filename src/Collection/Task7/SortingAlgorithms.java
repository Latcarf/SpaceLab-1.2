package Collection.Task7;

public class SortingAlgorithms {

        // Bubble Sort: Complexity O(n^2)
        public static int[] bubbleSort(int[] array) {
            long startTime = System.nanoTime();
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        // Swap elements
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            long endTime = System.nanoTime();
            System.out.println("Bubble Sort took " + (endTime - startTime) + " nanoseconds.");
            return array;
        }

        // Selection Sort: Complexity O(n^2)
        public static int[] selectionSort(int[] array) {
            long startTime = System.nanoTime();
            for (int i = 0; i < array.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }
                // Swap the found minimum element with the first element
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
            long endTime = System.nanoTime();
            System.out.println("Selection Sort took " + (endTime - startTime) + " nanoseconds.");
            return array;
        }

        // Insertion Sort: Complexity O(n^2)
        public static int[] insertionSort(int[] array) {
            long startTime = System.nanoTime();
            for (int i = 1; i < array.length; i++) {
                int key = array[i];
                int j = i - 1;

            /* Move elements of array[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = key;
            }
            long endTime = System.nanoTime();
            System.out.println("Insertion Sort took " + (endTime - startTime) + " nanoseconds.");
            return array;
        }

        // Merge Sort: Complexity O(n log n)
        public static int[] mergeSort(int[] array) {
            long startTime = System.nanoTime();
            if (array.length > 1) {
                int mid = array.length / 2;
                int[] left = new int[mid];
                int[] right = new int[array.length - mid];

                System.arraycopy(array, 0, left, 0, mid);
                System.arraycopy(array, mid, right, 0, array.length - mid);

                mergeSort(left);
                mergeSort(right);

                // Merge the sorted halves
                int i = 0, j = 0, k = 0;
                while (i < left.length && j < right.length) {
                    if (left[i] < right[j]) {
                        array[k++] = left[i++];
                    } else {
                        array[k++] = right[j++];
                    }
                }

                while (i < left.length) {
                    array[k++] = left[i++];
                }

                while (j < right.length) {
                    array[k++] = right[j++];
                }
            }
            long endTime = System.nanoTime();
            System.out.println("Merge Sort took " + (endTime - startTime) + " nanoseconds.");
            return array;
        }

        // Quick Sort: Complexity O(n log n) on average, O(n^2) in the worst case
        public static int[] quickSort(int[] array) {
            long startTime = System.nanoTime();
            quickSort(array, 0, array.length - 1);
            long endTime = System.nanoTime();
            System.out.println("Quick Sort took " + (endTime - startTime) + " nanoseconds.");
            return array;
        }

        private static void quickSort(int[] array, int begin, int end) {
            if (begin < end) {
                int partitionIndex = partition(array, begin, end);

                quickSort(array, begin, partitionIndex - 1);
                quickSort(array, partitionIndex + 1, end);
            }
        }

        private static int partition(int[] array, int begin, int end) {
            int pivot = array[end];
            int i = (begin - 1);

            for (int j = begin; j < end; j++) {
                if (array[j] <= pivot) {
                    i++;

                    int swapTemp = array[i];
                    array[i] = array[j];
                    array[j] = swapTemp;
                }
            }

            int swapTemp = array[i + 1];
            array[i + 1] = array[end];
            array[end] = swapTemp;

            return i + 1;
        }
    }