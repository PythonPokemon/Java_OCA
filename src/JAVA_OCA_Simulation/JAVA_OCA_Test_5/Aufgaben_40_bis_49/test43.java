/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_40_bis_49;

import java.util.ArrayList;
import java.util.List;

public class test43 {
    public static void main(String[] args) {
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("AAA")); //Line n1
        list.add(new StringBuilder("BBB")); //Line n2
        list.add(new StringBuilder("AAA")); //Line n3

        list.removeIf(sb -> sb.equals(new StringBuilder("AAA"))); //Line n4
        System.out.println(list);   // [AAA, BBB, AAA]
    }
}
