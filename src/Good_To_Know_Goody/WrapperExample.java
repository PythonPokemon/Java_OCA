/*
In diesem Beispiel verwenden wir die Wrapper-Klasse Integer, um primitive int-Werte in Objekte umzuwandeln,
die von der ArrayList gespeichert werden können. Wir fügen dann einige Werte zur Liste hinzu,
entfernen einen Wert und überprüfen, ob ein bestimmter Wert in der Liste vorhanden ist.

Die Verwendung von Wrapper-Klassen erleichtert die Arbeit mit Java-Klassen, die nur Objekte akzeptieren,
da sie es ermöglichen, primitive Werte in Objekte umzuwandeln und umgekehrt,
ohne dass man sich um die Details der Konvertierung kümmern muss.
Dieser Prozess wird als Autoboxing und Unboxing bezeichnet.
------------------------------------------------------------------------------------------------------------------------
Hier sind die Stellen im Code, wo Autoboxing und Unboxing auftreten:

1. Autoboxing: Die Methode add(int) der ArrayList erwartet ein Integer-Objekt,
jedoch geben wir einen primitiven int-Wert (10, 20, 30) an.

Die Autoboxing-Funktion von Java konvertiert automatisch diese primitiven Werte in entsprechende Integer-Objekte,
bevor sie der Liste hinzugefügt werden.

integerList.add(10); // Autoboxing: int -> Integer
integerList.add(20); // Autoboxing: int -> Integer
integerList.add(30); // Autoboxing: int -> Integer
------------------------------------------------------------------------------------------------------------------------
2. Unboxing: Bei der Verwendung der contains(int)-Methode wird ein primitiver int-Wert in ein Integer-Objekt umgewandelt,
um zu überprüfen, ob er in der Liste vorhanden ist.
Die Unboxing-Funktion von Java konvertiert automatisch das Integer-Objekt zurück
in einen primitiven int-Wert für den Vergleich.

boolean containsValue = integerList.contains(30); // Unboxing: Integer -> int
Autoboxing und Unboxing erleichtern die Arbeit mit primitiven Datentypen und ihren Wrapper-Klassen,
indem sie automatisch die Konvertierung zwischen ihnen durchführen, wenn dies erforderlich ist.
------------------------------------------------------------------------------------------------------------------------
auf den ersten Blick etwas irreführend aus.
Tatsächlich ist sie so geschrieben, dass sie den Wert 20 aus der Liste entfernt.
Die Methode remove(Object o) der ArrayList-Klasse entfernt das erste Vorkommen des angegebenen Objekts aus der Liste,
wenn es vorhanden ist. Sie vergleicht die Objekte mithilfe ihrer equals()-Methode, um festzustellen, ob sie gleich sind.

In diesem Fall verwenden wir Integer.valueOf(20), um ein Integer-Objekt zu erstellen, das den Wert 20 repräsentiert.
Dann wird remove(Integer.valueOf(20)) aufgerufen, um das Integer-Objekt 20 aus der Liste zu entfernen.

Obwohl dies auf den ersten Blick etwas ungewöhnlich erscheinen mag (wir könnten einfach remove(20) verwenden,
um den primitiven Wert 20 zu entfernen), zeigt dieses Beispiel den Prozess der Unboxing-Methode in Aktion.
Wenn wir remove(20) verwenden würden, würde Java automatisch den primitiven int-Wert
in ein Integer-Objekt umwandeln (Autoboxing), und dann würde die Methode remove(Object o) nach dem passenden
Integer-Objekt in der Liste suchen, um es zu entfernen.
------------------------------------------------------------------------------------------------------------------------
normalerweise verwendet man new, um ein neues Objekt zu erstellen.
Allerdings gibt es in Java auch eine andere Möglichkeit, Wrapper-Objekte zu erstellen,
nämlich durch die Verwendung von statischen Methoden wie valueOf(), die in den Wrapper-Klassen definiert sind.

Die Methode Integer.valueOf(20) ist eine statische Methode der Klasse Integer,
die einen primitiven int-Wert als Argument akzeptiert und ein entsprechendes Integer-Objekt zurückgibt,
das den gleichen Wert repräsentiert.
Diese Methode wird für die Autoboxing verwendet, um einen primitiven Wert in ein Wrapper-Objekt umzuwandeln.

In unserem Beispiel verwenden wir Integer.valueOf(20), um ein Integer-Objekt zu erstellen, das den Wert 20 repräsentiert.
Dieses Objekt wird dann der remove()-Methode übergeben, um das entsprechende Objekt in der Liste zu entfernen.

Das ist eine gängige Praxis in Java und bietet eine kompakte Möglichkeit, Wrapper-Objekte zu erstellen,
insbesondere wenn sie für Autoboxing-Zwecke verwendet werden.

------------------------------------------------------------------------------------------------------------------------
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
        integerList.remove(Integer.valueOf(20)); // verkürze syntax, um neues objekt anzulegen Datenty.valueOf | und inmittelbar danach wird das objekt wieder mit der remove methode gelöscht!

        // Überprüfen, ob ein Wert in der Liste vorhanden ist
        boolean containsValue = integerList.contains(30);
        System.out.println("List contains 30: " + containsValue);
    }
}

