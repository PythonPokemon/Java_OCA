package JACA_OCA_Test_1.Aufgaben_60_bis_70;

import java.util.ArrayList;
import java.util.List;

public class test65 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(new Integer(0));

        list.remove(list.indexOf(0));

        System.out.println(list);   //<-- was kommt raus?
    }
}
