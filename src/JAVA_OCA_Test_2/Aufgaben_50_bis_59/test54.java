/*
Um zu verstehen, wie es zu dem Ergebnis 10 im gegebenen Code kommt, schauen wir uns die einzelnen Schritte im Detail an:

Erstellen und Initialisieren der Liste original:
ArrayList<Integer> original = new ArrayList<>();
original.add(new Integer(10));
Hier wird eine ArrayList mit dem Namen original erstellt und das Integer-Objekt 10 hinzugefügt.
------------------------------------------------------------------------------------------------------------------------
Klonen der Liste original:

ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
Hier wird die Liste original geklont und der neuen Liste cloned zugewiesen. clone() erstellt eine flache Kopie der Liste,
was bedeutet, dass die Struktur der Liste kopiert wird, aber die enthaltenen Objekte werden nicht dupliziert.
Beide Listen enthalten Referenzen auf dasselbe Integer-Objekt 10.
------------------------------------------------------------------------------------------------------------------------
Zugreifen auf das erste Element der geklonten Liste cloned und Inkrementieren:
Integer i1 = cloned.get(0);
++i1;

Hier wird das erste Element der Liste cloned (welches 10 ist) in die Variable i1 gespeichert und dann inkrementiert.
Wichtig zu beachten ist, dass Integer unveränderlich ist.
Das bedeutet, dass i1 auf ein neues Integer-Objekt mit dem Wert 11 zeigt, nachdem es inkrementiert wurde.
Die ursprüngliche Liste cloned und original werden dadurch nicht verändert.
------------------------------------------------------------------------------------------------------------------------
Ausgabe der Liste cloned:

System.out.println(cloned);
Da cloned immer noch auf die ursprüngliche Referenz 10 zeigt und nicht verändert wurde,
enthält cloned immer noch das Integer-Objekt 10.
------------------------------------------------------------------------------------------------------------------------
Zusammengefasst:

Die ArrayList original enthält das Integer-Objekt 10.
Beim Klonen von original wird eine neue ArrayList cloned erstellt, die auf dasselbe Integer-Objekt 10 verweist.
Die Inkrement-Operation ++i1 erzeugt ein neues Integer-Objekt 11, das aber nur von der Variablen i1 verwendet wird
und nicht die ArrayList-Einträge beeinflusst.

Daher bleibt der Inhalt der ArrayList cloned unverändert bei [10].
 * */
package JAVA_OCA_Test_2.Aufgaben_50_bis_59;
import java.util.ArrayList;

public class test54 {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>();
        original.add(new Integer(10));

        ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();  // .clone() Methode kopiert nur das element, das referenziert wurde, nicht das objekt selbst
        Integer i1 = cloned.get(0); // gibt das element aus dem index 0 aus = 10
        ++i1;

        System.out.println(cloned);
    }
}
