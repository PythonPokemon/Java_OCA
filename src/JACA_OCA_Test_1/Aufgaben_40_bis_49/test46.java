/*
*
* */

package JACA_OCA_Test_1.Aufgaben_40_bis_49;
import java.util.ArrayList;
import java.util.List;

public class test46 {
    public static void main(String[] args) {
        String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);
        s.replace("l", "L");

        System.out.println(list);
    }
}
