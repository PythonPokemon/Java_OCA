/*
Period
------------------------------------------------------------------------------------------------------------------------
Wichtige Methoden:

diese Methoden sind statische Methoden, deswegen muss man auch kein new davor schreiben,
weil methoden direkt aufgerufen werden können, ohne dass eine Instanz der Klasse erstellt werden muss.
------------------------------------------------------------------------------------------------------------------------
ofYears(int years)
ofMonths(int months)
ofDays(int days)
between(LocalDate startDateInclusive, LocalDate endDateExclusive)
plusDays(long daysToAdd)
minusDays(long daysToSubtract)
getYears()
getMonths()
getDays()
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
dieses Beispiel zeigt, wie Period verwendet wird, um Zeitspannen zu definieren und zu manipulieren.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.Period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        // Erstellen eines Period-Objekts
        // Standard ausgabe, wenn nichts hinzugefügt wird, ist: POD
        Period periodReferenz = Period.ofYears(2).plusMonths(3).plusDays(10);
        System.out.println("Period: " + periodReferenz); // Ausgabe: P2Y3M10D

        // Berechnen der Zeitspanne zwischen zwei Daten, mit der .between() Methode.
        // Zeitspanne zwischen startDatum und endDatum beträgt 3-Jahre, 6-Monate, 7-Tage | P3Y6M7D
        LocalDate startDatum = LocalDate.of(2020, 1, 1);
        LocalDate endDatum = LocalDate.of(2023, 7, 8);
        Period zwischenPeriod = Period.between(startDatum, endDatum);
        System.out.println("Zwischenzeit: " + zwischenPeriod); // Ausgabe: P3Y6M7D

        // Hinzufügen von Tagen zu einer Period
        Period periodPlusTage = periodReferenz.plusDays(5);
        System.out.println("Period plus 5 Tage: " + periodPlusTage); // Ausgabe: P2Y3M15D

        // Subtrahieren von Tagen von einer Period
        Period periodMinusTage = periodReferenz.minusDays(5);
        System.out.println("Period minus 5 Tage: " + periodMinusTage); // Ausgabe: P2Y3M5D

        // Abrufen von Jahren, Monaten und Tagen aus einer Period
        int years = periodReferenz.getYears();
        int months = periodReferenz.getMonths();
        int days = periodReferenz.getDays();
        System.out.println("Jahre: " + years + ", Monate: " + months + ", Tage: " + days); // Ausgabe: Jahre: 2, Monate: 3, Tage: 10
    }
}
