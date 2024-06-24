/*
Eine finale Klasse kann nicht vererbt werden, und eine finale Methode kann nicht überschrieben werden.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Finale_Klassen_und_Methoden;

// Eine Klasse, die eine finale Methode enthält
class Oberklasse {
    // Finale Methode, die nicht überschrieben werden kann
    final void finaleMethode() {
        System.out.println("Diese Methode kann nicht überschrieben werden");
    }
}

// Eine finale Klasse, die nicht vererbt werden kann
final class EndgueltigeKlasse {
    void anzeigeMethode() {
        System.out.println("Diese Klasse kann nicht erweitert werden");
    }
}

public class FinaleKlassenUndMethoden {
    public static void main(String[] args) {
        // Erstellen eines Objekts der Oberklasse und Aufrufen der finalen Methode
        Oberklasse obj1 = new Oberklasse();
        obj1.finaleMethode(); // Ausgabe: Diese Methode kann nicht überschrieben werden

        // Erstellen eines Objekts der finalen Klasse und Aufrufen der Methode
        EndgueltigeKlasse obj2 = new EndgueltigeKlasse();
        obj2.anzeigeMethode(); // Ausgabe: Diese Klasse kann nicht erweitert werden
    }
}