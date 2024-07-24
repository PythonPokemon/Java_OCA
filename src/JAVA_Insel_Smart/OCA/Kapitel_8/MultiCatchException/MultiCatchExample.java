/*
Wichtige Punkte
------------------------------------------------------------------------------------------------------------------------
Einheitlicher Behandlungsblock:

Wenn Sie mehrere Ausnahmen auf die gleiche Weise behandeln möchten, ist der Multi-Catch-Block eine saubere Lösung.
------------------------------------------------------------------------------------------------------------------------
Keine gemeinsame Oberklasse erforderlich:

Sie müssen keine gemeinsame Oberklasse für die Ausnahmen finden.
Jede Ausnahme kann in den Multi-Catch-Block aufgenommen werden, unabhängig von ihrer Hierarchie.
------------------------------------------------------------------------------------------------------------------------
Unveränderlichkeit der Ausnahmevariable:

Die Ausnahmevariable (e im Beispiel) ist im Multi-Catch-Block final.
Das bedeutet, dass Sie der Ausnahmevariable keinen neuen Wert zuweisen können.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.MultiCatchException;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Dies wird eine ArithmeticException auslösen

            String str = null;
            System.out.println(str.length()); // Dies wird eine NullPointerException auslösen
        } catch (ArithmeticException | NullPointerException e) { // 'e' ist eine finale (ausnahme Referenz variable)
            System.out.println("Fehler: " + e.getMessage());     // bedeutet 'e' kann kein neuer Wert zugewiesen werden.
        } finally {
            System.out.println("Dieser Block wird immer ausgeführt, " +
                               "unabhängig davon, " +
                               "ob eine Ausnahme aufgetreten ist oder nicht.");
        }
    }
}
