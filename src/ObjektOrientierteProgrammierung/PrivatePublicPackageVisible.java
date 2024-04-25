package ObjektOrientierteProgrammierung;
/*
 * Lernziel:
 * - public, private
 * - Paketsichtbarkeit
 * Zusammenfassung nur weil Klassen öffentlich sind, bedeutet das nicht dass die Methoden auch öffentlich zugänglich sind.
 * Methoden müssen auch über einen zugrifsmodifizierer entsprechend (public, protected, private) gesetzt werden.
 * wenn man auf sie zugreifen möchte.
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

