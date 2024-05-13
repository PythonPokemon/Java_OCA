/*
 * Dieser Code erstellt zwei leere Listen von Zeichenketten, list1 und list2, indem er jeweils eine Instanz von ArrayList<String> erstellt.
 * Dann gibt er einfach den Inhalt der beiden Listen aus, indem er System.out.println() verwendet.
 * Da die Listen leer sind, wird die Ausgabe für beide Listen einfach [] sein, was eine leere Liste darstellt.
 * */

package JACA_OCA_Test_1.Aufgaben_40_bis_49;

import java.util.ArrayList;
import java.util.List;

public class test49 {
    public static void main(String[] args) {

        // Variante 1 Richtig | zum Testen auskommentieren
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<String>();

        // Variante 2 Falsch | zum Testen auskommentieren
//      List<String> list1 = List<>();                      <--
//      List<String> list2 = List<String>();                <--

        System.out.println(list1);
        System.out.println(list2);
    }
}
