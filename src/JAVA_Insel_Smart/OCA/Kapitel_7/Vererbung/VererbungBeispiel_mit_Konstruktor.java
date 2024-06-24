/*
Erklärung:
1.Basisklasse Oberklasse:

Enthält einen Konstruktor, der einen Parameter wert akzeptiert.
Der Konstruktor gibt eine Nachricht aus, die den übergebenen Wert anzeigt.

2.Abgeleitete Klasse Unterklasse:

Erbt von Oberklasse.
Enthält einen Konstruktor, der ebenfalls einen Parameter wert akzeptiert.
Der Konstruktor der Unterklasse ruft den Konstruktor der Oberklasse mit super(wert) auf.
Dies muss die erste Anweisung im Konstruktor der Unterklasse sein.
Der Konstruktor der Unterklasse gibt eine Nachricht aus, um zu zeigen, dass er ausgeführt wurde.

3.Hauptklasse VererbungBeispiel:

Enthält die main()-Methode.
Erzeugt ein Objekt der Klasse Unterklasse und übergibt den Wert 42 an den Konstruktor.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Vererbung;

class Oberklasse {

    // Konstruktor der Oberklasse mit einem Parameter
    Oberklasse(int wert) {
        System.out.println("Oberklasse-Konstruktor mit Wert: " + wert);
    }
}

class Unterklasse extends Oberklasse {

    // Konstruktor der Unterklasse mit einem Parameter
    Unterklasse(int wert) {
        // Aufruf des Konstruktors der Oberklasse mit dem Schlüsselwort super
        super(wert);
        System.out.println("Unterklasse-Konstruktor");
    }
}

public class VererbungBeispiel_mit_Konstruktor {
    public static void main(String[] args) {
        // Erstellen eines Objekts der Unterklasse
        Unterklasse unterklasseObjekt = new Unterklasse(42);
    }
}
