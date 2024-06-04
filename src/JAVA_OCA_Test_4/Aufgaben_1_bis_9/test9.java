/*


 * */
package JAVA_OCA_Test_4.Aufgaben_1_bis_9;
import java.util.ArrayList;
import java.util.List;

public class test9 {
    public static void main(String[] args) {
        List<String> days = new ArrayList<>();
        days.add("SUNDAY");
        days.add("SUNDAY");
        days.add("MONDAY");
        System.out.println(days.size());    // 3
        days.clear();
        System.out.println(days.size());    // 0
    }
}
