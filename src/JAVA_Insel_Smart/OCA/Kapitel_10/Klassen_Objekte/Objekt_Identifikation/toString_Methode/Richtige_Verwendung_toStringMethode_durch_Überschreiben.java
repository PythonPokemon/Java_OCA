/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Überschreiben der toString()-Methode:
Die toString()-Methode wird überschrieben, um eine aussagekräftige Darstellung des Objekts zurückzugeben.
Die Methode gibt den Klassennamen sowie die Werte der Felder name und alter zurück.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Objekt_Identifikation.toString_Methode;
// Richtige_Verwendung_toStringMethode_durch_Überschreiben

public class Richtige_Verwendung_toStringMethode_durch_Überschreiben {
    private String name;
    private int alter;

    public Richtige_Verwendung_toStringMethode_durch_Überschreiben(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", alter=" + alter + "]";
    }

    public static void main(String[] args) {
        Richtige_Verwendung_toStringMethode_durch_Überschreiben p = new Richtige_Verwendung_toStringMethode_durch_Überschreiben("Max", 25);
        System.out.println(p);  // Gibt Person [name=Max, alter=25] aus
    }
}
