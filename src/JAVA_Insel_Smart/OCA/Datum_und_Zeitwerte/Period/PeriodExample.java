/*
Period
------------------------------------------------------------------------------------------------------------------------
Wichtige Methoden:

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
        Period period = Period.ofYears(2).plusMonths(3).plusDays(10);
        System.out.println("Period: " + period); // Ausgabe: P2Y3M10D

        // Berechnen der Zeitspanne zwischen zwei Daten
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 7, 8);
        Period betweenPeriod = Period.between(startDate, endDate);
        System.out.println("Zwischenzeit: " + betweenPeriod); // Ausgabe: P3Y6M7D

        // Hinzufügen von Tagen zu einer Period
        Period periodPlusDays = period.plusDays(5);
        System.out.println("Period plus 5 Tage: " + periodPlusDays); // Ausgabe: P2Y3M15D

        // Subtrahieren von Tagen von einer Period
        Period periodMinusDays = period.minusDays(5);
        System.out.println("Period minus 5 Tage: " + periodMinusDays); // Ausgabe: P2Y3M5D

        // Abrufen von Jahren, Monaten und Tagen aus einer Period
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("Jahre: " + years + ", Monate: " + months + ", Tage: " + days); // Ausgabe: Jahre: 2, Monate: 3, Tage: 10
    }
}
