package Algorythmen.Sortieralgorithmen;

/**
 * Dieser Algorithmus verwendet eine Optimierung, indem er nicht alle Elemente vergleicht und tauscht,
 * sondern nur das kleinste Element im unsortierten Teil des Arrays auswählt und es mit dem ersten Element dieses Teils tauscht.
 * Dies verbessert die Effizienz des Algorithmus insbesondere für größere Arrays.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Unsortiertes Array:");
        printArray(arr);

        smartSelectionSort(arr);

        System.out.println("\nSortiertes Array:");
        printArray(arr);
    }

    public static void smartSelectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted part of array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
