package JACA_OCA_Test1.Aufgaben1bis10;

import java.util.ArrayList;
import java.util.List;

public class test3 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("D");

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");

        list1.addAll(1, list2);

        System.out.println(list1);  // = [A, B, C, D]
    }
}