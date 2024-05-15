/*
*
* new StringBuilder(100) erstellt einen neuen StringBuilder mit einer initialen Kapazität von 100 Zeichen.
* Dies bedeutet, dass der interne Puffer des StringBuilder Platz für 100 Zeichen hat,
* ohne dass eine interne Speichererweiterung nötig ist.
*
* Wichtig: Dies bedeutet nicht, dass der StringBuilder bereits 100 Zeichen enthält.
* Die Länge (length) des StringBuilder ist anfangs 0, da noch keine Zeichen hinzugefügt wurden.
*
* sb.length() gibt die Anzahl der tatsächlich im StringBuilder enthaltenen Zeichen zurück.
* Da noch keine Zeichen hinzugefügt wurden, ist dies 0.
* sb.toString().length() konvertiert den StringBuilder in einen String und gibt die Länge dieses String zurück.
* Da der StringBuilder leer ist, ist der resultierende String ebenfalls leer und seine Länge ist ebenfalls 0.
*
* */

package JACA_OCA_Test_1.Aufgaben_20_bis_29;

public class test27 {
    public static void main(String[] args) {

        // Variant 1 |
        StringBuilder sb = new StringBuilder(100); // kapazität von 100 zeichen!
        System.out.println(sb.length() + ":" + sb.toString().length()); // <-- was, kommt raus?

//----------------------------------------------------------------------------------------------------------------------

        // Variante 2 |
        // Ein StringBuilder-Objekt erstellen
        StringBuilder sb2 = new StringBuilder(); // ohne Kapazitätsangabe = Standardkapazität von 16 Zeichen | wird automatisch dynamisch erweitert

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
*
* Warum funktioniert das ohne Kapazität?
* Automatische Kapazitätserweiterung: Der StringBuilder verwaltet seine Kapazität intern und erweitert sie automatisch,
* wenn mehr Speicher benötigt wird. Dies macht es einfach, Zeichen hinzuzufügen, ohne sich um die anfängliche Kapazität kümmern zu müssen.
* Standardkapazität: Wenn keine Kapazität angegeben ist, verwendet der StringBuilder eine Standardkapazität (normalerweise 16 Zeichen).
* Diese wird dynamisch erhöht, wenn der Inhalt des StringBuilder wächst.

*-----------------------------------------------------------------------------------------------------------------------

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
