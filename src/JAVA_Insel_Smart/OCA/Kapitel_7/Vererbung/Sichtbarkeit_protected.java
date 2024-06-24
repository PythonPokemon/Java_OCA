/*
Erklärung:
protected Mitglieder sind innerhalb der gleichen Klasse, in Unterklassen und im selben Paket sichtbar.
Im obigen Beispiel kann die Klasse Dog auf die geschützte Methode setName
und das geschützte Attribut name der Klasse Animal zugreifen.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Vererbung;
// Sichtbarkeit_protected


// Basisklasse mit einem geschützten Attribut und einer Methode
class Animal1 {
    protected String name;

    protected void setName(String name) {
        this.name = name;
    }
}

// Abgeleitete Klasse, die auf geschützte Mitglieder zugreift
class Dog1 extends Animal1 {
    public void display() {
        setName("Buddy");
        System.out.println("Dog's name: " + name);
    }
}

public class Sichtbarkeit_protected {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.display(); // Ausgabe: Dog's name: Buddy
    }
}
