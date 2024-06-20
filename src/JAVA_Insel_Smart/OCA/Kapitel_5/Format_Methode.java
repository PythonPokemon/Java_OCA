/*

------------------------------------------------------------------------------------------------------------------------
Tabelle der wichtigsten Formatspezifizierer:

Spezifizierer	Steht für
%n	Neue Zeile
%%	Prozentzeichen
%s	String
%b	Boolean
%c	Unicode-Zeichen
%d	Dezimalzahl
%x	Hexadezimalschreibweise
%t	Datum und Zeit
%f	Fließkommazahl
%e	Wissenschaftliche Notation
* */

package JAVA_Insel_Smart.OCA.Kapitel_5;

public class Format_Methode {
    public static void main(String[] args) {
        String s = String.format("Hallo %s. hab isch ein %s. wann kann isch maken %s?", "GFN", "fragi", "HomeOffice");
        System.out.println(s);  // Hallo GFN. hab isch ein fragi. wann kann isch maken HomeOffice?

    }
}
