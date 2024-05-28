/*
die contains()-Methode nach dem gleichen Objekt in der Liste sucht, nicht nur nach einem Objekt mit dem gleichen Inhalt.

Die contains()-Methode vergleicht die Objekte in der Liste anhand ihrer Speicheradressen, nicht anhand ihres Inhalts.
Selbst wenn zwei StringBuilder-Objekte denselben Inhalt haben, werden sie als unterschiedliche Objekte betrachtet,
wenn sie an unterschiedlichen Speicheradressen gespeichert sind.
In diesem Fall wird die Methode contains() false zurückgeben, da das übergebene StringBuilder-Objekt nicht dasselbe ist
wie die in der Liste gespeicherten StringBuilder-Objekte, selbst wenn sie denselben Inhalt haben.

wenn du new StringBuilder("Sunday") aufrufst, wird jedes Mal ein neues StringBuilder-Objekt erzeugt,
auch wenn der Inhalt gleich ist.
Selbst wenn der Inhalt des neuen Objekts dem Inhalt eines Objekts in der Liste entspricht, sind es zwei separate Objekte
mit unterschiedlichen Speicheradressen. Die contains()-Methode vergleicht nach Referenzgleichheit,
nicht nach dem Inhalt der Objekte, daher wird false zurückgegeben, wenn das übergebene Objekt nicht dasselbe Objekt ist,
das in der Liste enthalten ist.
 * */
package JAVA_OCA_Test_2.Aufgaben_50_bis_59;
import java.util.ArrayList;
import java.util.List;

public class test59 {
    public static void main(String[] args) {
        List<StringBuilder> days = new ArrayList<>();
        days.add(new StringBuilder("Sunday"));
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));

        /*
        * Die contains()-Methode vergleicht die Objekte in der Liste anhand ihrer Speicheradressen,
        * nicht anhand ihres Inhalts.
        * mit new wird im prinzip ein neues objekt erzeugt das aber nicht, dass selbe aus der liste ist?
        * deshalb false und es wird der liste keine "Wednesday" der liste hinzugefügt!
        * */
        if(days.contains(new StringBuilder("Sunday"))) {    // erstellt ein neues objekt und vergleicht dessen
                                                            // speicheradresse mit dem objekt aus er liste
            days.add(new StringBuilder("Wednesday"));
        }

        System.out.println(days.size());
    }
}
