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
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Aktuelles Datum und Uhrzeit: " + currentDateTime);

        // Erzeugt ein bestimmtes Datum und Uhrzeit
        LocalDateTime specificDateTime = LocalDateTime.of(2020, 5, 20, 14, 30);
        System.out.println("Spezielles Datum und Uhrzeit: " + specificDateTime);

        // Parse ein Datum und Uhrzeit von einem String
        LocalDateTime parsedDateTime = LocalDateTime.parse("2023-07-08T10:15:30");
        System.out.println("Geparstes Datum und Uhrzeit: " + parsedDateTime);

        // Hinzufügen von Tagen
        LocalDateTime dateTimePlusDays = currentDateTime.plusDays(10);
        System.out.println("Datum und Uhrzeit plus 10 Tage: " + dateTimePlusDays);

        // Subtrahieren von Tagen
        LocalDateTime dateTimeMinusDays = currentDateTime.minusDays(10);
        System.out.println("Datum und Uhrzeit minus 10 Tage: " + dateTimeMinusDays);

        // Abrufen von Tag, Monat, Jahr, Stunde und Minute
        int day = currentDateTime.getDayOfMonth();
        int month = currentDateTime.getMonthValue();
        int year = currentDateTime.getYear();
        int hour = currentDateTime.getHour();
        int minute = currentDateTime.getMinute();
        System.out.println("Tag: " + day + ", Monat: " + month + ", Jahr: " + year);
        System.out.println("Stunde: " + hour + ", Minute: " + minute);
    }
}

