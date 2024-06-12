/*
-28000-01-01

Gesamterklärung
In der LocalDate-Klasse stehen 2 Methoden zur Verfügung: of(int, int, int) und of(int, Month, int).
Month kann entweder als int-Wert (1 bis 12) oder als Enumerationskonstanten Month.JANUARY bis Month.DEDECEMBER übergeben werden.

Die Methode Period.parse(CharSequence) akzeptiert den String-Parameter im Format "PnYnMnD", hier können P,Y,M und D auf jeden Fall sein.
 "p-30000y" bedeutet Zeitraum von -30000 Jahren.

Das minimal unterstützte LocalDate ist: {-9999999999-01-01} und das maximal unterstützte LocalDate: {+999999999-12-31}.
Wenn der Zeitraum von -30000 Jahren zum 1. Januar 2000 addiert wird, dann ist das Ergebnis der 1. Januar -28000.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_10_bis_19;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class test12 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
        Period period = Period.parse("p-30000y");   // "p-" korrekte syntax
        System.out.println(date.plus(period));
    }
}
