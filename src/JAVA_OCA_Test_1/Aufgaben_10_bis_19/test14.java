/*
 * Was passiert im Code?
 *
 * Paketdeklaration:
 * package JACA_OCA_Test_1.Aufgaben_10_bis_19;
 * Das organisiert den Code in einem speziellen Ordner (Paket) namens JACA_OCA_Test_1.Aufgaben_10_bis_19.
 *
 * Import-Anweisung:
 * import java.time.LocalDate;
 * Importiert die LocalDate-Klasse aus dem java.time-Paket, die zur Arbeit mit Datumswerten verwendet wird.
 *
 * Klassendeklaration und Hauptmethode:
 * public class test14: Definiert eine öffentliche Klasse namens test14.
 * public static void main(String[] args): Der Einstiegspunkt für die Programmausführung.
 *
 * Initialisierung der LocalDate-Objekte:
 * LocalDate newYear = LocalDate.of(2018, 1, 1);: Erstellt ein LocalDate-Objekt newYear, das den 1. Januar 2018 darstellt.
 * LocalDate christmas = LocalDate.of(2018, 12, 25);: Erstellt ein LocalDate-Objekt christmas, das den 25. Dezember 2018 darstellt.
 *
 * Vergleich der Daten:
 * boolean flag1 = newYear.isAfter(christmas);: Überprüft, ob newYear nach christmas liegt. Da der 1. Januar 2018 vor dem 25. Dezember 2018 liegt, ist das Ergebnis false.
 * boolean flag2 = newYear.isBefore(christmas);: Überprüft, ob newYear vor christmas liegt. Da der 1. Januar 2018 vor dem 25. Dezember 2018 liegt, ist das Ergebnis true.
 *
 * Ausgabe der Ergebnisse:
 * System.out.println(flag1 + ":" + flag2);: Gibt die Werte von flag1 und flag2 aus. Da flag1 false und flag2 true ist, wird die Ausgabe false:true sein.
 *
 * Was wird ausgegeben?
 * Die Ausgabe des Programms wird "false:true" sein, da der 1. Januar 2018 nicht nach dem 25. Dezember 2018 liegt, aber vor ihm liegt.
 */


package JAVA_OCA_Test_1.Aufgaben_10_bis_19;

import java.time.LocalDate;

public class test14 {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);    // false:true
    }
}
