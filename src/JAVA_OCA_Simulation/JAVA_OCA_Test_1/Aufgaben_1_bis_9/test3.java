/*
* In diesem Code werden zwei ArrayLists erstellt:
* list1 und list2. Dann werden die Elemente der zweiten Liste list2 an der Position 1 (Index 1) der ersten Liste list1 hinzugefügt.
*
* Hier ist der Ablauf:
*
Es wird eine leere ArrayList list1 erstellt.
Die Elemente "A" und "D" werden der Liste list1 hinzugefügt.
Eine weitere leere ArrayList list2 wird erstellt.
Die Elemente "B" und "C" werden der Liste list2 hinzugefügt.
Die Methode addAll(1, list2) wird auf list1 angewendet. Dies fügt alle Elemente der Liste list2 an der Position 1 (Index 1) von list1 ein.

* Da die Position 1 in einer Liste den Index des zweiten Elements darstellt,
* wird "B" zuerst eingefügt, gefolgt von "C", und dann werden die ursprünglichen Elemente von Position 1 und höher (in diesem Fall nur "D") verschoben.
Die Methode System.out.println(list1) gibt den Inhalt der Liste list1 auf der Konsole aus, der jetzt "A", "B", "C" und "D" enthält.
Daher wird [A, B, C, D] auf der Konsole ausgegeben.
* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_1_bis_9;

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

        System.out.println(list1);  //<-- was kommt raus?
    }
}
