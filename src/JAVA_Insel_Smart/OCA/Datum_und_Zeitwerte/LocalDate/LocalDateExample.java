/*
LocalDate
------------------------------------------------------------------------------------------------------------------------
Wichtige Methoden:

diese Methoden statische Methoden sind, deswegen muss man auch kein new davor schreiben,
weil methoden direkt aufgerufen werden können, ohne dass eine Instanz der Klasse erstellt werden muss.
------------------------------------------------------------------------------------------------------------------------
Statische Methoden und Parsing

1.Statische Methoden:

Statische Methoden gehören zur Klasse selbst und nicht zu einer Instanz der Klasse.
Sie können direkt über die Klasse aufgerufen werden.
Beispiel: LocalDate.parse(), Integer.parseInt()
------------------------------------------------------------------------------------------------------------------------
2.Parsen und Objektinstanziierung:

Beim Parsen wird ein String analysiert und ein entsprechendes Objekt erstellt.
Da die parse-Methode eine statische Methode ist, wird das entsprechende Objekt innerhalb der Methode erstellt
und zurückgegeben, ohne dass der Aufrufer explizit new verwenden muss.
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung:

1.Statische Methoden:
Da parse eine statische Methode ist, kann sie direkt über die Klasse aufgerufen werden,
ohne dass eine Instanz der Klasse erstellt werden muss.

2.Objekterstellung intern:
Die Methode parse analysiert den Eingabe-String und erstellt intern das entsprechende Objekt,
das dann zurückgegeben wird.

3.Kein new erforderlich:
Da die Objekterstellung und Rückgabe innerhalb der Methode parse erfolgt, muss der Aufrufer kein new verwenden.
------------------------------------------------------------------------------------------------------------------------
now()
of(int year, int month, int dayOfMonth)
parse(CharSequence text)
plusDays(long daysToAdd)
minusDays(long daysToSubtract)
getDayOfWeek()
getDayOfMonth()
getMonth()
getYear()
------------------------------------------------------------------------------------------------------------------------
Allgemeine Bedeutung von "parsen":

Analysieren: Der Eingabetext wird auf eine bestimmte Weise gelesen und seine Struktur verstanden.
Umwandeln: Der analysierte Text wird in eine geeignete Datenstruktur umgewandelt,
die vom Programm weiterverarbeitet werden kann.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.LocalDate;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {

        // Erzeugt das aktuelle Datum: 2024-07-21
        LocalDate aktuellesDatum = LocalDate.now(); //.now() methode|gibt das aktuelle datum, aus dem Objekt wieder!
        System.out.println("Aktuelles Datum: " + aktuellesDatum);

        // Erzeugt ein bestimmtes Datum
        //.of() methode|gibt spezielle Angaben aus: Jahr, Monat, Tag_des_Monats
        // WICHTIG trennung durch: komma
        LocalDate speziellesDatum = LocalDate.of(2020, 5, 20);
        System.out.println("Spezielles Datum: " + speziellesDatum);

        // Parse ein Datum von einem String
        //.parse() Methode | Analysiert den Typ und wandelt ihn in Ganzzahlen in ein String um.
        // WICHTIG trennung durch: bindestrich
        LocalDate datumUmwandlung = LocalDate.parse("2023-07-08");
        System.out.println("Geparstes Datum: " + datumUmwandlung);

        // Addieren von Tagen (+)
        // benötigt die Referenz variable von LocalDate.now(), als voraussetzung!
        // um zu der Datums ausgabe die tage hinzu, zu addieren.
        LocalDate datumPlusTage = aktuellesDatum.plusDays(10);
        System.out.println("Datum plus 10 Tage: " + datumPlusTage);

        // Subtrahieren von Tagen (-)
        // benötigt die Referenz variable von LocalDate.now(), als voraussetzung!
        // um zu der Datums ausgabe die Tage abzuziehen.
        LocalDate dateMinusDays = aktuellesDatum.minusDays(10);
        System.out.println("Datum minus 10 Tage: " + dateMinusDays);

        // Abrufen von Tag, Monat und Jahr
        // benötigt die Referenz variable von LocalDate.now(), als voraussetzung!
        // um aktuelle Daten explizit auszugeben, wie: tag, monat, jahr
        int tag = aktuellesDatum.getDayOfMonth();
        int monat = aktuellesDatum.getMonthValue();
        int jahr = aktuellesDatum.getYear();
        System.out.println("Tag: " + tag + ", Monat: " + monat + ", Jahr: " + jahr);
    }
}
