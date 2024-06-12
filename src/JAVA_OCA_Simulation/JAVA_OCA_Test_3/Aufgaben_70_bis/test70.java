/*
2020-09-06

Gesamterklärung
In der Methode LocalDate.of(int, int, int) ist der 1. Parameter das Jahr, der 2. der Monat und der 3. der Tag des Monats.

Die Methode toString() der Klasse LocalDate druckt das Objekt LocalDate im ISO-8601-Format: "uuuu-MM-dd".
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_70_bis;
import java.time.LocalDate;

public class test70 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2020, 9, 6);
        System.out.println(date);
    }
}
