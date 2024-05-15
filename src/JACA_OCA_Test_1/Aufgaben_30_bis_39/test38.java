/*
*Dieser Code demonstriert die Verwendung von clone() und seine Auswirkungen auf Objekte, die als Elemente einer ArrayList enthalten sind.
*
* Eine Klasse namens Counter wird definiert, die eine einfache Zählervariable count enthält
* und eine benutzerdefinierte toString()-Methode überschreibt, um eine lesbare Darstellung des Zählers zu liefern.
*
* In der main-Methode wird eine ArrayList namens original erstellt und ein neues Counter-Objekt mit dem Wert 10 hinzugefügt.
* Mit der Methode clone() wird eine tiefe Kopie der original-ArrayList erstellt und in die cloned-ArrayList gespeichert.
*
* Da es sich um eine tiefe Kopie handelt, werden die Elemente der original- und cloned-ArrayList unterschiedliche Objekte sein,
* aber sie werden auf die gleichen Objekte verweisen.
*
* Durch den Aufruf cloned.get(0).count = 5; wird die count-Variable des ersten Elements in der cloned-ArrayList auf 5 gesetzt.
* Da das erste Element in beiden ArrayLists auf dasselbe Counter-Objekt verweist,
* wird diese Änderung sowohl in der original- als auch in der cloned-ArrayList sichtbar sein.
*
* Schließlich wird die original-ArrayList mittels System.out.println(original); ausgegeben.
* Da die toString()-Methode überschrieben wurde, wird eine lesbare Darstellung der Counter-Objekte in der original-ArrayList angezeigt,
* einschließlich des geänderten Werts von 5 für den Zähler.
* */

package JACA_OCA_Test_1.Aufgaben_30_bis_39;
import java.util.ArrayList;

class Counter {
    int count;

    Counter(int count) {
        this.count = count;
    }

    public String toString() {
        return "Counter " + count;
    }
}

public class test38 {
    public static void main(String[] args) {
        ArrayList<Counter> original = new ArrayList<>();
        original.add(new Counter(10));  // index 0
        original.add(new Counter(15));  // index 1
        original.add(new Counter(20));  // index 1

        ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();  // cloned ist eine Methode die, die werte aus dieser methode auf die werte über die der originalen methode überschreibt!
        cloned.get(0).count = 5;    // .get(0) verweist auf den index der arrayliste
        cloned.get(1).count = 5;

        System.out.println(original);   // was kommt raus?
    }
}
