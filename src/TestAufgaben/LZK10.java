package TestAufgaben;

/* Code Beschreibung.
 * Dieses Java-Programm durchläuft ein Array von Farben und gibt nur diejenigen aus, deren Länge genau 4 Zeichen beträgt.
 * Ein String-Array namens "colors" wird mit den Farben "red", "blue", "green", "yellow", "maroon" und "cyan" initialisiert.
 * Eine for-each-Schleife wird verwendet, um jedes Element des Arrays "colors" zu durchlaufen.
 * Innerhalb der Schleife wird überprüft, ob die Länge des aktuellen Farbnamens ungleich 4 ist.
 * Wenn die Länge ungleich 4 ist, wird die Schleife mit "continue" vorzeitig verlassen, ohne den Rest des Schleifenkörpers auszuführen.
 * Wenn die Länge genau 4 ist, wird die Farbe ausgegeben.
 * Nur die Farben mit einer Länge von genau 4 Zeichen werden ausgegeben.
 *
 * Die Ausgabe dieses Programms wird sein:
 * blue,
 * cyan,
 *
 * Da nur die Farben "blue" und "cyan" genau 4 Zeichen lang sind, werden sie in der Ausgabe angezeigt.
 * Die anderen Farben ("red", "green", "yellow" und "maroon") haben entweder eine Länge kleiner oder größer als 4 und werden daher nicht ausgegeben.
 * */
public class LZK10 {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
        for (String c : colors) {
            if (c.length() != 4) {
                continue;
            }
            System.out.println(c + ", ");
        }
    }
}
