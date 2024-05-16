/*
 * Kompilierungsfehler
 *
 * Gesamterklärung
Die Methode list.remove(Object) gibt ein boolesches Ergebnis zurück,
* aber list.remove(int index) gibt das entfernte Element aus der Liste zurück,
* das in diesem Fall vom Typ String und nicht vom Typ Boolean ist und daher einen Kompilierungsfehler verursacht.
 * */
package JACA_OCA_Test_2.Aufgaben_40_bis_49;
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
//        if(list.remove(2)) {
//            list.remove("THREE");
//        }
//
//        System.out.println(list);
//    }
//}
