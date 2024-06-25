/*
Erklärung
Der Versuch, ein Element zu der unveränderlichen Liste hinzuzufügen, wird innerhalb eines try-catch-Blocks durchgeführt.
Wenn eine UnsupportedOperationException ausgelöst wird, wird sie im catch-Block abgefangen.
Eine Fehlermeldung wird ausgegeben, anstatt dass das Programm abstürzt.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.UnsupportedOperationException;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class UnsupportedOperationExceptionBehandeln {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("A");
        liste.add("B");

        // Erstellen einer unveränderlichen Liste
        List<String> unveraenderlicheListe = Collections.unmodifiableList(liste);

        try {
            // Versuch, der unveränderlichen Liste ein Element hinzuzufügen
            unveraenderlicheListe.add("C");
        } catch (UnsupportedOperationException e) {
            System.out.println("Fehler: Die Operation wird nicht unterstützt.");
        }
    }
}
