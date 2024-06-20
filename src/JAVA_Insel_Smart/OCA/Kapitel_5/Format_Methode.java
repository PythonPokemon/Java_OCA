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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Format_Methode {
    public static void main(String[] args) {
        String s = String.format("Hallo %s. hab isch ein %s. wann kann isch maken %s?", "GFN", "fragi", "HomeOffice");
        System.out.println(s);  // Hallo GFN. hab isch ein fragi. wann kann isch maken HomeOffice?

        // Formatierungsbeispiele
        String name = "TaubenZüchter";
        int age = 31;
        System.out.printf("Name: %s, Alter: %d%n", name, age);  // Name: TaubenZüchter, Alter: 31

        double price = 49.95;
        System.out.printf("Bezahl den Preis unterm Radar, Trankilo: %.2f EUR%n", price);  // Preis: 49.95 EUR

        Date now = new Date();
        System.out.printf("Aktuelles Datum: %tF%n", now);  // Aktuelles Datum: 2024-06-16 (abhängig vom aktuellen Datum)

    }
}
