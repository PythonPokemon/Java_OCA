/*
Eigene Klassen mit Eigenschaften deklarieren
Die Deklaration einer Klasse leitet das Schlüsselwort class ein. Im Rumpf der Klasse lassen sich deklarieren:

Attribute (Variablen)
Methoden
Konstruktoren
Klassen- sowie Exemplarinitialisierer
geschachtelte Klassen, Schnittstellen und Aufzählungen
------------------------------------------------------------------------------------------------------------------------
1.Eine ganz einfache Klassendeklaration
Wir wollen die Konzepte der Klassen und Schnittstellen an einem kleinen Spiel verdeutlichen.
Beginnen wir mit dem Spieler, den die Klasse Player repräsentiert:

Die Klasse hat einen vom Compiler generierten Konstruktor,
sodass sich ein Exemplar unserer Klasse mit new Player() erzeugen lässt.
------------------------------------------------------------------------------------------------------------------------
2.Attribute deklarieren
Diese Player-Klasse hat bisher keine Attribute und kann daher nichts speichern.
Geben wir dem Spieler zwei Attribute: eines für den Namen und ein zweites für einen Gegenstand, den er trägt.
Die Datentypen sollen beide String sein:
------------------------------------------------------------------------------------------------------------------------
Hinweis: Bei Objektvariablen ist kein var möglich, die Datentypen müssen genannt sein.
------------------------------------------------------------------------------------------------------------------------
Eine zweite Klasse, Playground, erzeugt in der statischen main(…)-Methode für den mutigen Spieler ein Player-Objekt,
schreibt und liest die Attribute:
------------------------------------------------------------------------------------------------------------------------
Methoden deklarieren
Methoden geben den Objekten Verhalten.
Eine Methode wird ähnlich wie eine Funktion in anderen Programmiersprachen definiert,
und sie kann sowohl Eingaben (Parameter) als auch Ausgaben (Rückgabewerte) haben.
------------------------------------------------------------------------------------------------------------------------
Verdeckte (shadowed) Variablen
Variablen können in verschiedenen Gültigkeitsbereichen denselben Namen haben.
Wenn eine lokale Variable denselben Namen wie ein Attribut hat, "verdeckt" die lokale Variable das Attribut:

class Player {
  String name;

  void setName(String name) {
    name = name; // Hier ist name die lokale Variable und verdeckt das Attribut
  }
}
------------------------------------------------------------------------------------------------------------------------
Die this-Referenz
Die this-Referenz zeigt auf das aktuelle Objekt. Sie wird verwendet,
um auf Attribute und Methoden des aktuellen Objekts zuzugreifen.
Im vorherigen Beispiel haben wir this verwendet, um das Attribut name vom Parameter name zu unterscheiden.
------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_6;

class Player {           // Player eine Klasse
    String name;        // Attribute, aber nicht initialisiert
    String item;        // Attribute, aber nicht initialisiert

    int dmg;

    void setSchadensZahl(int dmg){
        this.dmg = dmg;
    }

    void setNamen(String name){
        /// "this.name" bezieht sich auf das Attribut der Klasse, während "name" der Parameter ist
        this.name = name;   // Um auf das Attribut zuzugreifen, verwenden wir this:
    }

    void setGegenstand(String item){
        // "this.item" bezieht sich auf das Attribut der Klasse, während "item" der Parameter ist
        this.item = item;   // Um auf das Attribut zuzugreifen, verwenden wir this:
    }

    void display() {    // methode ohne rückgabewert
        System.out.println("Spieler Name:" + name);
        System.out.println("Spieler Gegenstand: " + item);
        System.out.println("Spieler macht " + dmg + " Schaden!");
    }

}


public class Playground {
    public static void main(String[] args) {
        Player objektBezeichner = new Player();     // erstellen eines neuen Objekts (Instanz) der Klasse Player

        // Setzen der Attribute über Methoden/Instanzen | Hier werden die Attribute --->Initialisiert<---
        objektBezeichner.name = "Gandalf der Graue";
        objektBezeichner.item = "Kometen Stab";
        objektBezeichner.dmg = 100;

        // Ausgabe der Attribute
        System.out.println("Spieler Name: " + objektBezeichner.name);
        System.out.println("Spieler Gegenstand: " + objektBezeichner.item);
        System.out.println("Spieler macht " + objektBezeichner.dmg + " Schaden!");

        // In der Playground-Klasse rufen wir die display()-Methode auf:
        objektBezeichner.display(); // das Objekt/ die Instanz ruft die Methode auf



    }
}
