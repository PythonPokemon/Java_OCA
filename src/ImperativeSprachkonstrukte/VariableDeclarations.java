package ImperativeSprachkonstrukte;

/**
 * Mit Variablen Daten speichern, die vom Programm gelesen und geschrieben werden können.
 * - Variablendeklarationen
 * - Mehrere Variablen kompakt deklarieren
 * - Keine automatische Initialisierung von lokalen Variablen
 * - Variablendeklaration mit Wert initialisierung
 * - Finale Variablen
 * - char und String
 */
public class VariableDeclarations {
    //---------------Primitive Datentypen----------------------
    public static void main(String[] args) {
        int age = 99; // Ganzzahl int --> 4 Byte
        long age2 = +100000000000L; // Ganzzahl long --> 8 Byte
        System.out.println(age);
        System.out.println(age2);

        short s = 12; // short --> 2 Byte
        byte b = 127; // byte --> 1 Byte | -128 ...bis... +127
        System.out.println(s);
        System.out.println(b);

        double d = 12.333; // double --> 8 Byte
        float f = 2323; // float --> 4 Byte
        System.out.println(d);
        System.out.println(f);

        char sb = 'J'; // char --> 2 Byte
        String name = "PythonPokemon"; // Zeichenfolge
        System.out.println(sb);
        System.out.println(name);

        Boolean snowing = true; // boolean --> 1 Bit
        System.out.println(snowing);

        // zahlen dem bezeichner zuweisen/initialisieren
        int x, y;
        x = 10;
        y = 20;
        // System.out.println(); = ist die ausgabe in der Konsole
        System.out.println(x); // 10
        System.out.println(y); // 20
        System.out.println(x + y); // 10 + 20 = 30
        System.out.println(x - y); // 10 - 20  = -10
        System.out.println(x * y); // 10 * 20 = 200
        System.out.println(y / x); // 20 / 10 = 2

        // Konstante feste nichte veränderbare Zahlen
        final double PI = 3.1415;
        // unterstreicht PI als Konstante und sagt damit das der wert nicht neu zugewiesen werden kann

    }
}
