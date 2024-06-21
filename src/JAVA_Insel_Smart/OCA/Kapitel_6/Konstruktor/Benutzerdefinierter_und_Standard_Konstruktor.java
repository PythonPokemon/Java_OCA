package JAVA_Insel_Smart.OCA.Kapitel_6.Konstruktor;

public class Benutzerdefinierter_und_Standard_Konstruktor {
    String name;
    int score;

    // Benutzerdefinierter Konstruktor mit einem Parameter
    Benutzerdefinierter_und_Standard_Konstruktor(String name) {
        this.name = name;
    }

    // Benutzerdefinierter Konstruktor mit zwei Parametern
    Benutzerdefinierter_und_Standard_Konstruktor(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Standard-Konstruktor (muss explizit definiert werden, wenn ein benutzerdefinierter Konstruktor vorhanden ist)
    Benutzerdefinierter_und_Standard_Konstruktor() {
        this.name = "Unbekannt";
        this.score = 0;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Score: " + score);
    }

    public static void main(String[] args) {
        // Verwenden des Standard-Konstruktors
        Benutzerdefinierter_und_Standard_Konstruktor objektInstanz1 = new Benutzerdefinierter_und_Standard_Konstruktor();
        objektInstanz1.displayInfo(); // Ausgabe: Name: Unbekannt, Score: 0

        // Verwenden des benutzerdefinierten Konstruktors mit 'einem' Parameter, die hier gesetzt werden.
        Benutzerdefinierter_und_Standard_Konstruktor objektInstanz2 = new Benutzerdefinierter_und_Standard_Konstruktor("Alice");
        objektInstanz2.displayInfo(); // Ausgabe: Name: Alice, Score: 0

        // Verwenden des benutzerdefinierten Konstruktors mit 'zwei' Parametern, die hier gesetzt werden.
        Benutzerdefinierter_und_Standard_Konstruktor objektInstanz3 = new Benutzerdefinierter_und_Standard_Konstruktor("Fritz",10);
        objektInstanz3.displayInfo(); // Ausgabe: Name: Fritz10, Score: 10
    }
}
