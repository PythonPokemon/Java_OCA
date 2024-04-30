package Arrays;

/*
 *   Lernziel:
 *   - Array-Objekte aufbauen
 *   - Referenzen
 *   - Initialisierung bei primitiven Elementen und Referenzen
 *   - length Attribut
 *   - Elementzugriff, lesen und schreiben
 *   - IndexOutBoundsException
 *   - Arrays an Methoden übergeben
 * */
public class FirstArray {
    public static void main(String[] args) {

        // Code variante 1
//        int[] primes;           // schritt 1 | referenz variable deklariert das primes für int steht
//        primes = new int[5];    // schritt 2 | referenz variable initialisiert, primes ist 5

        // Code variante 2
        int[] primes = new int[5];
        System.out.println(primes.length);  // .length ist ein public attribut, es ist final, man kann es nicht modifizieren
        // primes.length = 10; geht nicht!
//        primes = new int[10];             // geht! | da der Garbage collector die neu erzeugte variable über die alte überschreibt!
        System.out.println(primes[0]);      // arrays starten bei 0
        System.out.println(primes[primes.length - 1]);

        primes[0] = 2;
        primes[1] = 3;
        primes[2] = 5;
        primes[3] = 7;
        primes[4] = primes[3] + 3;  // bedeutet 7 + 3 = 10
        primes[4]++;                // bedeutet 7 + 3 = 10 | addition plus 1 = 11

        System.out.println(primes[primes.length / 2]);  // gibt das prime, aus der mitte des index aus
        System.out.println(primes[primes.length - 1]);  // gibt den wert des letzten array aus der konsole wieder!

        /*
        *             +---+---+---+---+----+
        primes +------> 2 | 3 | 5 | 7 | 11 |
        *             +---+---+---+---+----+
        *               0   1   2   3   4   Index
        * */
    }
}
