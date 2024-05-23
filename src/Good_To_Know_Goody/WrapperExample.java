/*
In diesem Beispiel verwenden wir die Wrapper-Klasse Integer, um primitive int-Werte in Objekte umzuwandeln,
die von der ArrayList gespeichert werden können. Wir fügen dann einige Werte zur Liste hinzu,
entfernen einen Wert und überprüfen, ob ein bestimmter Wert in der Liste vorhanden ist.

Die Verwendung von Wrapper-Klassen erleichtert die Arbeit mit Java-Klassen, die nur Objekte akzeptieren,
da sie es ermöglichen, primitive Werte in Objekte umzuwandeln und umgekehrt,
ohne dass man sich um die Details der Konvertierung kümmern muss.
Dieser Prozess wird als Autoboxing und Unboxing bezeichnet.

Hier sind die Stellen im Code, wo Autoboxing und Unboxing auftreten:

Autoboxing: Die Methode add(int) der ArrayList erwartet ein Integer-Objekt, jedoch geben wir einen primitiven int-Wert (10, 20, 30) an. Die Autoboxing-Funktion von Java konvertiert automatisch diese primitiven Werte in entsprechende Integer-Objekte, bevor sie der Liste hinzugefügt werden.

integerList.add(10); // Autoboxing: int -> Integer
integerList.add(20); // Autoboxing: int -> Integer
integerList.add(30); // Autoboxing: int -> Integer
Unboxing: Bei der Verwendung der contains(int)-Methode wird ein primitiver int-Wert in ein Integer-Objekt umgewandelt, um zu überprüfen, ob er in der Liste vorhanden ist. Die Unboxing-Funktion von Java konvertiert automatisch das Integer-Objekt zurück in einen primitiven int-Wert für den Vergleich.


boolean containsValue = integerList.contains(30); // Unboxing: Integer -> int
Autoboxing und Unboxing erleichtern die Arbeit mit primitiven Datentypen und ihren Wrapper-Klassen, indem sie automatisch die Konvertierung zwischen ihnen durchführen, wenn dies erforderlich ist.











* */

package Good_To_Know_Goody;

import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        // Erstellen einer ArrayList für Integer-Werte
        ArrayList<Integer> integerList = new ArrayList<>();

        // Hinzufügen von primitiven int-Werten zur Liste
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        // Iteration über die Liste und Ausgabe der Werte
        for (Integer value : integerList) {
            System.out.println(value);
        }

        // Entfernen eines Werts aus der Liste
        integerList.remove(Integer.valueOf(20));

        // Überprüfen, ob ein Wert in der Liste vorhanden ist
        boolean containsValue = integerList.contains(30);
        System.out.println("List contains 30: " + containsValue);
    }
}

