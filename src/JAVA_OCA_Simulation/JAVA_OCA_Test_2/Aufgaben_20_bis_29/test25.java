/*
Ablauf:
1. Initialisierung der Liste:

List<String> dryFruits = new ArrayList<>();
dryFruits.add("Walnut");
dryFruits.add("Apricot");
dryFruits.add("Almond");
dryFruits.add("Date");

Die Liste dryFruits wird initialisiert und die Elemente "Walnut", "Apricot", "Almond" und "Date" werden hinzugefügt.
------------------------------------------------------------------------------------------------------------------------
2. Erstellen des ListIterator:

ListIterator<String> iterator = dryFruits.listIterator();
Ein ListIterator für die Liste dryFruits wird erstellt. Der Iterator wird am Anfang der Liste positioniert.
------------------------------------------------------------------------------------------------------------------------
3. Durchlaufen der Liste mit dem Iterator:

while (iterator.hasNext()) {
    if (iterator.next().startsWith("A")) {
        iterator.remove();
    }
}

Der while-Loop läuft, solange es ein nächstes Element (hasNext()) gibt.
Bei jedem Durchlauf wird das nächste Element (iterator.next()) überprüft, ob es mit "A" beginnt.
Wenn ein Element mit "A" beginnt, wird es durch den Iterator entfernt (iterator.remove()).
------------------------------------------------------------------------------------------------------------------------
Detaillierte Schritte im while-Loop:
Erster Durchlauf:

iterator.next() gibt "Walnut" zurück. Es beginnt nicht mit "A", daher wird nichts entfernt.
Zweiter Durchlauf:

iterator.next() gibt "Apricot" zurück. Es beginnt mit "A", daher wird "Apricot" entfernt.
Die Liste sieht nun so aus: ["Walnut", "Almond", "Date"].
Dritter Durchlauf:

iterator.next() gibt "Almond" zurück. Es beginnt mit "A", daher wird "Almond" entfernt.
Die Liste sieht nun so aus: ["Walnut", "Date"].
Vierter Durchlauf:

iterator.next() gibt "Date" zurück. Es beginnt nicht mit "A", daher wird nichts entfernt.
Endergebnis:

System.out.println(dryFruits);
Am Ende des Programms wird die geänderte Liste ausgegeben. Die Elemente "Apricot" und "Almond" wurden entfernt, da sie mit "A" beginnen.

[Walnut, Date]
------------------------------------------------------------------------------------------------------------------------
Erklärung: WICHTIG
Der ListIterator ermöglicht das Entfernen von Elementen während des Iterierens,
was mit einem einfachen for-each-Loop nicht möglich wäre, da dies zu einer ConcurrentModificationException führen würde.
------------------------------------------------------------------------------------------------------------------------
Jedes Element, das mit "A" beginnt, wird korrekt identifiziert und entfernt,
was zu der endgültigen Liste führt, die nur noch "Walnut" und "Date" enthält.
 * */

package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_20_bis_29;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class test25 {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        ListIterator<String> iterator = dryFruits.listIterator();
        while(iterator.hasNext()) {
            if(iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println(dryFruits);
    }
}
