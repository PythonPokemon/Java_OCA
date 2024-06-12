/*
System.out.println(date); is executed more than 6 times

Gesamterklärung
Datum --> {2000-06-25}. date.getDayOfMonth() = 25, 25 >= 20 ist true,
daher geht die Steuerung in die while-Schleife und führt System.out.println(date) aus; Aussage.

date.plusDays(-1); erstellt ein neues LocalDate-Objekt {2000-06-24},
aber die Datumsreferenzvariable verweist weiterhin auf {2000-06-25}. date.getDayOfMonth() gibt wieder 25 zurück,
dies ist eine Endlosschleife.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_60_bis_69;
import java.time.LocalDate;

public class test69 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2000-06-25");
        while(date.getDayOfMonth() >= 20) {
            System.out.println(date);
            date.plusDays(-1);
        }
    }
}
