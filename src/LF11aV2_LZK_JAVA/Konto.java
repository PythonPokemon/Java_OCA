/**
 * Erstelle eine Klasse mit dem Namen Konto.
 * Die Klasse soll über folgende Attribute verfügen,
 * die als private deklariert werden sotten:
 * - Kontonummer als String
 * - Kontostand als double
 * Erstelle einen Konstruktor, der zwei Parameter verwendet.
 * Als erster Parameter sott die Kontonummer,
 * als zweiter Parameter der Kontostand übergeben werden.
 * Der Konstruktor soll dann die übergebenen Werte in die Attribute übertragen.
 * Erstelle dann für die Klasse Konto die folgenden Methoden:
 * getKontostand liefert den aktuellen Kontostand zurück.
 * getKontonummer liefert die Kontonummer zurück.
 * - einzahlen erhöht den Kontostand um einen bestimmten Betrag.
 * auszahlen hebt einen Betrag vom Konto ab.
 * Teste die Klasse.
 */

package LF11aV2_LZK_JAVA;

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

