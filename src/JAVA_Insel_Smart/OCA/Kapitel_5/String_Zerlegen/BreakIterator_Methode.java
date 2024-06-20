package JAVA_Insel_Smart.OCA.Kapitel_5.String_Zerlegen;
import java.text.BreakIterator;
import java.util.Locale;

public class BreakIterator_Methode {
    public static void main(String[] args) {
        String text = "Das ist ein Beispiel. Dies ist ein weiterer Satz.";

        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.GERMANY);
        iterator.setText(text);

        int start = iterator.first();

        for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator.next()) {
            System.out.println(text.substring(start, end));
        }
        // Ausgabe:
        // Das ist ein Beispiel.
        // Dies ist ein weiterer Satz.
    }
}
