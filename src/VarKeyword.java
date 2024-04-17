/**
 * Lernziel: Einsatzorte vom Schlüsselwort 'var'
 * - loal variable type inteference
 * Bsp. ansatt den Datentyp an sich zu benutzen kann man einfach Var hinschreiben,
 *      der Compiler weiß trotzdem welcher datentyp da ist.
 *      bei var list von rechts nach links, deswegen erkennt der cp den datentypen
 *
 */

public class VarKeyword {

        // var name = "chris"; Compiler Fehler
    public static void main(String[] args) {
        var a = 12;
        var b = "Hallo";
        var c = 1234.5678;
        var d = 13;
        var e = 'e';
        System.out.println(a + b + c + d + e);


    }
}
