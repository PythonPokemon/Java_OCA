/*


 * */
package JAVA_OCA_Test_6.Aufgaben_40_bis_49;
import java.time.LocalDate;

public class test42 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2020-08-31");
        System.out.println(date.plusMonths(-6));    // 2020-02-29
    }
}
