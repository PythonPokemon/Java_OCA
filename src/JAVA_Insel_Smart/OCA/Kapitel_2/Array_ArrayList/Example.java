/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Das Array intArray speichert primitive int-Werte direkt.
------------------------------------------------------------------------------------------------------------------------
Das Array integerArray speichert Referenzen auf Integer-Objekte.
------------------------------------------------------------------------------------------------------------------------
Die ArrayList intList speichert ebenfalls Referenzen auf Integer-Objekte,
die durch Autoboxing aus primitiven int-Werten erstellt wurde
------------------------------------------------------------------------------------------------------------------------
* */
package JAVA_Insel_Smart.OCA.Kapitel_2.Array_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        // Array von primitiven int-Werten
        int[] intArray = {1, 2, 3, 4};
        System.out.println("Array von primitiven int-Werten:");
        for (int i : intArray) {
            System.out.println(i);
        }

        // Array von Integer-Objekten
        Integer[] integerArray = {1, 2, 3, 4};
        System.out.println("\nArray von Integer-Objekten:");
        for (Integer i : integerArray) {
            System.out.println(i);
        }

        // ArrayList von Integer-Objekten
        List<Integer> intList = new ArrayList<>();
        intList.add(1); // Autoboxing
        intList.add(2);
        System.out.println("\nArrayList von Integer-Objekten:");
        for (Integer i : intList) {
            System.out.println(i);
        }
    }
}
