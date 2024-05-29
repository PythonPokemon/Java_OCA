/*
Code-Analyse
1.Initialisierung:

String[] names = { "Smith", "Brown", "Thomas", "Taylor", "Jones" };
List<String> list = new ArrayList<>();

Ein Array names mit fünf Strings wird erstellt und eine leere ArrayList list wird initialisiert.
------------------------------------------------------------------------------------------------------------------------
2.Schleife:

for (int x = 0; x < names.length; x++) {
    list.add(names[x]);
    switch (x) {
        case 2:
            continue;
    }
    break;
}

Eine for-Schleife läuft von x = 0 bis x = 4 (die Länge des names-Arrays).
------------------------------------------------------------------------------------------------------------------------
3.Erster Schleifendurchlauf (x = 0):

list.add(names[x]); fügt den ersten Namen "Smith" zur Liste hinzu.
switch (x) prüft den Wert von x, der 0 ist, also gibt es keine Übereinstimmung mit case 2.
Der break-Befehl wird ausgeführt, was die Schleife verlässt.
Da der break-Befehl die Schleife verlässt, nachdem der erste Name hinzugefügt wurde,
werden keine weiteren Elemente hinzugefügt.
------------------------------------------------------------------------------------------------------------------------
Warum nur ein Element?
Im ersten Durchlauf (x = 0), wird "Smith" der Liste hinzugefügt.
Der switch-Block hat keine case-Übereinstimmung für 0, also wird der break-Befehl außerhalb des switch-Blocks ausgeführt.
break beendet die for-Schleife nach dem ersten Durchlauf.
------------------------------------------------------------------------------------------------------------------------
Fazit
Da die Schleife nach dem ersten Durchlauf beendet wird, wird nur ein Element ("Smith") zur Liste hinzugefügt.
Daher ist die Größe der Liste 1.
 * */

package JAVA_OCA_Test_1.Aufgaben_60_bis_69;
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
