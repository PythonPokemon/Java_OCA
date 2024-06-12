/*
Gesamterklärung
Die Point-Klasse überschreibt die Methode toString() korrekt. Obwohl die Variable x statisch ist,
kann mit der Instanzmethode toString() leicht darauf zugegriffen werden.

Die Variablen x, y und z werden mit dem Standardbereich deklariert, sodass im selben Paket darauf zugegriffen werden kann.
Es gibt keinen Kompilierungsfehler im Code.

Es gibt nur eine Kopie der statischen Variablen für alle Instanzen der Klasse.
Die Variable x wird von p1 und p2 gemeinsam genutzt.

p1.x = 17; setzt den Wert der statischen Variablen x auf 17, p2.x = 19;
Ändert den Wert der statischen Variablen x auf 19. Da es nur eine Kopie von x gibt, ist p1.x = 19

Bitte beachten Sie: p1.x und p2.x verursachen keinen Kompilierungsfehler, aber da diese Syntax Verwirrung stiftet,
ist es keine gute Praxis, über die Referenzvariablen auf die statischen Variablen oder statischen Methoden zuzugreifen,
stattdessen sollte der Klassenname verwendet werden. Point.x ist die bevorzugte Syntax.

Jedes Objekt hat seine eigene Kopie von Instanzvariablen,
also kurz vor dem Ausführen von Zeile n1, p1.y = 35 & p1.z = -1 UND p2.y = 40 & p2.z = 0

Ausgabe ist:

Punkt(19, 35, -1)

Punkt(19, 40, 0)
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_30_bis_39;
class Point {
    static int x;   // static heißt statisch bleibt für alle gleich, allerdings wird das zueletzt verwendete element ausgedruckt
                    // bedeutet p1.x und p2.x teilen sich den wert und da p2.x den wert neu zuweist das zuletzt zugewiesene element!
    int y, z;       // die daten typen sind für alle individuell

    public String toString() {
        return "Point(" + x + ", " + y + ", " + z + ")";
    }
}

public class test30 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 17;
        p1.y = 35;
        p1.z = -1;

        Point p2 = new Point();
        p2.x = 19;
        p2.y = 40;
        p2.z = 0;

        System.out.println(p1); //Line n1
        System.out.println(p2); //Line n2
    }
}
