/*
Erklärung
Die Konvertierung der Zeichenkette in eine Ganzzahl wird innerhalb eines try-catch-Blocks durchgeführt.
Wenn eine NumberFormatException ausgelöst wird, wird sie im catch-Block abgefangen.
Eine Fehlermeldung wird ausgegeben, anstatt dass das Programm abstürzt.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.NumberFormatException;

public class NumberFormatExceptionBehandeln {
    public static void main(String[] args) {
        String zahlAlsText = "abc";

        try {
            int zahl = Integer.parseInt(zahlAlsText);
            System.out.println("Die Zahl ist: " + zahl);
        } catch (NumberFormatException e) {
            System.out.println("Fehler: Ungültiges Zahlenformat.");
        }
    }
}
