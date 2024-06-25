/*
Erklärung
Die Methode verursacheOutOfMemoryError führt denselben Code aus wie im vorherigen Beispiel,
der einen OutOfMemoryError verursacht.

Der try-catch-Block in der main-Methode fängt den OutOfMemoryError ab und gibt eine Fehlermeldung aus.
Sie können auch Bereinigungsaktionen oder Freigabe von Ressourcen durchführen, wenn der Fehler auftritt.
------------------------------------------------------------------------------------------------------------------------
Der OutOfMemoryError ist eine Error-Klasse, und wie bei anderen schweren Fehlern
sollte die Hauptstrategie darin bestehen, diesen zu vermeiden.
Wenn Sie jedoch wissen, dass Ihr Programm potentiell einen OutOfMemoryError verursachen kann, können Sie versuchen,
es abzufangen und entsprechende Maßnahmen zu ergreifen:
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Errors.Virtual_Machine_Error.Out_Of_Memory_Error;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorBehandeln {
    public static void main(String[] args) {
        try {
            verursacheOutOfMemoryError();
        } catch (OutOfMemoryError e) {
            System.out.println("Fehler: Nicht genügend Speicher verfügbar.");
            // Bereinigen oder Ressourcen freigeben
        }
    }

    public static void verursacheOutOfMemoryError() {
        List<int[]> liste = new ArrayList<>();

        while (true) {
            liste.add(new int[1000000]);  // Fügt große Arrays zur Liste hinzu
        }
    }
}
