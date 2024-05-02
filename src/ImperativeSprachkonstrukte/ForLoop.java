package ImperativeSprachkonstrukte;

/**
 * ForLoop = for schleife
 * <p>
 * for (Deklaration Initialisierung ; Frage ob bedingung erfüllt ist; Fortschaltausdruck)anweisung
 */

public class ForLoop {
    public static void main(String[] args) {

//        // Variante 1 | zum Teste auskommentieren |
//// for (Deklaration Initialisierung ; Frage ob bedingung erfüllt ist; Fortschaltausdruck) anweisung
//        for (int counter = 1; counter < 11; counter++) {    // ganzzahl int deklaration counter = 1 | ist = kleiner 11 | counter addiert + 1 bis 10, also so lange bis counter kleiner 11 ist!
//            System.out.println(counter);                    // gibt in der Konsole die deklaration aus, also counter.
//        }

//        // Variante 2 | zum Teste auskommentieren |
//        for (int x = 0, y = 0 ; x < 10 ; x++, y--) {  // ganzzahl deklaration/initialisierung x gleich 0 und y gleich 0 ; hier wird gefragt, ob die bedingung erfüllt ist x kleiner 10 ; hier wird x plus 1 addiert und y minus 1 dividiert
//            System.out.println( x + " wird plus 1 addiert" + " " + y + " Y wid minus 1 dividiert ");    // also bis x = 9 und y -9 | den y läuft einfach so lange mit bis die bedingung von x erfüllt ist
//        }

        // Variante 3 for schleife untereinander schreiben
        for (int x = 0, y = 0 ;                   // Start
             x < 10 ; x++, y--) {               // Bedingung
            System.out.println( x + " " + y);   // Inkrement
        }
    }
}
