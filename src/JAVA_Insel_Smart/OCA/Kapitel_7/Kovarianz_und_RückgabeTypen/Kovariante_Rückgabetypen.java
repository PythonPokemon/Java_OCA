///*
//Kovariante Rückgabetypen
//Eine überschriebene Methode kann einen spezifischeren Rückgabetyp haben als die Methode in der Oberklasse,
//was als kovariante Rückgabe bezeichnet wird.
//* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Kovarianz_und_RückgabeTypen;

// Oberklasse mit einer Methode, die einen Rückgabewert vom Typ Oberklasse hat
class Oberklasse {
    Oberklasse ausgabe() {
        System.out.println("Ausgabe der Oberklasse");
        return this;
    }
}

// Unterklasse, die die Methode ausgabe() überschreibt und einen spezifischeren Rückgabetyp hat
class Unterklasse extends Oberklasse {
    @Override
    Unterklasse ausgabe() {
        System.out.println("Ausgabe der Unterklasse");
        return this;
    }
}

public class Kovariante_Rückgabetypen {
    public static void main(String[] args) {
        Oberklasse obj1 = new Oberklasse();
        obj1.ausgabe(); // Ausgabe: Ausgabe der Oberklasse

        Unterklasse obj2 = new Unterklasse();
        obj2.ausgabe(); // Ausgabe: Ausgabe der Unterklasse

        // Demonstration der Kovarianz
        Oberklasse obj3 = new Unterklasse();
        obj3.ausgabe(); // Ausgabe: Ausgabe der Unterklasse
    }
}
