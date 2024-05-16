/*
 * 1985-03-16
 *
 * Gesamterklärung
Die Methoden minusYears, minusMonths, minusWeeks, minusDays akzeptieren den Parameter long, sodass Sie entweder einen positiven oder einen negativen Wert übergeben können.

Wenn ein positiver Wert übergeben wird, wird dieser angegebene Wert subtrahiert, und wenn ein negativer Wert übergeben wird,
wird dieser angegebene Wert addiert. Ich denke, Sie erinnern sich noch: Minus Minus ist Plus.

In ähnlicher Weise funktionieren die Methoden plusYears, plusMonths, plusWeeks, plusDays auf die gleiche Weise.

Wenn ein positiver Wert übergeben wird, wird dieser angegebene Wert addiert,
und wenn ein negativer Wert übergeben wird, wird dieser angegebene Wert subtrahiert.
 * */
package JAVA_OCA_Test_2.Aufgaben_40_bis_49;
import java.time.LocalDate;

public class test48 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1980-03-16");
        System.out.println(date.minusYears(-5));
    }
}
