package TestAufgaben;

/* Code Beschreibung.
 * Dieses Java-Programm demonstriert die Verwendung des Plusoperators (+) mit Zeichenketten und ganzen Zahlen.
 * In der ersten Ausgabe wird die Zeichenkette "Result:" mit der Zeichenkette "3" konkateniert, gefolgt von der Zeichenkette "5".
 * Da beide Operanden Zeichenketten sind, wird die Addition als Zeichenkettenkonkatenation interpretiert. Daher wird "Result:35" ausgegeben.
 * In der zweiten Ausgabe wird "(3+5)" innerhalb der Klammern zuerst ausgewertet, was zu der ganzen Zahl 8 führt.
 * Dann wird die Zeichenkette "Result:" mit der ganzen Zahl 8 konkateniert, was zu "Result:8" führt.
 *
 * Die Ausgabe dieses Programms wird sein:
 * Result: 35
 * Result: 8
 *
 * Das erste Ergebnis ist 35, da die Zahlen 3 und 5 als Zeichenketten behandelt und konkateniert werden.
 * Das zweite Ergebnis ist 8, da die Zahlen innerhalb der Klammern zuerst addiert werden und dann mit der Zeichenkette "Result:" konkateniert werden.
 * */
public class LZK8 {
    public static void main(String[] args) {
        System.out.println("Result:" + 3 + 5); // = Result: 35 | da 3 und 5 wie eine zeichenkette gesehen und nicht addiert werden.
        System.out.println("Result:" + (3 + 5)); // = Result: 8 | weil in klammer tatsächlich addiert wird
    }
}
