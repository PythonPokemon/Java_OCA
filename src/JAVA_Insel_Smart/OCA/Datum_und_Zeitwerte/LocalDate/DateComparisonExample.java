package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.LocalDate;

import java.time.LocalDate;

public class DateComparisonExample {
    public static void main(String[] args) {
        // Berechnen der Zeitspanne zwischen zwei Daten, mit der .between() Methode.
        LocalDate startDatum = LocalDate.of(2020, 1, 1);
        LocalDate endDatum = LocalDate.of(2023, 7, 8);

        // Silvester-Datum (31. Dezember) für ein bestimmtes Jahr, z.B. 2020
        LocalDate silvester = LocalDate.of(2020, 12, 31);

        // Prüfen, ob das startDatum vor oder nach Silvester liegt
        boolean isStartVorSilvester = startDatum.isBefore(silvester);
        boolean isStartNachSilvester = startDatum.isAfter(silvester);

        System.out.println("Startdatum liegt vor Silvester: " + isStartVorSilvester); // Ausgabe: true oder false
        System.out.println("Startdatum liegt nach Silvester: " + isStartNachSilvester); // Ausgabe: true oder false

        // Prüfen, ob das endDatum vor oder nach Silvester liegt
        boolean isEndVorSilvester = endDatum.isBefore(silvester);
        boolean isEndNachSilvester = endDatum.isAfter(silvester);

        System.out.println("Enddatum liegt vor Silvester: " + isEndVorSilvester); // Ausgabe: true oder false
        System.out.println("Enddatum liegt nach Silvester: " + isEndNachSilvester); // Ausgabe: true oder false
    }
}
