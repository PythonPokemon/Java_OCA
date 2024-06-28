/*
Regeln für die Verwendung der Iterable-Schnittstelle
------------------------------------------------------------------------------------------------------------------------
1.Implementierung der iterator()-Methode:

Jede Klasse, die Iterable implementiert,
muss die Methode iterator() überschreiben, um einen Iterator zurückzugeben.

@Override
public Iterator<String> iterator() {
    return list.iterator();
}
------------------------------------------------------------------------------------------------------------------------
2.Verwendung mit erweitertem for:

Klassen, die Iterable implementieren, können direkt in erweiterten for-Schleifen verwendet werden.


for (String s : iterable) {
    System.out.println(s);
}
------------------------------------------------------------------------------------------------------------------------
3.Vermeidung von ConcurrentModificationException:

Ändere die zugrunde liegende Sammlung nicht während der Iteration, es sei denn,
du verwendest den Iterator selbst zum Entfernen von Elementen.


Iterator<String> iterator = iterable.iterator();
while (iterator.hasNext()) {
    String s = iterator.next();
    if ("Banane".equals(s)) {
        iterator.remove();  // Sicheres Entfernen des aktuellen Elements
    }
}
------------------------------------------------------------------------------------------------------------------------
Nützliche Methoden der Iterator-Schnittstelle:

hasNext(): Überprüft, ob weitere Elemente vorhanden sind.
next(): Gibt das nächste Element zurück.
remove(): Entfernt das zuletzt zurückgegebene Element aus der zugrunde liegenden Sammlung.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class MyIterable implements Iterable<String> {
    private List<String> list = Arrays.asList("Apfel", "Banane", "Kirsche");

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }
}

public class RichtigeVerwendungIterable {
    public static void main(String[] args) {
        MyIterable iterable = new MyIterable();

        // Verwenden des erweiterten for, um durch die benutzerdefinierte Iterable zu iterieren
        for (String s : iterable) {
            System.out.println("Aktuelles Element: " + s);
        }

//        // Alternativ: Verwenden eines expliziten Iterators
//        Iterator<String> iterator = iterable.iterator();
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            System.out.println("Iterator-Element: " + s);
//        }

    }
}
