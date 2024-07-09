/*
Schleifenblock (Loop Block)
Dies ist ein Block, der in einer Schleife wie for, while oder do-while verwendet wird.
------------------------------------------------------------------------------------------------------------------------
Syntax

while (Bedingung) {
    // Block in geschweiften Klammern
    // Dieser Code wird wiederholt ausgeführt, solange die Bedingung wahr ist
}
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_1.Code_Blöcke;

public class Schleifenblock_LoopBlock {
    public static void main(String[] args) {
        int i = 0;

        while (i < 5) { // Bedingung in runden Klammern
            System.out.println("i: " + i); // Block in geschweiften Klammern
            i++;
        }

    }
}
