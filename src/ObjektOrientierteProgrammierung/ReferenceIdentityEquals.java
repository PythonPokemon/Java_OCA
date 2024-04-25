package ObjektOrientierteProgrammierung;

/**
 * Lernziel:
 * -Identität
 * -Gleichheit
 */
public class ReferenceIdentityEquals {
    public static void main(String[] args) {

        java.awt.Point p = new java.awt.Point();
        java.awt.Point q = new java.awt.Point();
        java.awt.Point r = p;

        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

        System.out.println(p == q);    // false
        System.out.println(p == r);     // true | nur, weil oben r = p entspricht, | man sagt, wenn beide den gleichen Zustand haben, sind beide gleichwertig
        System.out.println(q == r);     // false

        // Gleichwertigkeit | .equals sind fragen!
        System.out.println(p.equals(q));  // hier wird gefragt, ob laut dieser deklaration / initialisierung p gleichwertig q ist, wenn ja, wird das ergebnis im boolean wert aus der konsole ausgegeben
        System.out.println(q.equals(p));

        System.out.println(p.equals("abcdefg"));    // false da beide nicht gleichwertig vom datentyp sind
        System.out.println("abcdefg".equals(p));    // false

        // ACHTUNG | es ist nicht möglich, auf einer Referenz variable, die null ist, eine Methode aufzurufen!
        // = Das wird grundsätzlich immer zur NullPointerException führen.
        System.out.println(p.equals(null));   // Die Frage würde einfach nur zu False führen!
//        p = null;                               //  aber führt das zum Error!
//        System.out.println(p.equals( null ));   // Error. .NullPointerException

        /* 4-Methoden zum Testen von Wahrheitswerten
         *   Zusammenfassung
         *   gleich == | != ungleich
         *   .equals(obj) | !equals(obj) negiert
         *
         * */

        String input1 = new java.util.Scanner(System.in).nextLine();
        String input2 = new java.util.Scanner(System.in).nextLine();
//        System.out.println(input1==input2); // FALSCH

        // Mit dieser Methode wird gefragt ob, die Konsolen eingabe 1 und eingabe zwei den selbern zustand (referenz, oder referenzwert) haben,
        // wenn der identisch ist = true or false
        System.out.println(input1.equals(input2));
        System.out.println(input2.equals(input1));
    }
}
