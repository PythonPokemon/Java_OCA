package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AusführlichesFormatBeispiel {
    public static void main(String[] args) {
        LocalDateTime aktuell = LocalDateTime.now();
        System.out.println("aktuelle Datum und Uhrzeit ausgabe " + aktuell);
        LocalDateTime dateTime = LocalDateTime.of(2023, 7, 5, 9, 5, 7, 123000000);

        // Jahr (Jahr als Zahl, z.B. 2023)
        // y: Vierstellige oder kürzere Jahreszahl
        DateTimeFormatter formatterY = DateTimeFormatter.ofPattern("y");
        System.out.println("y: " + dateTime.format(formatterY)); // Ausgabe: 2023

        // yy: Zweistellige Jahreszahl
        DateTimeFormatter formatterYY = DateTimeFormatter.ofPattern("yy");
        System.out.println("yy: " + dateTime.format(formatterYY)); // Ausgabe: 23

        // yyyy: Vierstellige Jahreszahl
        DateTimeFormatter formatterYYYY = DateTimeFormatter.ofPattern("yyyy");
        System.out.println("yyyy: " + dateTime.format(formatterYYYY)); // Ausgabe: 2023

        // Monat (Monat als Zahl oder Text)
        // M: Monat als Zahl ohne führende Null
        DateTimeFormatter formatterM = DateTimeFormatter.ofPattern("M");
        System.out.println("M: " + dateTime.format(formatterM)); // Ausgabe: 7

        // MM: Monat als Zahl mit führender Null
        DateTimeFormatter formatterMM = DateTimeFormatter.ofPattern("MM");
        System.out.println("MM: " + dateTime.format(formatterMM)); // Ausgabe: 07

        // MMM: Abgekürzter Monatsname
        DateTimeFormatter formatterMMM = DateTimeFormatter.ofPattern("MMM");
        System.out.println("MMM: " + dateTime.format(formatterMMM)); // Ausgabe: Jul

        // MMMM: Vollständiger Monatsname
        DateTimeFormatter formatterMMMM = DateTimeFormatter.ofPattern("MMMM");
        System.out.println("MMMM: " + dateTime.format(formatterMMMM)); // Ausgabe: July

        // Tag (Tag des Monats)
        // d: Tag des Monats ohne führende Null
        DateTimeFormatter formatterD = DateTimeFormatter.ofPattern("d");
        System.out.println("d: " + dateTime.format(formatterD)); // Ausgabe: 5

        // dd: Tag des Monats mit führender Null
        DateTimeFormatter formatterDD = DateTimeFormatter.ofPattern("dd");
        System.out.println("dd: " + dateTime.format(formatterDD)); // Ausgabe: 05

        // Wochentag (Tag der Woche als Text)
        // E: Abgekürzter Wochentag
        DateTimeFormatter formatterE = DateTimeFormatter.ofPattern("E");
        System.out.println("E: " + dateTime.format(formatterE)); // Ausgabe: Wed

        // EEEE: Vollständiger Wochentag
        DateTimeFormatter formatterEEEE = DateTimeFormatter.ofPattern("EEEE");
        System.out.println("EEEE: " + dateTime.format(formatterEEEE)); // Ausgabe: Wednesday

        // Stunde im 24-Stunden-Format (0-23)
        // H: Stunde ohne führende Null
        DateTimeFormatter formatterH = DateTimeFormatter.ofPattern("H");
        System.out.println("H: " + dateTime.format(formatterH)); // Ausgabe: 9

        // HH: Stunde mit führender Null
        DateTimeFormatter formatterHH = DateTimeFormatter.ofPattern("HH");
        System.out.println("HH: " + dateTime.format(formatterHH)); // Ausgabe: 09

        // Stunde im 12-Stunden-Format (1-12)
        // h: Stunde ohne führende Null
        DateTimeFormatter formatterH12 = DateTimeFormatter.ofPattern("h");
        System.out.println("h: " + dateTime.format(formatterH12)); // Ausgabe: 9

        // hh: Stunde mit führender Null
        DateTimeFormatter formatterHH12 = DateTimeFormatter.ofPattern("hh");
        System.out.println("hh: " + dateTime.format(formatterHH12)); // Ausgabe: 09

        // Minute
        // m: Minute ohne führende Null
        DateTimeFormatter formatterMins = DateTimeFormatter.ofPattern("m");
        System.out.println("m: " + dateTime.format(formatterMins)); // Ausgabe: 5

        // mm: Minute mit führender Null
        DateTimeFormatter formatterMinsMM = DateTimeFormatter.ofPattern("mm");
        System.out.println("mm: " + dateTime.format(formatterMinsMM)); // Ausgabe: 05

        // Sekunde
        // s: Sekunde ohne führende Null
        DateTimeFormatter formatterSecs = DateTimeFormatter.ofPattern("s");
        System.out.println("s: " + dateTime.format(formatterSecs)); // Ausgabe: 7

        // ss: Sekunde mit führender Null
        DateTimeFormatter formatterSecsSS = DateTimeFormatter.ofPattern("ss");
        System.out.println("ss: " + dateTime.format(formatterSecsSS)); // Ausgabe: 07

        // Millisekunde
        // S: Millisekunde
        DateTimeFormatter formatterMillis = DateTimeFormatter.ofPattern("S");
        System.out.println("S: " + dateTime.format(formatterMillis)); // Ausgabe: 1

        // SSS: Millisekunde mit führenden Nullen
        DateTimeFormatter formatterMillisSSS = DateTimeFormatter.ofPattern("SSS");
        System.out.println("SSS: " + dateTime.format(formatterMillisSSS)); // Ausgabe: 123

        // AM/PM-Marker
        // a: AM oder PM
        DateTimeFormatter formatterAMPM = DateTimeFormatter.ofPattern("a");
        System.out.println("a: " + dateTime.format(formatterAMPM)); // Ausgabe: AM

        // Zeitzone
        // z: Zeitzone (Dieser benötigt eine `ZonedDateTime` statt `LocalDateTime`)
        // Da LocalDateTime keine Zeitzoneninformationen hat, hier ein Beispiel mit ZonedDateTime:
        // ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.of("America/Los_Angeles"));
        // DateTimeFormatter formatterZone = DateTimeFormatter.ofPattern("z");
        // System.out.println("z: " + zonedDateTime.format(formatterZone)); // Ausgabe: PDT oder PST, je nach aktueller Zeit
    }
}
