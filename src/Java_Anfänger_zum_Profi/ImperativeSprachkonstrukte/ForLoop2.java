package Java_Anfänger_zum_Profi.ImperativeSprachkonstrukte;

/**
 * Lool im Loop
 * zuerst wird immer der innere Loop ausgerechnet dann der äußere Loop
 */

public class ForLoop2 {
    public static void main(String[] args) {

        // Variante 1 |
        // der innere loop y addiert o bis 9 solange y kleiner 10 ist.
        // anschließend wird dieser vollendete durchlauf von inneren loop y dem äußeren loop x angerechnet.
        // so lange x kleiner 10 ist.
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {  // Loop im Loop wird zuerst ausgeführt | y wird deklariert und initialisiert ; bedingung wird geprüft ob y noch kleiner 10 ist, wenn ja läuft es weiter ; der anweisung nach wird y plus 1 zu addieren
                System.out.println("x=" + x + " y=" + y);   // Konsole gibt deklaration aus, indem falls x und y
            }
        }

//        //Variante 2
//        for ( int x = 1; x <= 10; x++) {
//            for ( int y = 1; y <= 10; y++) {
//                System.out.printf("%3d ", x + y); // gibt konsole in Spalten aus
//            }
//            System.out.println();   // gibt konsole in zeilen aus
//        }
    }
}
