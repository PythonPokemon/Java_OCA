/*
 * Was passiert im Code?
 *
 * Paketdeklaration:
 * package JACA_OCA_Test_1.Aufgaben_10_bis_19;
 * Das organisiert den Code in einem speziellen Ordner (Paket) namens JACA_OCA_Test_1.Aufgaben_10_bis_19.
 *
 * Klassendeklaration und Hauptmethode:
 * public class test12: Definiert eine öffentliche Klasse namens test12.
 * public static void main(String[] args): Der Einstiegspunkt für die Programmausführung.
 *
 * Initialisierung der Variable x:
 * int x = 1;: Deklariert eine Variable x und weist ihr den Wert 1 zu.
 *
 * while-Schleife:
 * while(checkAndIncrement(x)): Führt die Schleife aus, solange die Methode checkAndIncrement(x) true zurückgibt.
 * System.out.println(x);: Gibt den aktuellen Wert von x aus.
 *
 * Methode checkAndIncrement:
 * private static boolean checkAndIncrement(int x): Definiert eine private statische Methode, die einen int-Wert x als Parameter nimmt.
 * if (x < 5) { x++; return true; }: Wenn x kleiner als 5 ist, wird x um 1 erhöht und true zurückgegeben.
 * else { return false; }: Wenn x nicht kleiner als 5 ist, wird false zurückgegeben.
 *
 * Problem mit der Logik:
 * Der Wert von x wird in der Methode checkAndIncrement nur lokal erhöht und nicht zurückgegeben.
 * Daher bleibt der Wert von x in der main-Methode immer 1, was zu einer Endlosschleife führt.
 *
 * Was wird ausgegeben?
 * Da die Bedingung in der while-Schleife immer true ist und x immer 1 bleibt, wird die Ausgabe eine endlose Sequenz von 1 sein:
 * 1
 * 1
 * 1
 * ...
 */


package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_10_bis_19;

public class test12 {
    public static void main(String[] args) {
        int x = 1;
        while(checkAndIncrement(x)){
            System.out.println(x);  // endlosschleife 1
        }
    }

    private static boolean checkAndIncrement(int x) {
        if (x < 5) {
            x++;
            return true;
        } else {
            return false;
        }
    }
}
