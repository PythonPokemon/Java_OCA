/*
2006-01-29

Gesamterklärung
joiningDate --> {2006-03-16}.
joiningDate.withDayOfYear(29) gibt ein neues LocalDate-Objekt zurück, an dem der Tag des Jahres geändert wurde.
Ein Jahr hat 365 Tage, also bedeutet 29 den 29. Tag des Jahres, also den 29. Januar 2006.

HINWEIS: Es gibt andere Methoden, die Sie für die Prüfung kennen sollten. withDayOfMonth(int), withMonth(int) und withYear(int).
 * */
package JAVA_OCA_Test_3.Aufgaben_30_bis_39;
import java.time.LocalDate;

public class test36 {
    public static void main(String [] args) {
        LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(joiningDate.withDayOfYear(29));  // überschreibt den letzten tag 16: .withDayOfYear(29)
    }
}
