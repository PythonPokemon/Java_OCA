/*
 * [X, X, Y, Z]
 *
 * Gesamterklärung
Nachdem alle add-Anweisungen ausgeführt wurden, enthält die Liste: [X, Y, X, Y, Z].

list.remove(new String("Y")); entfernt das erste Vorkommen von "Y" aus der Liste, d. h. das 2. Element der Liste. Die Liste nach dem Entfernen enthält: [X, X, Y, Z].

HINWEIS: Die String-Klasse und alle Wrapper-Klassen überschreiben die equals(Object)-Methode,
* daher gibt es zum Zeitpunkt des Entfernens, wenn eine andere Instanz [new String("Y")] übergibt,
* kein Problem beim Entfernen des übereinstimmenden Elements.
 * */
package JACA_OCA_Test_2.Aufgaben_50_bis_59;
import java.util.ArrayList;
import java.util.List;

public class test58 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.remove(new String("Y"));
        System.out.println(list);
    }
}
