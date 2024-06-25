/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Definition der Abstrakten Klasse:

AbstrakteKlasse enthält eine abstrakte Methode abstrakteMethode() ohne Implementierung und eine konkrete Methode
konkreteMethode() mit Implementierung.
------------------------------------------------------------------------------------------------------------------------
2.Erstellen einer Unterklasse:

Unterklasse erbt von AbstrakteKlasse und implementiert die abstrakte Methode abstrakteMethode().
------------------------------------------------------------------------------------------------------------------------
3.Instanziierung und Methodenaufrufe:

Sie können keine Instanz von AbstrakteKlasse erstellen (new AbstrakteKlasse() ist nicht erlaubt).
Sie können eine Instanz von Unterklasse erstellen und sowohl die implementierte abstrakte Methode als auch
die geerbte konkrete Methode aufrufen.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Abstrakte_KLassen_und_Methoden;

abstract class AbstrakteKlasse {
    // Abstrakte Methode (ohne Implementierung)
    abstract void abstrakteMethode();

    // Konkrete Methode (mit Implementierung)
    void konkreteMethode() {
        System.out.println("Konkrete Methode der AbstraktenKlasse");
    }
}

class Unterklasse extends AbstrakteKlasse1 {
    // Implementierung der abstrakten Methode
    @Override
    void abstrakteMethode() {
        System.out.println("Implementierung der abstrakten Methode in Unterklasse");
    }
}

public class AbstrakteKlassenBeispiel {
    public static void main(String[] args) {
        // AbstrakteKlasse obj1 = new AbstrakteKlasse(); // Fehler: Abstrakte Klassen können nicht instanziiert werden
        Unterklasse obj2 = new Unterklasse();

        obj2.abstrakteMethode(); // Aufruf der implementierten abstrakten Methode
        obj2.konkreteMethode();  // Aufruf der konkreten Methode der abstrakten Klasse
    }
}
