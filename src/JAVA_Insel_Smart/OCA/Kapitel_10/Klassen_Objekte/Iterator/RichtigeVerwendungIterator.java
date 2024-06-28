/*
Regeln für die Verwendung von Iteratoren
------------------------------------------------------------------------------------------------------------------------
1.Verwende hasNext() und next():

Verwende die Methode hasNext(), um zu prüfen, ob weitere Elemente vorhanden sind,
und next(), um das nächste Element abzurufen. Vermeide es, next() ohne vorherige Prüfung mit hasNext() aufzurufen,
da dies zu einer NoSuchElementException führen kann.


while (iterator.hasNext()) {
    String s = iterator.next();
    System.out.println(s);
}
------------------------------------------------------------------------------------------------------------------------
2.Verwende remove() richtig:

Verwende die Methode remove(), um das zuletzt von next() zurückgegebene Element zu entfernen.
Rufe remove() nicht mehrmals hintereinander ohne einen next()-Aufruf auf,
da dies zu einer IllegalStateException führen kann.


if ("Banane".equals(s)) {
    iterator.remove();  // Entfernt das aktuelle Element
}
------------------------------------------------------------------------------------------------------------------------
3.Vermeide ConcurrentModificationException:

Änderungen an der Sammlung während der Iteration (außer durch iterator.remove())
führen zu einer ConcurrentModificationException.

Verwende Iteratoren korrekt, um solche Probleme zu vermeiden.


while (iterator.hasNext()) {
    String s = iterator.next();
    if ("Banane".equals(s)) {
        iterator.remove();  // Korrekt, da über Iterator entfernt wird
    }
}
------------------------------------------------------------------------------------------------------------------------
Iteratoren für verschiedene Sammlungen:

Iteratoren können für verschiedene Arten von Sammlungen wie Listen, Sets und Maps verwendet werden.
Bei Maps musst du den Iterator auf entrySet(), keySet() oder values() anwenden.


Map<String, String> map = new HashMap<>();
map.put("A", "1");
map.put("B", "2");

Iterator<Map.Entry<String, String>> mapIterator = map.entrySet().iterator();
while (mapIterator.hasNext()) {
    Map.Entry<String, String> entry = mapIterator.next();
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RichtigeVerwendungIterator {
    public static void main(String[] args) {
        // Erstellen und Füllen einer ArrayList
        List<String> list = new ArrayList<>();
        list.add("Apfel");
        list.add("Banane");
        list.add("Kirsche");

        // Erstellen eines Iterators für die Liste
        // iterator ist wie ein Steuereintreiber, der von haus zu haus geht und die darin enthaltenen elemente prüft
        // in diesem beispiel prüft der iterator/steuereintreiber das haus 'list' mit den darin enthaltenen elementen
        Iterator<String> iterator = list.iterator();

        // Verwenden des Iterators, um durch die Liste zu iterieren und ein bestimmtes Element zu entfernen
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println("Aktuelles Element: " + s);
            if ("Banane".equals(s)) {
                iterator.remove();  // Entfernen des aktuellen Elements
                System.out.println("Element 'Banane' entfernt");
            }
        }

        // Ausgabe der Liste nach dem Entfernen des Elements
        System.out.println("Liste nach dem Entfernen: " + list);
    }
}
