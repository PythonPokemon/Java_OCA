/*
[apple, orange, mango, banana, grape]

Gesamterklärung
remove(Object) der List-Schnittstelle entfernt das erste Vorkommen des angegebenen Elements aus der Liste, falls es vorhanden ist.
Wenn diese Liste das Element nicht enthält, ist es unverändert. remove(Object) gibt true zurück, wenn das Entfernen erfolgreich war, sonst false.

Ursprünglich hat die Liste: [Apfel, Orange, Traube, Mango, Banane, Traube]. fruits.remove("grape") entfernt das erste
Vorkommen von "grape" und nach dem erfolgreichen Entfernen hat die Liste: [apple, orange, mango, banana, grape].
fruits.remove("grape") gibt true zurück, das Steuerelement geht in den if-Block und führt fruits.remove("papaya") aus;

Die Obstliste enthält kein "Papaya", daher bleibt die Liste unverändert.
In der Konsole erhalten Sie: [Apfel, Orange, Mango, Banane, Traube].
 * */
package JAVA_OCA_Test_3.Aufgaben_10_bis_19;
import java.util.ArrayList;
import java.util.List;

public class test15 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");

        if(fruits.remove("grape"))
            fruits.remove("papaya"); // kein fehler, da die .remove(Objekt) Methode boolisch ist und nur true or false

        System.out.println(fruits);
//        System.out.println(fruits.remove("papaya"));
    }
}
