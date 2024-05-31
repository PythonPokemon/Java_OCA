/*
Erklärung des Fehlers
------------------------------------------------------------------------------------------------------------------------
1.Deklaration und Initialisierung von d1:
static Double d1; deklariert eine statische Variable d1 vom Typ Double.
Da d1 nicht explizit initialisiert wird, erhält sie automatisch den Standardwert null.

2.Initialisierung von x:
static int x = d1.intValue(); versucht, d1.intValue() auszuführen, um den Wert von x zu initialisieren.
Die Methode intValue() wird auf dem Objekt d1 aufgerufen.
------------------------------------------------------------------------------------------------------------------------
3.Warum führt dies zu einer NullPointerException?
NullPointerException:
Da d1 null ist, gibt es kein tatsächliches Double-Objekt, auf dem die Methode intValue() aufgerufen werden kann.
Der Aufruf von d1.intValue() auf null führt zu einer NullPointerException,
weil die Methode intValue() auf einem null-Verweis aufgerufen wird.
------------------------------------------------------------------------------------------------------------------------
4.Zeitpunkt des Fehlers
Statische Initialisierung:
Die statischen Variablen und Initialisierer-Blöcke werden ausgeführt, wenn die Klasse geladen wird,
bevor die main-Methode ausgeführt wird.
Der Fehler tritt also auf, bevor die main-Methode erreicht wird. Daher wird "HELLO" niemals gedruckt,
da das Programm vorher abstürzt.
 * */
package JAVA_OCA_Test_3.Aufgaben_10_bis_19;


public class test18 {
    // statische methoden müssen vor dem start der main methode initialisiert werden!
    static Double d1;   // wenn nicht explizit initialisiert wird, erhält sie automatisch den Standardwert null.
    static int x = d1.intValue();   // d1  wird x zugewiesen und da statische methoden vpr der main ausgeführt wird
                                    // wird Hello niemals ausgegeben weil, .NullPointerException stattfindet!

    public static void main(String[] args) {
        System.out.println("HELLO");
    }
}
