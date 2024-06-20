/*
Privatsphäre und Sichtbarkeit
Die Sichtbarkeit von Klassenmitgliedern steuert den Zugriff von außerhalb der Klasse.
Es gibt vier Hauptarten der Sichtbarkeit:

public: Das Mitglied ist für alle sichtbar.
private: Das Mitglied ist nur innerhalb der Klasse sichtbar.
protected: Das Mitglied ist innerhalb der Klasse und ihrer Unterklassen sichtbar.
keine Modifikator (paketsichtbar): Das Mitglied ist nur innerhalb desselben Pakets sichtbar.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit;

//Für die Öffentlichkeit: public
//Ein public-Attribut oder eine public-Methode ist für alle Klassen zugänglich:
class Player1 {
    public String name;

    public void display() {
        System.out.println("Player Name: " + name);
    }
}

class Public_Class {
    public static void main(String[] args) {

    }
}

