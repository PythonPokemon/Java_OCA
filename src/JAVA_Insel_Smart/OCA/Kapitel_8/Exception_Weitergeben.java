/*
also wenn ich das richtig verstanden habe, dann wird die divisionsDurchführungsmethode, die die Ausnahme weiter wirft,
in einem try block aus der main Methode aufgerufen, ausgeführt und die Ausnahme abgefangen und auch weiter geworfen,
die main methode fängt ebenfalls die geworfene Ausnahme und gibt, die Ausgabe des Stacktraces zur Fehlerverfolgung an,
wenn jedoch die divisionsDurchführungsmethode keine Ausnahme weiter werfen würde, dann wäre es zu Ende
nach dem ersten print dieser methode, richtig
* */

package JAVA_Insel_Smart.OCA.Kapitel_8;

public class Exception_Weitergeben {
    public static void main(String[] args) {
        try {
            // Aufruf der Methode, die eine Ausnahme weiterwerfen kann
            divisionDurchfuehren();
        } catch (ArithmeticException e) {
            // Ausnahme wird hier abgefangen, nachdem sie von divisionDurchfuehren erneut geworfen wurde
            System.out.println("Fehler in main: Division durch null ist nicht erlaubt.");
            System.out.println("Anzeige der Fehlerverfolgung--->");
            e.printStackTrace(); // Ausgabe des Stack-Traces zur Fehlerverfolgung
        }
    }

    public static void divisionDurchfuehren() throws ArithmeticException {
        int a = 10;
        int b = 0;

        try {
            // Dies wird eine ArithmeticException auslösen (Division durch null)
            int ergebnis = a / b;
            System.out.println("Ergebnis: " + ergebnis);
        } catch (ArithmeticException e) {
            // Ausnahme abfangen und eine Meldung ausgeben
            System.out.println("Fehler in divisionDurchfuehren: Division durch null ist nicht erlaubt.");
            // Ausnahme erneut werfen, um sie an die aufrufende Methode weiterzugeben
            throw e;
        }
    }
}
