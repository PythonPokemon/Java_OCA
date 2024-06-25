/*
Es ist wichtig zu beachten, dass StackOverflowError eine Error-Klasse und keine Exception-Klasse ist.
Dies bedeutet, dass es sich um einen schwerwiegenden Fehler handelt, den man normalerweise nicht abfangen sollte,
sondern durch entsprechende Programmierung vermeiden sollte.
------------------------------------------------------------------------------------------------------------------------
Erklärung
In diesem Beispiel wird die Methode rekursiveMethode so geändert, dass sie eine Abbruchbedingung hat (count == 0),
um unendliche Rekursion zu vermeiden.
Der try-catch-Block fängt den StackOverflowError ab, falls er dennoch auftritt, und gibt eine Fehlermeldung aus.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Errors.Virtual_Machine_Error.Stack_Overflow_Error;

public class StackOverflowErrorBehandeln {
    public static void main(String[] args) {
        try {
            rekursiveMethode(1);
        } catch (StackOverflowError e) {
            System.out.println("Fehler: Stapelspeicher ist voll.");
        }
    }

    public static void rekursiveMethode(int count) {
        if (count == 0) {
            return;  // Abbruchbedingung
        }
        rekursiveMethode(count - 1);
    }
}
