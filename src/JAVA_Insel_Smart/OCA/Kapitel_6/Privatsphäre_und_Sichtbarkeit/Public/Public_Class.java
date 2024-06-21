/*
Privatsphäre und Sichtbarkeit
Die Sichtbarkeit von Klassenmitgliedern steuert den Zugriff von außerhalb der Klasse.
Es gibt vier Hauptarten der Sichtbarkeit:

public: Das Mitglied ist für alle sichtbar.
private: Das Mitglied ist nur innerhalb der Klasse sichtbar.
protected: Das Mitglied ist innerhalb der Klasse und ihrer Unterklassen sichtbar.
keine Modifikator (paketsichtbar): Das Mitglied ist nur innerhalb desselben Pakets sichtbar.
------------------------------------------------------------------------------------------------------------------------
Erklärung:
Erstellen eines Objekts der Player1-Klasse:

Player1 player = new Player1(); erstellt ein neues Objekt der Player1-Klasse.
Setzen des Namens:

player.name = "Gandalf der Graue"; setzt das name-Attribut des player-Objekts.
Aufrufen der display-Methode:

player.display(); ruft die display-Methode auf, die den Namen des Spielers ausgibt.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit.Public;

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
//  Damit man die klasse PLayer1 aufrufen kann muss man diese Schritte tun:
//----------------------------------------------------------------------------------------------------------------------
//  Erstellen eines neuen Player1-Objekts
        Player1 player = new Player1();

        // Setzen des Namens
        player.name = "Gandalf der Graue";

        // Aufrufen der display()-Methode zur Ausgabe des Namens
        player.display();

    }
}

