/*
Falsche Konstruktoraufruf für LocalDate:

LocalDate obj = new LocalDate(2020, 2, 14);

Die Klasse LocalDate hat keinen öffentlichen Konstruktor, der Jahr, Monat und Tag als Parameter akzeptiert.
Stattdessen wird eine statische Methode of verwendet, um eine Instanz von LocalDate zu erstellen:

LocalDate obj = LocalDate.of(2020, 2, 14);
* */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_1_bis_9;
import java.time.LocalDate;
import java.time.Period;

//public class test9 {
//    public static void main(String [] args) {
//        LocalDate obj = new LocalDate(2020, 2, 14);   // <-- Syntax Fehler LocalDate.of() | ohne new
//        System.out.println(obj.minus(Period.ofDays(10)));
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
public class test9 {
    public static void main(String [] args) {
        LocalDate obj = LocalDate.of(2020, 2, 14);  //<-- richtige Syntax
        System.out.println(obj.minus(Period.ofDays(10)));
    }
}
