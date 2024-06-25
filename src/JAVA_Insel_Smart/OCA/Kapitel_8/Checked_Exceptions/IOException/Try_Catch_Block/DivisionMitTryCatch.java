/*
Erklärung
Ausnahmebehandlung mit try-catch-Block:

Die Methode dividiere behandelt die ArithmeticException direkt mit einem try-catch-Block.
Wenn eine Division durch Null erfolgt, gibt die Methode eine Fehlermeldung aus und gibt 0 zurück.
In der main-Methode ist kein try-catch-Block erforderlich,
da die Ausnahme bereits in der dividiere-Methode behandelt wird.
------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Checked_Exceptions.IOException.Try_Catch_Block;

public class DivisionMitTryCatch {
    public static void main(String[] args) {
        int ergebnis = dividiere(10, 0);
        System.out.println("Ergebnis: " + ergebnis);
    }

    public static int dividiere(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Fehler in der Methode: Division durch Null.");
            return 0;
        }
    }
}
