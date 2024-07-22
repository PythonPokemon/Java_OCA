/*
LocalDateTime
------------------------------------------------------------------------------------------------------------------------
Wichtige Methoden:
now()
of(int year, int month, int dayOfMonth, int hour, int minute)
parse(CharSequence text)
plusDays(long daysToAdd)
minusDays(long daysToSubtract)
getDayOfMonth()
getMonth()
getYear()
getHour()
getMinute()
* */

package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.LocalDateTime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Erzeugt das aktuelle Datum und Uhrzeit
        LocalDateTime aktuelleDatumZeitwerte = LocalDateTime.now();
        System.out.println("Aktuelles Datum und Uhrzeit: " + aktuelleDatumZeitwerte);

        // Erzeugt ein bestimmtes Datum und Uhrzeit
        LocalDateTime spezielleDatumZeitwerte = LocalDateTime.of(2020, 5, 20, 14, 30);
        System.out.println("Spezielles Datum und Uhrzeit: " + spezielleDatumZeitwerte);

        // Parse ein Datum und Uhrzeit von einem String
        LocalDateTime datumZeitwerteStringZuInt = LocalDateTime.parse("2023-07-08T10:15:30");
        System.out.println("Geparstes Datum und Uhrzeit: " + datumZeitwerteStringZuInt);

        // Hinzufügen von Tagen
        LocalDateTime datumZeitwertePlusTage = aktuelleDatumZeitwerte.plusDays(10);
        System.out.println("Datum und Uhrzeit plus 10 Tage: " + datumZeitwertePlusTage);

        // Subtrahieren von Tagen
        LocalDateTime datumZeitwerteMinusTage = aktuelleDatumZeitwerte.minusDays(10);
        System.out.println("Datum und Uhrzeit minus 10 Tage: " + datumZeitwerteMinusTage);

        // Abrufen von Tag, Monat, Jahr, Stunde und Minute
        int tag = aktuelleDatumZeitwerte.getDayOfMonth();
        int monat = aktuelleDatumZeitwerte.getMonthValue();
        int jahr = aktuelleDatumZeitwerte.getYear();
        int stunde = aktuelleDatumZeitwerte.getHour();
        int minute = aktuelleDatumZeitwerte.getMinute();
        System.out.println("Tag: " + tag + ", Monat: " + monat + ", Jahr: " + jahr);
        System.out.println("Stunde: " + stunde + ", Minute: " + minute);
    }
}

