package JAVA_Insel_Smart.OCA.Kapitel_7.Kovarianz_und_RückgabeTypen;

// Statische_Methoden_mit_Rückgabewert

public class Statische_Methoden_mit_Rückgabewert {
    public static void main(String[] args) {

        // der variable 'result' wird die methode 'add' zugewiesen, mit den initialisierten parametern a:5, b:3
        int result = add(5, 3); // Verwenden Sie die statische add-Methode und speichern Sie das Ergebnis

        // aufruf der variable 'result'
        System.out.println(result); // Geben Sie das Ergebnis aus
    }

    // deklaration der methode mit Datentyp und parametern,
    public static int add(int a, int b) {
        return a + b; // Gibt die Summe von a und b zurück
    }
}
