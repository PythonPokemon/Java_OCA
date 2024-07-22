/*
DateTimeFormatter
------------------------------------------------------------------------------------------------------------------------
Wichtige Methoden:
diese Methoden sind statische Methoden, deswegen muss man auch kein new davor schreiben,
weil methoden direkt aufgerufen werden können, ohne dass eine Instanz der Klasse erstellt werden muss.

ofPattern(String pattern)
format(TemporalAccessor temporal)
parse(CharSequence text)
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
dieses Beispiel zeigt, wie DateTimeFormatter zum Formatieren und Parsen von Datum und Uhrzeit verwendet wird.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.DateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        // Erstellen eines DateTimeFormatter mit einem bestimmten Muster
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatieren eines LocalDate-Objekts
        LocalDate date = LocalDate.of(2023, 7, 8);
        String formattedDate = date.format(formatter);
        System.out.println("Formatiertes Datum: " + formattedDate); // Ausgabe: 08/07/2023

        // Parsen eines Strings in ein LocalDate-Objekt
        String dateString = "25/12/2022";
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Geparstes Datum: " + parsedDate); // Ausgabe: 2022-12-25

        // Formatieren eines LocalDateTime-Objekts
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.of(2023, 7, 8, 14, 30);
        String formattedDateTime = dateTime.format(dateTimeFormatter);
        System.out.println("Formatiertes Datum und Uhrzeit: " + formattedDateTime); // Ausgabe: 08/07/2023 14:30

        // Parsen eines Strings in ein LocalDateTime-Objekt
        String dateTimeString = "25/12/2022 18:45";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
        System.out.println("Geparstes Datum und Uhrzeit: " + parsedDateTime); // Ausgabe: 2022-12-25T18:45
    }
}
