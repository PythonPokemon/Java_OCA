package JAVA_Insel_Smart.OCA.Kapitel_6.Statische_Klassen_Methoden_Konstanten;

class Klasse1a {
static final int Klassen_Konstane_Bezeichchner = 10;    // // Klassenkonstante
        }

public class Static_Final {
    public static void main(String[] args) {

        System.out.println(Klasse1a.Klassen_Konstane_Bezeichchner); // Ausgabe: 10

//        Klasse1a.Klassen_Konstane_Bezeichchner = 20; // Fehler: Kann nicht zugewiesen werden, da es final ist
    }
}
