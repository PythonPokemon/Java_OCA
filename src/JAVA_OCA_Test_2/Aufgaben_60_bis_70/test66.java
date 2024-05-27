/*
[200, 100, 200]
Gesamterklärung
List kann keine Primitive akzeptieren, sondern nur Objekte.
Wenn also 100 und 200 zur Liste hinzugefügt werden, konvertiert die Auto-Boxing-Funktion diese in Wrapperobjekte vom Typ Integer.

Es werden also 4 Elemente zur Liste hinzugefügt: [100, 200, 100, 200]. list.remove(neue Ganzzahl(100));
Entfernt das erste Vorkommen von 100 aus der Liste, d. h. das 1. Element der Liste.

Die Liste nach dem Entfernen enthält: [200, 100, 200].

HINWEIS: Die String-Klasse und alle Wrapper-Klassen überschreiben die equals(Object)-Methode,
daher gibt es zum Zeitpunkt des Entfernens, wenn eine andere Instanz übergeben wird[new Integer(100)],
kein Problem beim Entfernen des übereinstimmenden Elements.
 * */
package JAVA_OCA_Test_2.Aufgaben_60_bis_70;
import java.util.ArrayList;
import java.util.List;

public class test66 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(new Integer(100)); // entfernt das objekt mit dem element 100 aus dem ersten vorkommen aus der liste

        System.out.println(list);
    }
}
