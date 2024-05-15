/*
* Der Code erstellt eine Liste von Ganzzahlen (Integer) und fügt die Werte 2, 1 und 0 der Liste hinzu.
* Dann wird der Index des Werts 0 in der Liste gefunden und dieser Wert wird entfernt.
* Da indexOf den Index des ersten Auftretens des angegebenen Elements in der Liste zurückgibt,
* wird in diesem Fall der Index des Werts 0 gefunden und entfernt.
*
* Die Liste enthält nach dem Entfernen des Werts 0 die verbleibenden Werte 2 und 1.
* */
package JACA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_60_bis_69;

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
