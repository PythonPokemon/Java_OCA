/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_4.Aufgaben_40_bis_49;
import java.util.ArrayList;
import java.util.List;

public class test41 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        List<StringBuilder> list = new ArrayList<>();
        list.add(sb);
        list.add(new StringBuilder("Hello"));
        list.add(sb);
        sb.append("World!");

        System.out.println(list);   // [HelloWorld!, Hello, HelloWorld!]
    }
}
