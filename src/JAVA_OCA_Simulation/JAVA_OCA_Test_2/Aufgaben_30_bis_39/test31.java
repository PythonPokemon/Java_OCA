/*
In der ArrayList gibt es zwei verschiedene remove-Methoden, die auf unterschiedliche Weise arbeiten:

remove(int index):
Diese Methode entfernt das Element an der angegebenen Indexposition.
Sie gibt das entfernte Element zurück.
Beispiel: list.remove(0) entfernt das Element an Indexposition 0 und gibt das entfernte Element zurück.
------------------------------------------------------------------------------------------------------------------------
remove(Object o):
Diese Methode entfernt das erste Vorkommen des angegebenen Objekts.
Sie gibt true zurück, wenn ein Element entfernt wurde, andernfalls false.
Beispiel: list.remove("zwei") entfernt das erste Vorkommen des Strings "zwei" und gibt true zurück, wenn ein Element entfernt wurde.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_30_bis_39;
import java.util.ArrayList;
import java.util.List;

//public class test31 {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add(null);
//        list.add(null);
//        list.add(null);
//        System.out.println(list.remove(0) + ":" + list.remove(null));
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//// Variante 2
public class test31 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("eins");
        list.add("zwei");
//        list.add(null);
        System.out.println(list.remove(0)); // gibt das element aus das aus dem index entfernt wird
        System.out.println(list.remove("zwei"));    // gibt true aus wenn das objekt aus der liste entfernt wurde
//        System.out.println(list);   //[null] weil nur noch drinn ist
    }
}
//----------------------------------------------------------------------------------------------------------------------
// Variante 3 | adressen einsicht zum Testen
//public class test31 {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("eins");
//        list.add("zwei");
//        list.add(null);
//        System.out.println(list);   // [eins, zwei, null]
//    }
//}