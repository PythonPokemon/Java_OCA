/*
Um auf die Methode copyName aus der Klasse Player von der main-Methode aus zuzugreifen,
müssen Sie zwei Player-Objekte erstellen und die Methode copyName auf einem der Objekte aufrufen,
wobei das andere Objekt als Argument übergeben wird.
Außerdem benötigen Sie eine Methode zum Setzen des Namens,
da das Attribut name privat ist und nicht direkt von außerhalb der Klasse Player zugegriffen werden kann.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit.Private;


// Variante 1 Test
//class Player {
//    private String name;
//
//    public void copyName(Player other) {
//        this.name = other.name; // Zugriff auf private Attribute
//    }
//}
//
//
//public class Private_Attribute_Zugreifen {
//    public static void main(String[] args) {
//        Player objektInstanz1 = new Player();
//
////        objektInstanz1.copyName(); // noch nicht möglich
//    }
//}
/*
------------------------------------------------------------------------------------------------------------------------


* */

// Variante 2
class Player {
    private String name;

    // Methode zum Setzen des Namens
    public void setName(String name) {
        this.name = name;
    }

    // Frag mich, ob man damit auf alle verfügbaren Attribute der Klasse zugreifen kann?
    public void copyName(Player other) {
        this.name = other.name; // Zugriff auf private Attribute innerhalb der Klasse
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

public class Private_Attribute_Zugreifen {
    public static void main(String[] args) {
        Player objektInstanz1 = new Player();
        Player objektInstanz2 = new Player();

        // Setzen des Namens für objektInstanz1 | der Parameter: Name wird hier initialisiert
        objektInstanz1.setName("Gandalf der Graue");

        objektInstanz1.display(); // würde bis hier reichen!
//        // Kopieren des Namens von objektInstanz1 zu objektInstanz2
//        objektInstanz2.copyName(objektInstanz1);
//
//        // Anzeigen des Namens von objektInstanz2
//        objektInstanz2.display(); // Ausgabe: Name: Gandalf der Graue
    }
}
