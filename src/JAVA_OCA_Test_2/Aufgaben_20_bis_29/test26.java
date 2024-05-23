/*
Um das Ergebnis dieses Codes zu verstehen, müssen wir die Funktionsweise der add(int index, E element) Methode der ArrayList-Klasse in Java kennen. Diese Methode fügt ein Element an einer bestimmten Position in die Liste ein und verschiebt alle nachfolgenden Elemente um eine Position nach rechts.

Schauen wir uns den Code Schritt für Schritt an:

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.add(0, "List");

        System.out.println(list);
    }
}
------------------------------------------------------------------------------------------------------------------------
Schritt-für-Schritt Analyse:
1. Initialisierung der Liste:

List<String> list = new ArrayList<>();
Eine neue leere ArrayList vom Typ String wird erstellt und der Variablen list zugewiesen.
------------------------------------------------------------------------------------------------------------------------
2. Erstes Element hinzufügen:

list.add(0, "Array");
Die Methode add(0, "Array") fügt das Element "Array" an der Position 0 (ganz vorne) in die Liste ein.
Die Liste sieht jetzt so aus: ["Array"].
------------------------------------------------------------------------------------------------------------------------
3. Zweites Element hinzufügen:

list.add(0, "List");
Die Methode add(0, "List") fügt das Element "List" an der Position 0 in die Liste ein.
Das bereits vorhandene Element "Array" wird um eine Position nach rechts verschoben.
Die Liste sieht jetzt so aus: ["List", "Array"].
------------------------------------------------------------------------------------------------------------------------
4. Ausgabe der Liste:

System.out.println(list);
Die Methode System.out.println(list) gibt die aktuelle Liste aus.
------------------------------------------------------------------------------------------------------------------------
Erklärung der Ausgabe:
Die Liste enthält die Elemente in der Reihenfolge, in der sie hinzugefügt wurden, wobei jedes neue Element an Position 0 eingefügt und die vorhandenen Elemente nach rechts verschoben werden.
Nach dem Hinzufügen der Elemente sieht die Liste wie folgt aus:
Nach dem ersten add(0, "Array"): ["Array"]
Nach dem zweiten add(0, "List"): ["List", "Array"]
Ausgabe:
mathematica
Code kopieren
[List, Array]
Zusammenfassung:
Die Methode add(int index, E element) der ArrayList fügt ein Element an der angegebenen Position ein und verschiebt alle nachfolgenden Elemente um eine Position nach rechts.
Durch das Einfügen der Elemente an Position 0 wird jedes neue Element an den Anfang der Liste gesetzt, wodurch die Reihenfolge der Elemente umgekehrt wird.
Diese Erklärung verdeutlicht, warum die Ausgabe ["List", "Array"] ist, obwohl die Elemente in der Reihenfolge "Array" und dann "List" hinzugefügt wurden.
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
