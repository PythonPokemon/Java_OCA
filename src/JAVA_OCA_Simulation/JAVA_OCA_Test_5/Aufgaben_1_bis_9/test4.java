/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_1_bis_9;
import java.time.LocalDate;

public class test4 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1983-06-30");
        System.out.println(date.plusMonths(8)); // 1984-02-29
    }
}
