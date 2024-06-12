package Java_Anfänger_zum_Profi.Zeichen_und_Zeichenfolgen;

/*
*   Char = repräsentiert nur einzelne Zeichen
*
    StringBuilder und StringBuffer werden verwendet, um effizient Zeichenfolgen in Java zu manipulieren, insbesondere wenn viele Veränderungen an der Zeichenfolge vorgenommen werden müssen.
*   Im Gegensatz zu String, der in Java unveränderlich ist, ermöglichen StringBuilder und StringBuffer das Hinzufügen, Löschen und Modifizieren von Zeichenfolgen.
* */
public class CharCharakterStringBuilder {
    public static void main(String[] args) {

        // Funktion für einzelne zeichen
        char letter = '0';
        System.out.println(letter);

        // Funktion für mehrere Zeichen | achtung beschränkt!
        String string = " string ";
        System.out.println( string + " + " + string);
        System.out.println( string.length() ); // gibt die länge der zeichenlänge aus

        // Stringbuilder
        // Stringbuffer = Synchronisiert mehrere datentypen
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append( 12 );
        stringBuilder.append( "12");
        String s = stringBuilder.toString();
        System.out.println(stringBuilder);

    }
}
