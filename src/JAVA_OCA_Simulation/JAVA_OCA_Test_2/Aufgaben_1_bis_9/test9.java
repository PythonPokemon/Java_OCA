/*
 *  -1000-01-01
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_1_bis_9;
import java.time.LocalDate;
import java.time.Period;

public class test9 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2000-01-01"); // string wird in int umgewandelt
        Period period = Period.ofYears(-3000);
        System.out.println(date.plus(period)); // Achtung wenn, hier minus wäre, dann (- - = +) Ergebnis--> 5000-01-01
    }
}
