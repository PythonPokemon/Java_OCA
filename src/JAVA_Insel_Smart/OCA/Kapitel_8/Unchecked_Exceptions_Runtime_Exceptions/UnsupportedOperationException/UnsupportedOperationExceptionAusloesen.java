/*
Erklärung
In diesem Beispiel wird eine ArrayList erstellt und mit Elementen gefüllt.
Eine unveränderliche Liste wird mit Collections.unmodifiableList erstellt.
Der Versuch, ein Element zu der unveränderlichen Liste hinzuzufügen, führt zu einer UnsupportedOperationException,
da die Liste nicht verändert werden kann.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.UnsupportedOperationException;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class UnsupportedOperationExceptionAusloesen {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("A");
        liste.add("B");

        // Erstellen einer unveränderlichen Liste
        List<String> unveraenderlicheListe = Collections.unmodifiableList(liste);

        // Versuch, der unveränderlichen Liste ein Element hinzuzufügen
        unveraenderlicheListe.add("C");  // Dies löst eine UnsupportedOperationException aus
    }
}
