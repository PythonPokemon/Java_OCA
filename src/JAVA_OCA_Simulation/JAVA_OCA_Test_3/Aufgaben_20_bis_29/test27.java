/*
[]

Gesamterklärung
Da list nur Wrapper-Objekte und keine Primitive speichern kann,
für list.add(110); Auto-Boxing erstellt ein Integer-Objekt {110}.
for list.add(new Integer(110)); as new-Schlüsselwort verwendet wird, damit ein weiteres Integer-Objekt {110} erstellt wird.
für den 3. Aufruf der Add-Methode, list.add(110); Auto-Boxing setzt ein und da 110 zwischen -128 und 127 liegt,
wird auf das bei der 1. Anweisung erstellte Integer-Objekt verwiesen.

removeIf(Predicate)-Methode wurde als Standardmethode in der Collection-Schnittstelle in JDK 8 hinzugefügt
und entfernt alle Elemente dieser Collection, die das angegebene Prädikat erfüllen.

Boolescher Ausdruck ist: i == 110; In diesem Ausdruck ist i ein Wrapper-Objekt und 110 ist ein int-Literal,
sodass Java den int-Wert des Wrapper-Objekts i extrahiert und dann gleichsetzt. Da alle 3 Objekte 110 speichern,
wird true zurückgegeben. Alle ganzzahligen Objekte werden aus der Liste entfernt.

If list.removeIf(i -> i == new Integer(110)); verwendet wurde, würden alle drei Listenelemente false zurückgeben,
da Objektreferenzen und nicht Inhalte gleichgesetzt werden.

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_20_bis_29;
import java.util.ArrayList;
import java.util.List;

public class test27 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(110);
        list.add(new Integer(110));
        list.add(110);
        list.add(114);

        // Boolean vergleich
        list.removeIf(i -> i == 110);// entfernt alle objekte mit dem Element 110 aus der list. wenn sie 110 entsprechen
        list.remove(1); // entfernt das Objekt das noch übrig ist (114) normalerweise Index 4
                              // aber da alle vorher schon entfernt wurden, rutscht index 4 auf index 0!
                              // bedeutet list.remove(1); aus dem Index 1 würde .IndexOutOfBoundsException auslösen!

        System.out.println(list);
    }
}
