/*
Grund des Fehlers
List.remove(int index):

Diese Methode entfernt das Element an der angegebenen Position (Index) und gibt das entfernte Element zurück (vom Typ String in diesem Fall).
Beispiel: list.remove(2) entfernt das dritte Element (Index 2) und gibt "THREE" zurück.

List.remove(Object o):

Diese Methode entfernt das erste Vorkommen des angegebenen Objekts aus der Liste und gibt true zurück, wenn die Liste geändert wurde, andernfalls false.
Beispiel: list.remove("THREE") entfernt das erste Vorkommen von "THREE" und gibt true oder false zurück, abhängig davon, ob ein Element entfernt wurde.

Kompilierungsfehler
Der Ausdruck if(list.remove(2)) erwartet einen boolean-Wert, da die Bedingung eines if-Statements ein boolean-Wert sein muss.
list.remove(2) gibt jedoch einen String zurück (das entfernte Element), nicht boolean.
Dies führt zu einem Typinkompatibilitätsfehler während der Kompilierung, weil ein String nicht als boolean verwendet werden kann.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_40_bis_49;
import java.util.ArrayList;
import java.util.List;

//public class test46 {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("ONE");
//        list.add("TWO");
//        list.add("THREE");
//        list.add("THREE");
//
//        if(list.remove(2)) {  // erwartet boolean wert!
//            list.remove("THREE");
//        }
//
//        System.out.println(list);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
// Korrektur
public class test46 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");  // <-- das         list.remove(2);
        list.add("THREE");  // <-- das      list.remove("THREE");

        // Entferne das Element an der Position 2 (Index 2)
        list.remove(2);

        // Entferne das erste Vorkommen von "THREE"
        list.remove("THREE");

        System.out.println(list);
    }
}