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

        // Vorgabe des Musters, zum Umformatieren
        // Erstellen eines DateTimeFormatter mit einem bestimmten Muster
        DateTimeFormatter refMain = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter refMain2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//----------------------------------------------------------------------------------------------------------------------
        // Formatieren eines LocalDate-Objekts
        LocalDate datum = LocalDate.of(2023, 7, 8);
        String datumFormatiert = datum.format(refMain);
        System.out.println("Formatiertes Datum: " + datumFormatiert); // Ausgabe: 08/07/2023
//----------------------------------------------------------------------------------------------------------------------
        /*
        * Die Ausgabe des geparsten Datums scheint auf den ersten Blick umgekehrt zu sein,
        * weil LocalDate.toString() standardmäßig das Datum im Format yyyy-MM-dd zurückgibt, unabhängig davon,
        * wie das Datum ursprünglich geparst wurde.
        * Das bedeutet, dass LocalDate das Datum korrekt basierend auf dem angegebenen Muster dd/MM/yyyy parst,
        * aber wenn Sie datumParsen mit System.out.println ausgeben, wird es im Standardformat yyyy-MM-dd angezeigt.
        * */
        // Parsen eines Strings in ein LocalDate-Objekt
        // schritt:1
        String datumString = "25/12/2022";
        LocalDate datumParsen = LocalDate.parse(datumString, refMain2);
        System.out.println("Geparstes Datum: " + datumParsen); // Standard-Ausgabe: 2022-12-25 | trotz Mustervorlage!

        // Formatieren des geparsten Datums im ursprünglichen Format
        // schritt: 2 | variabel, nicht verpflichtend
        String formatiertesDatum = datumParsen.format(refMain2);
        System.out.println("Geparstes Datum (dd/MM/yyyy): " + formatiertesDatum); // Ausgabe: 25/12/2022
//----------------------------------------------------------------------------------------------------------------------
        // Formatieren eines LocalDateTime-Objekts
        DateTimeFormatter datumZeitFormatierer = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime datumZeit = LocalDateTime.of(2023, 7, 8, 14, 30);
        String formattedDateTime = datumZeit.format(datumZeitFormatierer);
        System.out.println("Formatiertes Datum und Uhrzeit: " + formattedDateTime); // Ausgabe: 08/07/2023 14:30
//----------------------------------------------------------------------------------------------------------------------
        // Parsen eines Strings in ein LocalDateTime-Objekt
        String dateTimeString = "25/12/2022 18:45";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, datumZeitFormatierer);
        System.out.println("Geparstes Datum und Uhrzeit: " + parsedDateTime); // Ausgabe: 2022-12-25T18:45
    }
}
