package ObjektOrientierteProgrammierung;
/*
 * Lernziel:
 * - public, private
 * - Paketsichtbarkeit
 * Zusammenfassung nur weil Klassen öffentlich sind, bedeutet das nicht dass die Methoden auch öffentlich zugänglich sind.
 * Methoden müssen auch über einen zugrifsmodifizierer entsprechend (public, protected, private) gesetzt werden.
 * wenn man auf sie zugreifen möchte.
 * Bsp. Adresse, Haus und zimmer.manche sind öffentlich zugänglich, manche sind privat
 * Best Practice = die sichtbarkeit sollte so eingeschränkt sein wie möglich = hacking sonst können datentypen parameter verändert werden!
 *
 * Was nicht geht!
 * man kann die sichtbarkeit nicht einschränken auf = nur sichtbar für klassen a, b, c!
 * */

import de.Verweise.quote.Quote;
import de.Verweise.quote.QuotePrinter;
import de.Verweise.util.Line;

public class PrivatePublicPackageVisible {
    public static void main(String[] args) {
// Kommentiere mich aus um zu teste
//        Line.longLine();
//        Line.line();
//        Quote.quote();
        QuotePrinter.printQuote();

    }
}

