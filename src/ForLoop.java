/**
 * ForLoop = for schleife
 * <p>
 * for (Deklaration Initialisierung ; Frage ob bedingung erfüllt ist; Fortschaltausdruck)anweisung
 */

public class ForLoop {
    public static void main(String[] args) {

//        // Variante 1 | zum Teste auskommentieren |
//// for (Deklaration Initialisierung ; Frage ob bedingung erfüllt ist; Fortschaltausdruck) anweisung
//        for (int counter = 1; counter < 11; counter++) {    // ganzzahl int deklaration counter = 1 | ist = kleiner 11 | counter addiert + 1 bis 10, also solange bis counter kleiner 11 ist!
//            System.out.println(counter);                    // gibt in der Konsole die deklaration aus, also counter
//        }

//        // Variante 2 | zum Teste auskommentieren |
//        for (int x = 0, y=0 ; x < 10 ; x++, y--) {  // ganzzahl deklaration/initialisierung x gleich 0 und y gleich 0 ; hier wird gefragt ob die bedingung erfullt ist x kleiner 10 ; hier wird x plus 1 & y plus 1 addiert
//            System.out.println( x + " wird plus 1 addiert" + " " + y + " Y wid minus 1 dividiert ");
//        }

        // Variante 3 for schleife untereinander schreiben
        for (int x = 0, y=0 ;                   // Start
             x < 10 ; x++, y--) {               // Bedingung
            System.out.println( x + " " + y);   // Inkrement
        }
    }
}
