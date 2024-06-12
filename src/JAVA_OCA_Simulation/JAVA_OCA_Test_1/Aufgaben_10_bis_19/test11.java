/*
 * Was passiert im Code?
 *
 * Import-Anweisungen:
 * Importiert die benötigten Klassen LocalTime, LocalDate und andere.
 *
 * Klasse und Hauptmethode:
 * public class test11: Definiert eine öffentliche Klasse namens test11.
 * public static void main(String[] args): Der Einstiegspunkt für die Programmausführung.
 *
 * Initialisierung und Verwendung von LocalDate:
 * LocalDate date = LocalDate.parse("1947-08-14"): Erstellt ein LocalDate-Objekt, das den 14. August 1947 darstellt.
 *
 * Initialisierung von LocalTime:
 * LocalTime time = LocalTime.MAX: Erstellt ein LocalTime-Objekt, das die maximale Zeit des Tages (23:59:59.999999999) darstellt.
 *
 * Kombinieren von Datum und Zeit:
 * System.out.println(date.atTime(time)): Kombiniert das Datum mit der maximalen Zeit und gibt es auf der Konsole aus.
 *
 * Was wird ausgegeben?
 * Die Ausgabe wird 1947-08-14T23:59:59.999999999 sein, was das Datum und die maximale Zeit des Tages repräsentiert.
 */


package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_10_bis_19;

import java.time.LocalTime;
import java.time.LocalDate;

public class test11 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time));  // 1947-08-14T23:59:59.999999999
    }
}
