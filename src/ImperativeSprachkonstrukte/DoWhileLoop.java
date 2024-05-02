package ImperativeSprachkonstrukte;

/**
 * Lernziel:
 * = UNTERSCHIEDE = Wo die schleife ausgeführt werden soll?
 * <p>
 * - do-while-schleife / Fußgesteuerte schleife, weil die bedingung am fuß steht
 * = hat immer erst ein durchlauf
 * und fragt dann über eine bedingung nach, ob dieser Rumpf nochmal durchlaufen werden darf
 * !!! sind immer dann nützlich, wenn man mindestens einen durchlauf braucht!!!
 * bsp. Benutzereingaben,
 * <p>
 * - while schleife & for schleife / Kopfgesteuerten schleifen, weil bedingung am anfang steht.
 * = fragen zunächst ab, ob eine bedingung gilt
 * und führen erst dann den Code des Rumpfes aus
 *
 */

public class DoWhileLoop {
    public static void main(String[] args) {
//        do {
//            System.out.println("Rumpf");
//        } while (Math.random() > 0.1);

//        // Das ist eine Test Schleife, die nach jeder eingabe erneut startet! | Kommentiere mich aus um mich zu Testen|
//        int input;  // initialisierung ganzzahl eingabe
//        do {
//            System.out.println("Bitte gib eine Zahl ein");
//            input = new java.util.Scanner(System.in).nextInt();
//            System.out.println( input * 2); // eingabe wird mit 2 multipliziert
//        } while (input != 0);   // durchlauf bei einer eingabe ungleich 0

        // do while | Fußgesteuerte Schleife | Variante 2
        int input;  // initialisierung ganzzahl eingabe
        int sum = 0;// initialisiert summe mit dem start wert 0
        do {
            System.out.println("Bitte gib eine Zahl ein");      // Zeigt in der Konsole den String an
            input = new java.util.Scanner(System.in).nextInt(); //Grundgerüst Konsoleneingabe
            sum += input;       // addiert jede eingabe
        } while (input != 0);   // durchlauf bei einer eingabe ungleich 0
        System.out.println( "Ergebnis deiner Eingaben ist: " + sum);    // wenn der Loop mit der eingabe 0 beendet wurde, wird der String und die addierte eingabe als summe in der Konsole ausgegeben
    }
}
