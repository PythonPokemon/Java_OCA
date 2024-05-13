/*
* Dieser Code erstellt ein String-Array mit den Namen "Smith", "Brown", "Thomas", "Taylor" und "Jones". Dann wird eine leere Liste erstellt.
*
* In der Schleife wird jedem Namen in dem Array die Liste hinzugefügt. Innerhalb der Schleife gibt es eine switch-Anweisung.
* Bei x = 2 wird das continue-Statement erreicht, was dazu führt, dass die aktuelle Iteration abgebrochen wird und die Schleife zum nächsten Schleifendurchlauf springt.
* Da continue die Schleife vorzeitig beendet, wird der break-Befehl, der danach kommt, nicht erreicht.
*
* Da der continue-Fall bei x = 2 auftritt, wird der Name "Thomas" übersprungen, und nach dem Hinzufügen von "Thomas" wird die Schleife abgebrochen.
*
* Die Ausgabe des Codes wird sein: 1
*
* Da nur der Name "Smith" hinzugefügt wird, bevor die Schleife durch das continue-Statement unterbrochen wird, enthält die Liste nur ein Element.
 * */

package JACA_OCA_Test_1.Aufgaben_60_bis_69;
import java.util.ArrayList;
import java.util.List;

public class test66 {
    public static void main(String[] args) {
        String[] names = { "Smith", "Brown", "Thomas", "Taylor", "Jones" };
        List<String> list = new ArrayList<>();
        for (int x = 0; x < names.length; x++) {
            list.add(names[x]);
            switch (x) {
                case 2:
                    continue;
            }
            break;
        }
        System.out.println(list.size());    // was kommt raus?
    }
}
