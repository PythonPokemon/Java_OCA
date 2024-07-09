/*
Bedingungsblock (Conditional Block)
Dies ist ein Block, der in einer Bedingung wie if, else if oder else verwendet wird.
------------------------------------------------------------------------------------------------------------------------
Syntax

if (Bedingung) {
    // Block in geschweiften Klammern
    // Dieser Code wird ausgeführt, wenn die Bedingung wahr ist
}
------------------------------------------------------------------------------------------------------------------------
* */
package JAVA_Insel_Smart.OCA.Kapitel_1.Code_Blöcke;

public class Bedingungsblock_ConditionalBlock {
    public static void main(String[] args) {
        int x = 10;

        if (x > 5) { // Bedingung in runden Klammern
            System.out.println("x ist größer als 5"); // Block in geschweiften Klammern
        } else {
            System.out.println("x ist kleiner oder gleich 5");
        }

    }
}
