package ImperativeSprachkonstrukte;

/**
 * Lernziel:
 * - Bedeutung von Methoden verstehen
 * - Statische Methoden deklarieren
 * - Methoden aufrufen
 * - Deklarierte Methode und Aufruf in verschiedenen Klassen haben
 * <p>
 * Bps. wird benutz, um code Duplikationen zu vermeiden, mittels copy paste von code schnipseln!
 * = Besser eine Methode erstellen und deklarieren um daraus später werte zu extrahieren
 *
 * return beendet eine Methode
 */

public class Methods1 {

    // Sichtbarkeit der Methode Öffentlich
    public static void main(String[] args) {
        Lines();
        System.out.println();
        Lines();
    }

    // Sichtbarkeit der Methode privat
    private static void Lines() {
        for (int i = 0; i < 10; i++) {
            printHartzIV();
        }
    }


    static void printHartzIV() {
        System.out.print("HartzIV ");
    }
}
