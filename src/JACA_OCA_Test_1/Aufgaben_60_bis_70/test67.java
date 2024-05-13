/*
* Die ConcurrentModificationException tritt auf, weil du versuchst, die Liste dryFruits zu ändern, während du gleichzeitig über sie iterierst.
* Dies geschieht in der Schleife, wenn du dryFruits.remove(dryFruit); aufrufst.
*
* Das Problem tritt auf, weil du die Methode remove der Liste während des Iterationsdurchlaufs aufrufst.
* Dies führt dazu, dass die interne Struktur der Liste modifiziert wird, was mit dem Iterator inkompatibel ist und zur ConcurrentModificationException führt.
* */

package JACA_OCA_Test_1.Aufgaben_60_bis_70;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Variante 1 | .ConcurrentModificationException | zum Testen auskommentieren
//public class test67 {
//    public static void main(String[] args) {
//        List<String> dryFruits = new ArrayList<>();
//        dryFruits.add("Walnut");
//        dryFruits.add("Apricot");
//        dryFruits.add("Almond");
//        dryFruits.add("Date");
//
//        Iterator<String> iterator = dryFruits.iterator();
//        while(iterator.hasNext()) {
//            String dryFruit = iterator.next();
//            if(dryFruit.startsWith("A")) {
//                dryFruits.remove(dryFruit);
//            }
//        }
//
//        System.out.println(dryFruits);  // .ConcurrentModificationException
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
/*
* Um dieses Problem zu lösen, kannst du entweder einen separaten Iterator verwenden, um die Elemente zu entfernen,
* oder du kannst die removeIf-Methode der Liste verwenden, um Elemente basierend auf einem Prädikat zu entfernen.
* Hier ist eine modifizierte Version des Codes mit der removeIf-Methode:
*
* Auf diese Weise wird die ConcurrentModificationException vermieden, da die removeIf-Methode intern eine sichere Art bietet,
* Elemente basierend auf einem Prädikat zu entfernen.
* */
// Variante 2 |
public class test67 {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        dryFruits.removeIf(dryFruit -> dryFruit.startsWith("A"));

        System.out.println(dryFruits);
    }
}