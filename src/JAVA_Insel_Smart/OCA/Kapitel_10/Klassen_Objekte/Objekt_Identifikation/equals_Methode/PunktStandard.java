/*
Erklärung
Standard-Implementierung von equals:
Die Methode equals prüft, ob p1 und p2 dieselbe Referenz haben.
Da p1 und p2 verschiedene Objekte sind, gibt p1.equals(p2) false zurück.
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Objekt_Identifikation.equals_Methode;

// Verwendung der Standard-Implementierung von equals
public class PunktStandard {
    private int x, y;

    public PunktStandard(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        PunktStandard p1 = new PunktStandard(1, 2);
        PunktStandard p2 = new PunktStandard(1, 2);
        System.out.println(p1.equals(p2));  // Gibt false aus
    }
}
