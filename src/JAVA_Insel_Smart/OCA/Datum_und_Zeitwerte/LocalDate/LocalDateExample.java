/*
LocalDate
------------------------------------------------------------------------------------------------------------------------
Wichtige Methoden:
now()
of(int year, int month, int dayOfMonth)
parse(CharSequence text)
plusDays(long daysToAdd)
minusDays(long daysToSubtract)
getDayOfWeek()
getDayOfMonth()
getMonth()
getYear()
* */

package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.LocalDate;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        // Erzeugt das aktuelle Datum
        LocalDate currentDate = LocalDate.now();
        System.out.println("Aktuelles Datum: " + currentDate);

        // Erzeugt ein bestimmtes Datum
        LocalDate specificDate = LocalDate.of(2020, 5, 20);
        System.out.println("Spezielles Datum: " + specificDate);

        // Parse ein Datum von einem String
        LocalDate parsedDate = LocalDate.parse("2023-07-08");
        System.out.println("Geparstes Datum: " + parsedDate);

        // Hinzufügen von Tagen
        LocalDate datePlusDays = currentDate.plusDays(10);
        System.out.println("Datum plus 10 Tage: " + datePlusDays);

        // Subtrahieren von Tagen
        LocalDate dateMinusDays = currentDate.minusDays(10);
        System.out.println("Datum minus 10 Tage: " + dateMinusDays);

        // Abrufen von Tag, Monat und Jahr
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();
        System.out.println("Tag: " + day + ", Monat: " + month + ", Jahr: " + year);
    }
}
