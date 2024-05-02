package ImperativeSprachkonstrukte;

/**
 * Lernziel:
 * - while schleife = Kopfgesteuerte schleife, prüft zunächst ob bedingung gilt, wenn ja wird diese durchlaufen und das bei jedem durchlauf
 * - Endlosschleife = wenn die bedingung true ist | lassen sich mit break beenden | oder mit continue fortsetzen
 * - break und continue
 * Bsp. gut geeignet zum Zählen
 * <p>
 * Syntax:
 * while ( Bedingung ) Anweisung
 */

public class WhileLoop {
    public static void main(String[] args) {
//        while (Math.random() > 0.1)
//            System.out.println("Rumpf");

//        // Variante 1 | Zum Testen auskommentieren |
//        int number = 1234567;               // ganzzahl number anfangswert zuweisung = 1234567 deklaration
//        int digit = 0;                      // ganzzahl aufzählung anfangswert zuweisung = 0 deklaration
//        while (number > 0) {                 // solnage number größer 0 ist
//            digit++;                        // führt eine adition +1 für jede weitere aufzählung
//            number /= 10;                   // wird number durch 10 geteilt
//            System.out.println("Anzahl Aufzählung: " + digit + " und noch teilbarer Restwert " + number);     // gibt in der konsole number aus


//        // Variante 2 | Zum Testen auskommentieren |
//        int counter = 0;
//        final int LIMIT = 100;
//        while (Math.random() > 0.01) {
//            if (counter >= LIMIT)
//                break;
//            System.out.println("Rumpf " + counter);
//            counter++;
//        }

//        // Variante 3 | zum Test auskommentieren |
//        int number = 2345434;
//        while (true) {
//            if (number % 1111 == 0)
//                break;
//            number--;
//
//            if (number % 2 == 0)
//                continue;
//            System.out.println(number);
//        }

//        // Variante 4 | zum Testen auskommentieren |
//        int number = 345352224; // liest die zahl von rechts nach links, deswegen wird 4 2 2 2 = 4x in der konsole ausgegebn und 5 wäre default also break end
//        end:    // Sprungmarke
//        while (true) {
//            int lastDigit = number % 10;
//            number /= 10;   // number geteilt durch 10
//            switch (lastDigit) {
//                case 0:
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                    System.out.println("Letzte Ziffer ist kleiner 5");
//                    break;
//                default:
//                    break end; // beendet tatsächlich mit der Sprungmarke die Endlosschleife!
//            }
//        }

        // Variante 5 | zum Testen auskommentieren | Alternative zur Sprungmarke ist Flag, weil es besser zu lesen ist
        int number = 345352224; // liest die zahl von rechts nach links, deswegen wird 4 2 2 2 = 4x in der konsole ausgegeben und 5 wäre
        boolean end = false;    // Flag
        while ( ! end ) {
            int lastDigit = number % 10;
            number /= 10;   // number geteilt durch 10
            switch (lastDigit) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Letzte Ziffer ist kleiner 5");
                    break;
                default:
                    end = true; // sogenannter Flag
            }
        }

//        // Variante 6 | Zählerschleife
//        int counter = 1;                    // Deklaration counter =1
//        while ( counter < 11 ) {            // schleifen anweisung counter kleiner 11
//            System.out.println(counter);    // konsole gibt counter aus
//            counter++;                      // counter wird 1 dazu addiert bei jedem durchlauf, solange es kleiner 11 ist also = 10 endergebnis Konsolenausgabe
//        }

    }
}

