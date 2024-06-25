/*
Erklärung
In diesem Beispiel wird eine ArrayList erstellt, die große Arrays (int[1000000]) kontinuierlich hinzufügt.
Da keine Objekte aus der Liste entfernt werden, wird der Heap-Speicher irgendwann erschöpft,
was zu einem OutOfMemoryError führt.
------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Errors.Out_Of_Memory_Error;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorAusloesen {
    public static void main(String[] args) {
        List<int[]> liste = new ArrayList<>();

        while (true) {
            liste.add(new int[1000000]);  // Fügt große Arrays zur Liste hinzu
        }
    }
}
