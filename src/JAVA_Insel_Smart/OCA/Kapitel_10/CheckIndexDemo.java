/*
Erklärung:
------------------------------------------------------------------------------------------------------------------------
Importieren der Klasse Objects:
import java.util.Objects; stellt sicher, d
ass die Objects-Klasse korrekt referenziert wird, sodass du ihre Methoden verwenden kannst.
------------------------------------------------------------------------------------------------------------------------
Definition der Variablen index und size:
index ist der zu überprüfende Index,
und size ist die Größe des Arrays oder der Liste.
------------------------------------------------------------------------------------------------------------------------
Überprüfung des Index: Objects.checkIndex(index, size);
überprüft, ob der Index innerhalb der Grenzen liegt (d.h., 0 <= index < size).
------------------------------------------------------------------------------------------------------------------------
Exception Handling:
Wenn der Index außerhalb der Grenzen liegt, wird eine IndexOutOfBoundsException geworfen,
die im catch-Block abgefangen wird, und eine entsprechende Nachricht wird ausgegeben.
------------------------------------------------------------------------------------------------------------------------
Beispiel mit einem ungültigen Index: Zeigt, wie der catch-Block funktioniert, wenn ein ungültiger Index überprüft wird.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10;

import java.util.Objects;

public class CheckIndexDemo {
    public static void main(String[] args) {
        int index = 5;
        int size = 10;

        try {
            // Überprüft, ob der Index innerhalb der Grenzen liegt
            Objects.checkIndex(index, size);
            System.out.println("Index ist gültig.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index ist ungültig: " + e.getMessage());
        }

        // Beispiel mit einem ungültigen Index
        int invalidIndex = 15;

        try {
            // Überprüft, ob der ungültige Index innerhalb der Grenzen liegt
            Objects.checkIndex(invalidIndex, size);
            System.out.println("Index ist gültig.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index ist ungültig: " + e.getMessage());
        }
    }
}
