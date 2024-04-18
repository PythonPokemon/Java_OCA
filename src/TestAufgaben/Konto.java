package TestAufgaben;

public class Konto {
    private String kontonummer;
    private double kontostand;

    // Konstruktor
    public Konto(String kontonummer, double kontostand) {
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }

    // Methode zur Abfrage des aktuellen Kontostands
    public double getKontostand() {
        return kontostand;
    }

    // Methode zur Abfrage der Kontonummer
    public String getKontonummer() {
        return kontonummer;
    }

    // Methode zum Einzahlen eines bestimmten Betrags
    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand += betrag;
            System.out.println("Einzahlung von " + betrag + " erfolgreich.");
        } else {
            System.out.println("Ungültiger Betrag für Einzahlung.");
        }
    }

    // Methode zum Auszahlen eines bestimmten Betrags
    public void auszahlen(double betrag) {
        if (betrag > 0 && betrag <= kontostand) {
            kontostand -= betrag;
            System.out.println("Auszahlung von " + betrag + " erfolgreich.");
        } else {
            System.out.println("Ungültiger Betrag für Auszahlung oder nicht genügend Guthaben vorhanden.");
        }
    }

    // Test-Methode
    public static void main(String[] args) {
        // Erstellen eines Kontos
        Konto meinKonto = new Konto("123456789", 1000.0);

        // Ausgabe der Kontonummer und des aktuellen Kontostands
        System.out.println("Kontonummer: " + meinKonto.getKontonummer());
        System.out.println("Aktueller Kontostand: " + meinKonto.getKontostand());

        // Einzahlung
        meinKonto.einzahlen(500.0);
        System.out.println("Neuer Kontostand nach Einzahlung: " + meinKonto.getKontostand());

        // Auszahlung
        meinKonto.auszahlen(200.0);
        System.out.println("Neuer Kontostand nach Auszahlung: " + meinKonto.getKontostand());
    }
}

