package Algorythmen.Sortieralgorithmen;

/**
 * Dieser Algorithmus verwendet eine optimierte Methode, um das Einfügen eines Elements an der richtigen Stelle im sortierten Teil des Java_Anfänger_zum_Profi.Arrays zu beschleunigen.
 * Statt jedes Mal alle vorherigen Elemente zu verschieben, um Platz für das aktuelle Element zu machen,
 * wird nur die Position des aktuellen Elements im sortierten Teil des Java_Anfänger_zum_Profi.Arrays gesucht und das aktuelle Element an diese Stelle eingefügt.
 * Dies verbessert die Effizienz des Algorithmus insbesondere für teilweise sortierte Java_Anfänger_zum_Profi.Arrays.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Unsortiertes Array:");
        printArray(arr);

        smartInsertionSort(arr);

        System.out.println("\nSortiertes Array:");
        printArray(arr);
    }

    public static void smartInsertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

