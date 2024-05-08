/*
* In diesem Code wird eine Liste von Strings erstellt und der String "Hello" wird zweimal hinzugefügt.
* Dann wird der String s mit s.replace("l", "L") verändert. Der entscheidende Punkt hier ist, dass Strings in Java unveränderlich sind.
* Das bedeutet, dass Methoden wie replace() den ursprünglichen String nicht ändern, sondern einen neuen String zurückgeben, der die Änderungen enthält.
*
* In diesem speziellen Fall wird "l" durch "L" ersetzt. Jedoch wird der neue String, der diese Änderung enthält,
* nicht in einer Variable gespeichert, also bleibt s unverändert.
*
* Daher wird die Liste list dreimal den String "Hello" enthalten, ohne dass die Änderung am Buchstaben "l" in s berücksichtigt wird.
* Daher wird "Hello" dreimal in der Liste ausgegeben, ohne dass der Buchstabe "l" durch "L" ersetzt wird.
* */

package JACA_OCA_Test_1.Aufgaben_40_bis_49;
import java.util.ArrayList;
import java.util.List;

//// Variante 1 | zum Testen auskommentieren
//public class test46 {
//    public static void main(String[] args) {
//        String s = new String("Hello");
//        List<String> list = new ArrayList<>();
//        list.add(s);
//        list.add(new String("Hello"));
//        list.add(s);
//        s.replace("l", "L");    // <-- replace methode falsch angewendet
//
//        System.out.println(list);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//// Variante 2 | zum Testen auskommentieren
//public class test46 {
//    public static void main(String[] args) {
//        String s = new String("Hello");
//        List<String> list = new ArrayList<>();
//        list.add(s);
//        list.add(new String("Hello"));
//        list.add(s.replace("l", "L")); // Ersetztes String wird direkt der Liste hinzugefügt
//
//        System.out.println(list);   // was kommt raus?
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
// Variante 3 | zum Testen auskommentieren

/*
* In dieser Version durchläuft eine Schleife alle Elemente der Liste und ersetzt jedes "l" durch "L".
* Dann werden die aktualisierten Strings wieder der Liste hinzugefügt.
* */
public class test46 {
    public static void main(String[] args) {
        String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).replace("l", "L"));
        }
        System.out.println(list);
    }
}