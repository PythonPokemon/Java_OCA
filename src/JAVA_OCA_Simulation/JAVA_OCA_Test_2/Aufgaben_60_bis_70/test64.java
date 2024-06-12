/*
Laufzeit-Ausnahme

Gesamterklärung
Bei der Arbeit mit Datumsangaben werden Programmierer mit M & m und D & d verwechselt.
------------------------------------------------------------------------------------------------------------------------
Der einfache Weg, sich daran zu erinnern, ist, dass größere (Großbuchstaben) Buchstaben etwas Größeres darstellen.
M steht für den Monat und m für die Minute, D für den Tag des Jahres und d für den Tag des Monats.
------------------------------------------------------------------------------------------------------------------------
Das Objekt von LocalDate hat keine Zeitkomponente, mm steht für Minute und nicht für Monate,
sodass die Formatierungsmethode zur Laufzeit eine Ausnahme auslöst.
M == Monat
m == minuten
D == Tag des Jahres
d == tag des monats
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_60_bis_70;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class test64 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2012, 1, 11); // weil das format hier falsch ist, beo monat muss 01 stehen!
        Period period = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YYYY");    // Format fehlerhaft| richt ist: "MM-DD-YYYY" | kleingeschreiben steht es für minuten und
        System.out.print(formatter.format(date.minus(period)));
    }
}
