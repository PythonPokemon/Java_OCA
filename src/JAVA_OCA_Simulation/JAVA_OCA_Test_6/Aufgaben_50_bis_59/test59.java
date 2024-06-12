/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_50_bis_59;
import java.util.ArrayList;
import java.util.List;

public class test59 {
    public static void main(String[] args) {
        List<String> list;
        list = new ArrayList<>(); //Line n1
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");
        list.addAll(list.subList(0, 4)); //Line n2
        System.out.println(list);   // [A, E, I, O, U, A, E, I, O]
    }
}
