/*
5.1.4 Unicode-Zeichenkodierung
Unicode-Zeichen können in verschiedenen Formaten kodiert werden:

UTF-32: Verwendet 4 Byte pro Zeichen, was für Speicherplatz ineffizient ist.
UTF-16: Verwendet 2 oder 4 Byte pro Zeichen und ist eine gängige interne Kodierung in vielen Betriebssystemen.
UTF-8: Verwendet 1 bis 4 Byte pro Zeichen und ist aufgrund seiner Effizienz weit verbreitet, insbesondere im Internet.
------------------------------------------------------------------------------------------------------------------------
Erklärung
Escape-Sequenzen in char-Variablen:

char backspace = '\b';: Repräsentiert ein Rückschritt-Zeichen.
char newline = '\n';: Repräsentiert ein Zeilenschaltungszeichen.
char formfeed = '\f';: Repräsentiert ein Seitenumbruch-Zeichen.
char carriageReturn = '\r';: Repräsentiert ein Wagenrücklauf-Zeichen.
char tab = '\t';: Repräsentiert ein horizontaler Tabulator-Zeichen.
char doubleQuote = '\"';: Repräsentiert ein doppeltes Anführungszeichen.
char singleQuote = '\'';: Repräsentiert ein einfaches Anführungszeichen.
char backslash = '\\';: Repräsentiert ein Backslash-Zeichen.

Escape-Sequenzen in Strings:
String example = "Backspace: X\bX" + newline + ...;: Verwendet Escape-Sequenzen innerhalb eines Strings,
um spezielle Zeichen darzustellen und zu kombinieren.

Ausgabe der char-Variablen:
System.out.println("Backspace: [" + backspace + "]");: Zeigt den Effekt der Escape-Sequenz innerhalb eines Strings.

Ausgabe der String-Beispiele:
System.out.println(example);: Gibt den String mit den verschiedenen Escape-Sequenzen aus, um zu zeigen,
wie sie im Text erscheinen.
* */
package JAVA_Insel_Smart.OCA.Kapitel_5;

public class Unicode_EscapeSequenzen_FluchtSymbole {
    public static void main(String[] args) {
        // Verwendung von Escape-Sequenzen in char-Variablen
        char backspace = '\b';
        char newline = '\n';
        char formfeed = '\f';
        char carriageReturn = '\r';
        char tab = '\t';
        char doubleQuote = '\"';
        char singleQuote = '\'';
        char backslash = '\\';
        char euroSymbol = '\u20AC'; // Euro-Zeichen


        // Verwendung von Escape-Sequenzen in Strings
        String example = "Backspace: X\bX" + newline +
                "Newline\n" +
                "Formfeed\f" +
                "Carriage Return\r" +
                "Tab\tTab" + newline +
                "Double Quote: \"" + newline +
                "Single Quote: \'" + newline +
                "Backslash: \\";

        // Ausgabe der char-Variablen
        System.out.println("Escape-Sequenzen in char-Variablen:");
        System.out.println("Backspace: [" + backspace + "]");
        System.out.println("Newline: [" + newline + "]");
        System.out.println("Formfeed: [" + formfeed + "]");
        System.out.println("Carriage Return: [" + carriageReturn + "]");
        System.out.println("Tab: [" + tab + "]");
        System.out.println("Double Quote: [" + doubleQuote + "]");
        System.out.println("Single Quote: [" + singleQuote + "]");
        System.out.println("Backslash: [" + backslash + "]");
        System.out.println(euroSymbol);

        // Ausgabe der String-Beispiele
        System.out.println("\nEscape-Sequenzen in Strings:");
        System.out.println(example);
    }
}
