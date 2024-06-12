package Java_Anfänger_zum_Profi.Zeichen_und_Zeichenfolgen;

public class CharAndCharakterDemo {
    public static void main(String[] args) {
        char c = '+'; // char ist unsigniert 2 byte groß, gibt ein nummerisches zeichen von datentyp aus, 0 bis 64.000
        System.out.println(c + 1);             // 44 => int
        System.out.println(((char) (c + 1)));   // ,

        char a = 65 + 1;           // A ist auf dem platz 64 laut der ASCI Tabelle
        System.out.println(a);    // B

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }

        char d = '\u1a01';
        System.out.println(d);  // ᨁ

        /*  Charakter Methode
            1. Static utility methods
            2. Wrapper
        * */

        // prüft nach leerzeichen
        System.out.println( Character.isWhitespace( ' '));  // true
        System.out.println( Character.isWhitespace( '\t')); // true
        System.out.println( Character.isWhitespace( 't'));  // false

        // prüft nach buchstaben
        System.out.println( Character.isLetter( 't'));      // true
        System.out.println( Character.isLetter( '0'));      // false
        System.out.println( Character.isLetter( ' '));      // false


    }
}
