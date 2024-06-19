/*
CharSequence als Basistyp
CharSequence ist eine Schnittstelle, die von den Klassen String, StringBuilder und StringBuffer implementiert wird.
Sie definiert Methoden für den Umgang mit Zeichenfolgen.
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
CharSequence ist eine Schnittstelle, die Methoden für den Umgang mit Zeichenfolgen definiert.
Implementierungen von CharSequence: String, StringBuilder, StringBuffer und andere Klassen implementieren CharSequence.

Vorteil: Mit CharSequence können Sie allgemeine Methoden für Zeichenfolgen definieren,
die mit verschiedenen konkreten Klassen arbeiten, ohne sich auf eine spezifische Implementierung festzulegen.
------------------------------------------------------------------------------------------------------------------------
 Das Bedeutet, dass jede Methode auf diese Schnittstelle 'Charsequence' zugreifen kann!
* */
package JAVA_Insel_Smart.OCA.Kapitel_5;

public class CharSequenz_mit_String_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        // Verwendung von CharSequence mit String
        CharSequence seq1 = "Hello";
        char ch1 = seq1.charAt(1); // 'e'
        System.out.println("seq1.charAt(1): " + ch1); // Ausgabe: 'e'
        System.out.println("seq1.length(): " + seq1.length()); // Ausgabe: 5
        System.out.println("seq1.subSequence(1, 4): " + seq1.subSequence(1, 4)); // Ausgabe: 'ell'

        // Verwendung von CharSequence mit StringBuilder
        CharSequence seq2 = new StringBuilder("Hello");
        char ch2 = seq2.charAt(1); // 'e'
        System.out.println("seq2.charAt(1): " + ch2); // Ausgabe: 'e'
        System.out.println("seq2.length(): " + seq2.length()); // Ausgabe: 5
        System.out.println("seq2.subSequence(1, 4): " + seq2.subSequence(1, 4)); // Ausgabe: 'ell'

        // Verwendung von CharSequence mit StringBuffer
        CharSequence seq3 = new StringBuffer("Hello");
        char ch3 = seq3.charAt(1); // 'e'
        System.out.println("seq3.charAt(1): " + ch3); // Ausgabe: 'e'
        System.out.println("seq3.length(): " + seq3.length()); // Ausgabe: 5
        System.out.println("seq3.subSequence(1, 4): " + seq3.subSequence(1, 4)); // Ausgabe: 'ell'
        System.out.println("Ab hier Beispiel zwei------------------------------------->");
//----------------------------------------------------------------------------------------------------------------------
        // Bsp: 2
        // CharSequence gibt also bei allen methoden das Gleiche aus!
        // Verwendung von CharSequence mit String
        CharSequence seq1a = "Hello";
        printCharSequenceDetails(seq1a);

        // Verwendung von CharSequence mit StringBuilder
        CharSequence seq2b = new StringBuilder("Hello");
        printCharSequenceDetails(seq2b);

        // Verwendung von CharSequence mit StringBuffer
        CharSequence seq3c = new StringBuffer("Hello");
        printCharSequenceDetails(seq3c);
    }

    // Methode zum Drucken der Details einer CharSequence | ist sozusagen die Blaupause für die Methoden
    public static void printCharSequenceDetails(CharSequence seq) {
        System.out.println("Inhalt: " + seq.toString());
        System.out.println("Länge: " + seq.length());
        System.out.println("Zeichen an Position 1: " + seq.charAt(1));
        System.out.println("Teilsequenz (1, 4): " + seq.subSequence(1, 4));
        System.out.println();
    }

}
