/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Implementierung des Cloneable-Interfaces:
Die Klasse Rechteck implementiert das Cloneable-Interface, was anzeigt, dass Objekte dieser Klasse klonbar sind.

Überschreiben der clone-Methode:
Die clone-Methode wird überschrieben und ruft super.clone() auf, um eine Kopie des Objekts zu erstellen.

Klonen und Überprüfung:
Rechteck r2 = (Rechteck) r1.clone(); erstellt eine Kopie von r1.
r1 == r2 gibt false aus, da r1 und r2 verschiedene Objekte sind.
r1.equals(r2) gibt false aus, da die Standard-Implementierung von equals in der Object-Klasse die Referenzen vergleicht.
------------------------------------------------------------------------------------------------------------------------
Flache Kopie (Shallow Copy)
Eine flache Kopie eines Objekts bedeutet, dass nur die Referenzen der Felder des Objekts kopiert werden,
nicht jedoch die Objekte selbst, auf die diese Felder verweisen. Das bedeutet, dass die Kopie und das Original
dieselben Referenzwerte für ihre Felder haben.

In Ihrem Beispiel hat die Klasse Rechteck nur primitive Felder (int breite und int hoehe).
Primitive Felder werden direkt kopiert, was bei flachen Kopien und tiefen Kopien keinen Unterschied macht.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Objekt_Kopieren;

// Flache Kopie (Shallow Copy)
public class Flache_Kopie implements Cloneable {
    private int breite, hoehe;

    public Flache_Kopie(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Flache_Kopie r1 = new Flache_Kopie(5, 10);
        try {
            Flache_Kopie r2 = (Flache_Kopie) r1.clone();
            System.out.println(r1 == r2);  // Gibt false aus
            System.out.println(r1.equals(r2));  // Gibt false aus (standardmäßige equals Implementierung)
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
