/*
 *[List, Array]
 * */

package JAVA_OCA_Test_2.Aufgaben_20_bis_29;
import java.util.ArrayList;
import java.util.List;

public class test26 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.add(0, "List");

        System.out.println(list);
    }
}
