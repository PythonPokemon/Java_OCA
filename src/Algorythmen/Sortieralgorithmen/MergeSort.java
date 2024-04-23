package Algorythmen.Sortieralgorithmen;

/**
 * Dieser Algorithmus teilt das Array in zwei Hälften, sortiert jede Hälfte separat und fusioniert dann die sortierten Hälften.
 * Die Hauptfunktion mergeSort() ruft sich rekursiv auf, um die Hälften zu sortieren, und die merge()-Funktion fügt dann die sortierten Hälften zusammen.
 * Diese Implementierung hat eine Zeitkomplexität von O(n log n).
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Unsortiertes Array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSortiertes Array:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[middle + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
