/**
 * Ein *Ausdruck* ( *expression*) ergibt bei der Auswertung ein Ergebnis.
 * Lernziel:
 * - Zuweisungsoperator in Anweisung und Ausdruck
 * - Math. random()
 * - Unäres Minus und Plus
 * - Arithmetik, Divisionsoperator,
 * - Bitmanipulation
 * - Vergleiche
 * - Logische Operatoren
 * - Kurzschluss
 * - Verbundoperator
 * - Präfix-/Postfix-Inkrement und
 * - Typumwandlung
 * - String-Konkatenation
 * - Restwert-Operator
 * - Dekrement
 */

public class ExpressionsOperators {
    public static void main(String[] args) {
        int age;  // zuweisung
        System.out.println(age = 90); // initialisierung
        System.out.println(age);

        System.out.println(Math.random()); // 0.0 < random < 1.0
        System.out.println(-Math.random()); // -0.0 < random < -1.0
        System.out.println(-(-Math.random())); // 0.0 < random < 1.0

        System.out.println(Math.random() * 10); // 0.0 < random < 10.0

        int number = 10_000_000;
        System.out.println(10_000_000L * number); // 10_000_000L = Long statt int da die Bytes zu wenig speicher haben für so eine große zahl, würde falsches Ergebnis liefern während laufzeitentwicklung
        System.out.println(10.0/3); // division = 3,3333
        System.out.println(10%3); // Modulo = 1 | 10 geteilt durch 3 Rest 1

        int b1 = 0b10101010;
        int b2 = 0b11010100;
        System.out.println(Integer.toBinaryString(b1) );
        System.out.println(Integer.toBinaryString(b2) );

        System.out.println(Integer.toBinaryString(~b1) );
        System.out.println(Integer.toBinaryString(~b2) );

        System.out.println(Integer.toBinaryString( b1 & b2) );
        System.out.println(Integer.toBinaryString( b1 | b2) );
        System.out.println(Integer.toBinaryString( b1 ^ b2) );

        System.out.println(1 < 2);  // 1 ist kleiner 2   = True
        System.out.println(1 > 0);  // 1 ist größer 0    = True
        System.out.println(1.0 == 1.0); // 1 gleich 1   = True
        System.out.println(3.3 <= 1.1 + 1.1 + 1.1); // kleiner gleich < = True | wenn das größer gleich, wäre False
        System.out.println(1.0 != 2.0); // 1 ungleich 2 = True | kann auch ! = ausgeschrieben werden

        boolean isOneLtTwo = 1 < 2;         // bollean wird bezeichner zugewiesen, initialisiert
        System.out.println(isOneLtTwo);     // konsole gibt wahrheitswert aus = True | da 1 kleiner 2 ist

        // AND Operator | mindestens da beide müssen true sein
        System.out.println("UND Operator"); // für die Lesbarkeit in der Konsolenausgabe
        System.out.println(true && true);   // = true | da beide true sein müssen
        System.out.println(true && false);  // = false

        // OR Operator | mindestens 1 true muss vorhanden sein
        System.out.println("ODER Operator");
        System.out.println(true || true);   // true | da mindestens 1 true vorhanden ist
        System.out.println(true || false);  // true | da mindestens 1 true vorhanden ist

        // XOR Operator | nur einer darf true sein
        System.out.println("Xoder Operator");
        System.out.println(true ^ true);    // = false  | da 1 zu viel
        System.out.println(true ^ false);   // = true   | richtig weil nur 1 true vorhanden sein darf
        System.out.println(false ^ true);   // = true   | richtig weil nur 1 true vorhanden sein darf
        System.out.println(false ^ false);  // = false  | da gar kein true vorhanden ist

        // NOT Operator | Negation bedeutet wahr = falsch | falsch ist wahr
        System.out.println("NOT Operator | Negation");
        System.out.println(!true);  // = false
        System.out.println(!false); // = true

        System.out.println("Negierte bsp. Rechnung");
        boolean a = 10 * 10 < 99;   // 10 * 10 = 100 kleiner 99 | also false wenn es aber negiert wird dann true!
        System.out.println(!a);
    }
}
