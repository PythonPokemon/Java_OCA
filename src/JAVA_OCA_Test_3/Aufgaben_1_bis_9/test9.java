/*
Kompilierungsfehler

Gesamterklärung
Der Konstruktor von LocalDate ist als privat deklariert und kann daher nicht von außen aufgerufen werden, daher new LocalDate(2020, 2, 14); Verursacht Kompilierungsfehler.



Die überladenen statischen Methoden "of" und "parse" werden bereitgestellt, um die Instanz von LocalDate zu erstellen.

LocalTime, LocalDateTime, Period geben auch private Konstruktoren an und stellen die Methoden "of" und "parse" bereit, um entsprechende Instanzen zu erstellen.
 * */
package JAVA_OCA_Test_3.Aufgaben_1_bis_9;
import java.time.LocalDate;
import java.time.Period;

//public class test9 {
//    public static void main(String [] args) {
//        LocalDate obj = new LocalDate(2020, 2, 14);
//        System.out.println(obj.minus(Period.ofDays(10)));
//    }
//}
