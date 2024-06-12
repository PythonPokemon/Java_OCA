/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_4.Aufgaben_20_bis_29;
import java.time.LocalDate;

public class test29 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(2068, 4, 15);
        System.out.println(date.getMonth() + ":" + date.getMonthValue());   // APRIL:4
    }
}
