/*
Die Schnittstelle Iterator
------------------------------------------------------------------------------------------------------------------------
Die Schnittstelle Iterator in Java ermöglicht das sequentielle Durchlaufen einer Sammlung (z.B. Listen, Sets).
Dies ist besonders nützlich, wenn du jeden Eintrag in der Sammlung bearbeiten möchtest.
------------------------------------------------------------------------------------------------------------------------
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Erstellen einer Liste von Strings:

List<String> list = Arrays.asList("a", "b", "c"); erstellt eine unveränderliche Liste mit den Elementen "a", "b" und "c".
------------------------------------------------------------------------------------------------------------------------
2.Erstellen eines Iterators für die Liste:

Iterator<String> iterator = list.iterator(); erstellt einen Iterator für die Liste.
------------------------------------------------------------------------------------------------------------------------
3.Verwenden des Iterators, um durch die Liste zu iterieren:

Die Methode iterator.hasNext() prüft, ob weitere Elemente in der Liste vorhanden sind.
Die Methode iterator.next() gibt das nächste Element in der Liste zurück.
Innerhalb einer while-Schleife werden alle Elemente der Liste ausgegeben.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorBeispiele {
    public static void main(String[] args) {
        // Erstellen einer Liste von Strings
        List<String> list = Arrays.asList("a", "b", "c");

        // Erstellen eines Iterators für die Liste
        Iterator<String> iterator = list.iterator();

        // Verwenden des Iterators, um durch die Liste zu iterieren
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
