package TestAufgaben;
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        boolean tausch;
        for (int i = 0; i < n - 1; i++) {
            tausch = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    tausch = true;
                }
            }
            if (!tausch) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {65, 21, 42, 38, 55};
        bubbleSort(array);
        System.out.println("Sortiertes Feld:");
        System.out.println(Arrays.toString(array));
    }
}
