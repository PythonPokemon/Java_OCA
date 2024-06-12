/*
2018-06-06

Gesamterklärung
Datum --> {2018-06-06}.

date.minusDays(10); => da LocalDate unveränderlich ist, daher wird ein neues LocalDate-Objekt {2018-05-27} erstellt,
aber keine Variable verweist darauf. date bezieht sich immer noch auf {2018-06-06}.

2018-06-06 wird auf der Konsole angezeigt.

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_20_bis_29;
import java.time.LocalDate;

//public class test22 {
//    public static void main(String [] args) {
//        LocalDate date = LocalDate.parse("2018-06-06");
//        date.minusDays(10);       // ACHTUNG erzeugt neues Objekt -10 Tage, 2018-05-27, wird aber nicht angezeigt
//        System.out.println(date); // output: 2018-06-06
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
public class test22 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2018-06-06");
        date = date.minusDays(10);  //<-- korrekte Syntax um -10 Tage zu rechnen
        System.out.println(date);               // 2018-05-27
    }
}