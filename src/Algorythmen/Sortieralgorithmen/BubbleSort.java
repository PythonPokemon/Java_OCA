package Algorythmen.Sortieralgorithmen;

/**
 * Dieser Algorithmus verwendet einen zusätzlichen boolean-Wert swapped,
 * um zu verfolgen, ob während eines Durchlaufs durch das Array ein Tausch durchgeführt wurde.
 * Wenn kein Tausch durchgeführt wurde, ist das Array bereits sortiert, und der Algorithmus kann beendet werden.
 * Dies verbessert die Effizienz des Algorithmus insbesondere für bereits teilweise sortierte Java_Anfänger_zum_Profi.Arrays.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Unsortiertes Array:");
        printArray(arr);

        smartBubbleSort(arr);

        System.out.println("\nSortiertes Array:");
        printArray(arr);
    }

    public static void smartBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

