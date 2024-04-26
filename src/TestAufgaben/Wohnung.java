/**
 * löse diese aufgabe:
 * public class _ 380 _ Ferienwohnungen.
 * Stelle dir vor, du schreibst ein Programm für einen Anbieter von Ferienwohnungen.
 * Die Grundlage bildet die Klasse "Wohnung".
 * Diese soll den Namen der Wohnung, den Standort, die Anzahl der Betten,
 * und den Preis pro Übernachtung enthalten.
 * Schreibe danach passende Methoden, um die Werte abzurufen
 * und falls notwendig zu verändern.
 * Teste danach die Klasse,
 * in dem du einige Objekte erzeugst und anschließend ihre Werte ausgibst.
 */

package TestAufgaben;

public class Wohnung {
    private String name;
    private String standort;
    private int betten;
    private double preisProUebernachtung;

    // Konstruktor
    public Wohnung(String name, String standort, int betten, double preisProUebernachtung) {
        this.name = name;
        this.standort = standort;
        this.betten = betten;
        this.preisProUebernachtung = preisProUebernachtung;
    }

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public int getBetten() {
        return betten;
    }

    public void setBetten(int betten) {
        this.betten = betten;
    }

    public double getPreisProUebernachtung() {
        return preisProUebernachtung;
    }

    public void setPreisProUebernachtung(double preisProUebernachtung) {
        this.preisProUebernachtung = preisProUebernachtung;
    }

    // Test-Methode
    public static void main(String[] args) {
        // Erstellen einiger Wohnung-Objekte
        Wohnung wohnung1 = new Wohnung("Gemütliches Apartment", "Berlin", 2, 50.0);
        Wohnung wohnung2 = new Wohnung("Strandvilla", "Malibu", 4, 200.0);
        Wohnung wohnung3 = new Wohnung("Alpenhütte", "Tirol", 6, 100.0);

        // Ausgabe der Werte der Wohnung-Objekte
        System.out.println("Wohnung 1:");
        System.out.println("Name: " + wohnung1.getName());
        System.out.println("Standort: " + wohnung1.getStandort());
        System.out.println("Betten: " + wohnung1.getBetten());
        System.out.println("Preis pro Übernachtung: " + wohnung1.getPreisProUebernachtung() + " Euro");

        System.out.println();

        System.out.println("Wohnung 2:");
        System.out.println("Name: " + wohnung2.getName());
        System.out.println("Standort: " + wohnung2.getStandort());
        System.out.println("Betten: " + wohnung2.getBetten());
        System.out.println("Preis pro Übernachtung: " + wohnung2.getPreisProUebernachtung() + " Euro");

        System.out.println();

        System.out.println("Wohnung 3:");
        System.out.println("Name: " + wohnung3.getName());
        System.out.println("Standort: " + wohnung3.getStandort());
        System.out.println("Betten: " + wohnung3.getBetten());
        System.out.println("Preis pro Übernachtung: " + wohnung3.getPreisProUebernachtung() + " Euro");
    }
}
