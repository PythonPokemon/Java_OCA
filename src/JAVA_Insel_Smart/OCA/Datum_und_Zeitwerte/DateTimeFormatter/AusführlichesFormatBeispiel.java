package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AusführlichesFormatBeispiel {
    public static void main(String[] args) {

        // Fiktive, Datum und Uhrzeit vorgaben, zum Umformatieren
        LocalDateTime fiktiveDatumZeit = LocalDateTime.of(60, 7, 5, 9, 5, 7, 123000000);

        // Jahr (Jahr als Zahl, z.B. 2023)------------------------------------------------------------------------------
        // ein Literal bedeutet: y: flexibel 'vierstellige' oder 'kürzere Jahreszahl'
        DateTimeFormatter formatY = DateTimeFormatter.ofPattern("y");// Literal anzahl, als FormatVorgabe
        System.out.println("y: " + fiktiveDatumZeit.format(formatY)); // Ausgabe: als ganzes Jahr  '2023' | 23

        // zwei Literale bedeuten: yy: immer zweistellige Jahreszahl
        DateTimeFormatter formatYY = DateTimeFormatter.ofPattern("yy");
        System.out.println("yy: " + fiktiveDatumZeit.format(formatYY)); // Ausgabe: als verkürztes Jahr '23'

        // vier Literale bedeuten: yyyy: immer vierstellige Jahreszahl
        DateTimeFormatter formatYYY = DateTimeFormatter.ofPattern("yyyy");
        System.out.println("yyyy: " + fiktiveDatumZeit.format(formatYYY)); // Ausgabe: 2023 | 0023

        // Monat (Monat als Zahl oder Text)-----------------------------------------------------------------------------
        // M: Monat als Zahl 'ohne' führende 'Null'
        DateTimeFormatter formatterM = DateTimeFormatter.ofPattern("M");// Literal anzahl, als FormatVorgabe
        System.out.println("M: " + fiktiveDatumZeit.format(formatterM)); // Ausgabe: 7

        // MM: Monat als Zahl 'mit' führender 'Null'
        DateTimeFormatter formatterMM = DateTimeFormatter.ofPattern("MM");
        System.out.println("MM: " + fiktiveDatumZeit.format(formatterMM)); // Ausgabe: 07

        // MMM: 'Abgekürzter' Monatsname
        DateTimeFormatter formatterMMM = DateTimeFormatter.ofPattern("MMM");
        System.out.println("MMM: " + fiktiveDatumZeit.format(formatterMMM)); // Ausgabe: Jul

        // MMMM: 'Vollständiger' Monatsname
        DateTimeFormatter formatterMMMM = DateTimeFormatter.ofPattern("MMMM");
        System.out.println("MMMM: " + fiktiveDatumZeit.format(formatterMMMM)); // Ausgabe: July

        // Tag (Tag des Monats)-----------------------------------------------------------------------------------------
        // d: Tag des Monats 'ohne' führende 'Null'
        DateTimeFormatter formatterD = DateTimeFormatter.ofPattern("d");// Literal anzahl, als FormatVorgabe
        System.out.println("d: " + fiktiveDatumZeit.format(formatterD)); // Ausgabe: 5

        // dd: Tag des Monats 'mit' führender 'Null'
        DateTimeFormatter formatterDD = DateTimeFormatter.ofPattern("dd");
        System.out.println("dd: " + fiktiveDatumZeit.format(formatterDD)); // Ausgabe: 05

        // Wochentag (Tag der Woche als Text)---------------------------------------------------------------------------
        // E: 'Abgekürzter' Wochentag
        DateTimeFormatter formatterE = DateTimeFormatter.ofPattern("E");
        System.out.println("E: " + fiktiveDatumZeit.format(formatterE)); // Ausgabe: Wed

        // EEEE: 'Vollständiger' Wochentag
        DateTimeFormatter formatterEEEE = DateTimeFormatter.ofPattern("EEEE");
        System.out.println("EEEE: " + fiktiveDatumZeit.format(formatterEEEE)); // Ausgabe: Wednesday

        // Stunde im 24-Stunden-Format (0-23)---------------------------------------------------------------------------
        // H: Stunde 'ohne' führende 'Null'
        DateTimeFormatter formatterH = DateTimeFormatter.ofPattern("H");
        System.out.println("H: " + fiktiveDatumZeit.format(formatterH)); // Ausgabe: 9

        // HH: Stunde 'mit' führender 'Null'
        DateTimeFormatter formatterHH = DateTimeFormatter.ofPattern("HH");
        System.out.println("HH: " + fiktiveDatumZeit.format(formatterHH)); // Ausgabe: 09

        // Stunde im 12-Stunden-Format (1-12)---------------------------------------------------------------------------
        // h: Stunde ohne führende Null
        DateTimeFormatter formatterH12 = DateTimeFormatter.ofPattern("h");
        System.out.println("h: " + fiktiveDatumZeit.format(formatterH12)); // Ausgabe: 9

        // hh: Stunde mit führender Null
        DateTimeFormatter formatterHH12 = DateTimeFormatter.ofPattern("hh");
        System.out.println("hh: " + fiktiveDatumZeit.format(formatterHH12)); // Ausgabe: 09

        // Minute-------------------------------------------------------------------------------------------------------
        // m: Minute ohne führende Null
        DateTimeFormatter formatterMins = DateTimeFormatter.ofPattern("m");
        System.out.println("m: " + fiktiveDatumZeit.format(formatterMins)); // Ausgabe: 5

        // mm: Minute mit führender Null
        DateTimeFormatter formatterMinsMM = DateTimeFormatter.ofPattern("mm");
        System.out.println("mm: " + fiktiveDatumZeit.format(formatterMinsMM)); // Ausgabe: 05

        // Sekunde------------------------------------------------------------------------------------------------------
        // s: Sekunde ohne führende Null
        DateTimeFormatter formatterSecs = DateTimeFormatter.ofPattern("s");
        System.out.println("s: " + fiktiveDatumZeit.format(formatterSecs)); // Ausgabe: 7

        // ss: Sekunde mit führender Null
        DateTimeFormatter formatterSecsSS = DateTimeFormatter.ofPattern("ss");
        System.out.println("ss: " + fiktiveDatumZeit.format(formatterSecsSS)); // Ausgabe: 07

        // Millisekunde-------------------------------------------------------------------------------------------------
        // S: Millisekunde
        DateTimeFormatter formatterMillis = DateTimeFormatter.ofPattern("S");
        System.out.println("S: " + fiktiveDatumZeit.format(formatterMillis)); // Ausgabe: 1

        // SSS: Millisekunde mit führenden Nullen
        DateTimeFormatter formatterMillisSSS = DateTimeFormatter.ofPattern("SSS");
        System.out.println("SSS: " + fiktiveDatumZeit.format(formatterMillisSSS)); // Ausgabe: 123

        // AM/PM-Marker-------------------------------------------------------------------------------------------------
        // a: AM oder PM
        DateTimeFormatter formatterAMPM = DateTimeFormatter.ofPattern("a");
        System.out.println("a: " + fiktiveDatumZeit.format(formatterAMPM)); // Ausgabe: AM

        // Zeitzone
        // z: Zeitzone (Dieser benötigt eine `ZonedDateTime` statt `LocalDateTime`)
        // Da LocalDateTime keine Zeitzoneninformationen hat, hier ein Beispiel mit ZonedDateTime:
        // ZonedDateTime zonedDateTime = fiktiveDatumZeit.atZone(ZoneId.of("America/Los_Angeles"));
        // DateTimeFormatter formatterZone = DateTimeFormatter.ofPattern("z");
        // System.out.println("z: " + zonedDateTime.format(formatterZone)); // Ausgabe: PDT oder PST, je nach aktueller Zeit
    }
}
