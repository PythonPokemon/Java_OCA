/*
 * Gesamterklärung
Das ist etwas knifflig. Denken Sie nur daran:
Zwei Instanzen der folgenden Wrapperobjekte, die durch Auto-Boxing erstellt wurden, sind immer gleich, wenn ihre primitiven Werte identisch sind:
Boolesch
Byte
Zeichen von \u0000 bis \u007f (7f entspricht 127),
Short und Integer von -128 bis 127.

Für die 1. Anweisung, list.add(27); => Auto-Boxing erstellt ein ganzzahliges Objekt für 27.
Für die 2. Anweisung, list.add(27); => Java-Compiler stellt fest, dass sich bereits ein Integer-Objekt mit dem Wert 27 im Speicher befindet, also verwendet er dasselbe Objekt.

Deshalb System.out.println(list.get(0) == list.get(1)); Gibt true zurück.
new Integer(27) erstellt ein neues Objekt im Speicher, also System.out.println(list.get(2) == list.get(3)); Gibt false zurück.
*
true
false
 * */

package JACA_OCA_Test_2.Aufgaben_1_bis_9;
import java.util.ArrayList;
import java.util.List;

public class test5 {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(27);
        list.add(27);

        list.add(new Integer(27));
        list.add(new Integer(27));

        System.out.println(list.get(0) == list.get(1));
        System.out.println(list.get(2) == list.get(3));
    }
}
