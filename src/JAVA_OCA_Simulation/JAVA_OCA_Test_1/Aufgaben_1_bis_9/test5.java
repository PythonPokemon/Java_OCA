/*
* Was passiert im Code?
Erstellung des Datums:

LocalDate date = LocalDate.of(2012, 1, 11);
Ein LocalDate-Objekt wird erstellt, das den 11. Januar 2012 repräsentiert.
Erstellung des Period-Objekts:

Period period = Period.ofMonths(2);
Ein Period-Objekt wird erstellt, das eine Zeitspanne von 2 Monaten darstellt.
Erstellung des DateTimeFormatter:

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
Ein DateTimeFormatter-Objekt wird erstellt, das das Format "MM-dd-yy" verwendet, um Datumswerte zu formatieren.
Formatierung und Ausgabe:

System.out.println(formatter.format(date.minus(period)));
Das Datum date wird um die Zeitspanne period (2 Monate) reduziert.
Das resultierende Datum, nachdem 2 Monate abgezogen wurden, wird im Format "MM-dd-yy" formatiert und auf der Konsole ausgegeben.
*-----------------------------------------------------------------------------------------------------------------------
Warum wird "11-11-11" ausgegeben?
Das ursprüngliche Datum ist der 11. Januar 2012.
Wenn 2 Monate von diesem Datum abgezogen werden, landen wir im November 2011.
Das formatierte Datum wird als "MM-dd-yy" angezeigt, wobei "MM" für den Monat steht, "dd" für den Tag und "yy" für das Jahr (zweistellig).
Daher wird "11-11-11" ausgegeben, was bedeutet, dass es der 11. November 2011 ist.
*
* Wo wird im Code die Subtraktion von 2 Monaten durchgeführt?
Die Subtraktion von 2 Monaten wird in dieser Zeile durchgeführt:
* System.out.println(formatter.format(date.minus(period)));

* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_1_bis_9;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class test5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.println(formatter.format(date.minus(period)));   // 11-11-11
    }
}
