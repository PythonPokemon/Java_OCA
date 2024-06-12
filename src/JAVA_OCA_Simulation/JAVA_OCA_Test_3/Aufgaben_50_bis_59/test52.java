/*
[7, 17, 5]

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_50_bis_59;
import java.util.ArrayList;
import java.util.List;

public class test52 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(7);
        list.add(50);
        list.add(17);
        list.add(10);
        list.add(5);

        list.removeIf(a -> a % 10 == 0);

        System.out.println(list);
    }
}
