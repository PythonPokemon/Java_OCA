/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Standard-Implementierung von toString():
Wenn toString() nicht überschrieben wird, gibt die Methode eine Zeichenkette zurück,
die den Klassennamen sowie die darüber liegenden Verzeichnisse und den Hashcode des Objekts enthält,
------------------------------------------------------------------------------------------------------------------------
z.B.:
------------------------------------------------------------------------------------------------------------------------
Zeichenkette:
Hashcode:--->
------------------------------------------------------------------------------------------------------------------------
Verzeichnis:
JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Objekt_Identifikation.toString_Methode.Verwendung_toStringMethode_ohne_Überschreiben
------------------------------------------------------------------------------------------------------------------------
Hashcode des Objekts:
@6acbcfc0
------------------------------------------------------------------------------------------------------------------------
Konsolenausgabe:
Hashcode:---> JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Objekt_Identifikation.toString_Methode.Verwendung_toStringMethode_ohne_Überschreiben@6acbcfc0
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Objekt_Identifikation.toString_Methode;
// Verwendung_toStringMethode_ohne_Überschreiben
public class Verwendung_toStringMethode_ohne_Überschreiben {
    private String name;
    private int alter;

    public Verwendung_toStringMethode_ohne_Überschreiben(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public static void main(String[] args) {
        Verwendung_toStringMethode_ohne_Überschreiben objInstanz = new Verwendung_toStringMethode_ohne_Überschreiben("Max", 25);
        System.out.println("Hashcode:---> " + objInstanz);  // Gibt den Standard-Hashcode aus, z.B. PersonDefault@6d06d69c
    }
}
