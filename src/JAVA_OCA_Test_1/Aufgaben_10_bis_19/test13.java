/*
 * Was passiert im Code?
 *
 * Paketdeklaration:
 * package JACA_OCA_Test_1.Aufgaben_10_bis_19;
 * Das organisiert den Code in einem speziellen Ordner (Paket) namens JACA_OCA_Test_1.Aufgaben_10_bis_19.
 *
 * Klassendeklaration:
 * public class test13: Definiert eine öffentliche Klasse namens test13.
 *
 * Hauptmethode (main):
 * Die Hauptmethode ist auskommentiert, um zu verhindern, dass sie vom Compiler ausgeführt wird.
 *
 * Erklärung der Hauptmethode:
 * // public static void main(String[] args): Der Einstiegspunkt für die Programmausführung.
 * // short[] args = new short[]{50, 50};: Deklariert ein short-Array namens args und initialisiert es mit den Werten 50 und 50.
 * // args[0] = 5;: Setzt das erste Element des Arrays args auf 5.
 * // args[1] = 10;: Setzt das zweite Element des Arrays args auf 10.
 * // System.out.println("[" + args[0] + ", " + args[1] + "]");: Gibt die Werte des Arrays args im Format [5, 10] aus.
 *
 * Grund für den Compiler-Fehler:
 * Der Fehler tritt auf, weil der Bezeichner args in der Methode main sowohl als Parameter als auch als Variablenname verwendet wird.
 * Die Methode main hat bereits einen Parameter namens args vom Typ String[], der die Kommandozeilenargumente repräsentiert.
 * Die Deklaration short[] args in der Methode main steht in Konflikt mit dem Parameter args, was zu einem Namenskonflikt führt.
 *
 * Lösung des Problems:
 * Um den Fehler zu beheben, sollte ein anderer Name für das short-Array verwendet werden, um den Konflikt zu vermeiden.
 */


package JAVA_OCA_Test_1.Aufgaben_10_bis_19;

public class test13 {

    // Auskommentieren zu Testen.
    // Compiler fehler | weil die variablen deklaration args im Konflikt zu anderen steht
//    public static void main(String[] args) {
//        short[] args = new short[]{50, 50};   <--  args bezeichner/variable steht mit dem obigen args im konflikt
//        args[0] = 5;
//        args[1] = 10;
//        System.out.println("[" + args[0] + ", " + args[1] + "]");
//    }


    // Korrekte ausgabe
    public static void main(String[] args) {
        short[] lola = new short[]{50, 50};      // lösung anderen bezeichner wählen --> lola
        lola[0] = 5;
        lola[1] = 10;
        System.out.println("[" + lola[0] + ", " + lola[1] + "]"); // [5, 10]
    }
}
