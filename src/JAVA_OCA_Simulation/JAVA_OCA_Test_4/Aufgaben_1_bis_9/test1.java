/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_4.Aufgaben_1_bis_9;
import java.time.LocalDate;

public class test1 {
    public static void main(String [] args) {
        LocalDate date1 = LocalDate.parse("1980-03-16");
        LocalDate date2 = LocalDate.parse("1980-03-16");
        System.out.println(date1.equals(date2) + " : " + date1.isEqual(date2)); // true : true
    }
}
