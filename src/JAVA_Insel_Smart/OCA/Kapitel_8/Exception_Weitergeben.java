package JAVA_Insel_Smart.OCA.Kapitel_8;
//Exception_Weitergeben
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
