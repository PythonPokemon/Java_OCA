/*
*
* In diesem Code wird zunächst ein StringBuilder-Objekt erstellt und dabei eine Kapazität von 100 angegeben.
* Diese Kapazität gibt an, wie viele Zeichen der StringBuilder initial speichern kann, bevor er automatisch erweitert wird.
*
* Beim Aufruf der Methode length() auf dem StringBuilder-Objekt wird die aktuelle Länge des Inhalts zurückgegeben, nicht die Kapazität.
*
* Da der StringBuilder-Objekt gerade erstellt wurde und noch keine Zeichen hinzugefügt wurden, ist die Länge des Inhalts 0.
* Wenn Sie jedoch sb.toString().length() aufrufen, wird der aktuelle Inhalt des StringBuilder in eine Zeichenkette umgewandelt, und dann wird die Länge dieser Zeichenkette zurückgegeben.
*
* Da der aktuelle Inhalt des StringBuilder leer ist, ist die Länge der resultierenden Zeichenkette ebenfalls 0.
*
* Deshalb wird 0:0 ausgegeben, da beide Längen 0 sind:
* die Länge des Inhalts des StringBuilder und die Länge der resultierenden Zeichenkette, nachdem der StringBuilder in eine Zeichenkette umgewandelt wurde.
* */

package JACA_OCA_Test_1.Aufgaben_20_bis_29;

public class test27 {
    public static void main(String[] args) {

        // Variant 1 |
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.length() + ":" + sb.toString().length()); // <-- was, kommt raus?

//----------------------------------------------------------------------------------------------------------------------

        // Variante 2 |
        // Ein StringBuilder-Objekt erstellen
        StringBuilder sb2 = new StringBuilder();

        // Einige Zeichen und Zeichenketten hinzufügen
        sb2.append("Hallo, "); // Zeichenkette hinzufügen
        sb2.append("Welt!");   // Zeichenkette hinzufügen
        sb2.append(123);       // Eine Zahl als Zeichenkette hinzufügen

        // Den Inhalt des StringBuilder als String abrufen
        String result = sb2.toString();

        // Den resultierenden String ausgeben
        System.out.println(result); // Ausgabe: Hallo, Welt!123

    }
}

/*  Zusatzinfo.
* Der StringBuilder wird in Java verwendet, um effizient Zeichenketten zu erstellen,
* insbesondere wenn viele Operationen wie das Hinzufügen von Zeichen oder das Zusammenführen von Zeichenketten durchgeführt werden müssen.
* Im Gegensatz zu herkömmlichen Zeichenketten (String-Objekten), die unveränderlich sind (d. h., sobald sie erstellt wurden, können sie nicht geändert werden),
* erlaubt der StringBuilder die dynamische Änderung seiner Inhalte, was ihn besonders nützlich macht, wenn viele Manipulationen an der Zeichenkette durchgeführt werden müssen.
*
* Der StringBuilder wird in der Regel verwendet, wenn Sie eine große Anzahl von Zeichen hinzufügen oder manipulieren müssen,
* da er effizienter ist als die Verkettung von String-Objekten mithilfe des +-Operators oder der concat()-Methode.
* Dies liegt daran, dass die Verwendung des +-Operators oder der concat()-Methode für jeden Vorgang eine neue Zeichenkette erstellt,
* was zu einer ineffizienten Speichernutzung führen kann, insbesondere wenn viele Operationen durchgeführt werden.
*
* Um den StringBuilder zu erweitern, verwenden Sie die Methode append().
* Diese Methode fügt die angegebenen Zeichen, Zeichenfolgen oder andere Daten dem Ende des StringBuilder hinzu.
* */
