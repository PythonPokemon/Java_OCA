/**
 * Lool im Loop
 * zuerst wird immer der innere Loop ausgerechnet dann der äußere Loop
 */

public class ForLoop2 {
    public static void main(String[] args) {

        // Variante 1
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {  // Loopl im Loop wird zuerst ausgeführt | y wird deklariert und initialisiert ; bedingung wird geprüft ob y noch kleiner 10 ist, wenn ja läuft es weiter ; der anweisung nach wird y plus 1 zu addieren
                System.out.println("x=" + x + " y=" + y);   // Konsole gibt deklaration aus, indem falls x und y
            }
        }

        //Variante 2
    }
}
