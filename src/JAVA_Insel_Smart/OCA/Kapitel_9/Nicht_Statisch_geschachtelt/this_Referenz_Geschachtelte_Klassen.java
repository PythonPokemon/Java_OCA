/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Erstellung der Instanz der äußeren Klasse:

FurnishedHouse house = new FurnishedHouse();
Eine Instanz der äußeren Klasse FurnishedHouse wird erstellt.
------------------------------------------------------------------------------------------------------------------------
2.Erstellung der Instanz der inneren Klasse:

FurnishedHouse.Room room = house.new Room();
Eine Instanz der nichtstatischen inneren Klasse Room wird erstellt,
wobei die Instanz der äußeren Klasse house verwendet wird.
------------------------------------------------------------------------------------------------------------------------
3.Aufruf der Methode print:

room.print();
Die Methode print der inneren Klasse Room wird aufgerufen,
die den Wert der Variable s der inneren Klasse (Room) und der äußeren Klasse (House) ausgibt.
------------------------------------------------------------------------------------------------------------------------
Besonderheiten der this-Referenz
------------------------------------------------------------------------------------------------------------------------
this:
In der Methode print bezieht sich s auf das Feld s der inneren Klasse Room.
System.out.println(s); gibt "Room" aus.

FurnishedHouse.this:
Um auf die this-Referenz der äußeren Klasse FurnishedHouse zuzugreifen, wird FurnishedHouse.this.s verwendet.
System.out.println(FurnishedHouse.this.s); gibt "House" aus.
------------------------------------------------------------------------------------------------------------------------
Regeln und Best Practices
------------------------------------------------------------------------------------------------------------------------
1.Verwendung der this-Referenz:

Verwenden Sie this innerhalb einer Klasse, um auf die aktuellen Instanzvariablen und Methoden dieser Klasse zuzugreifen.
------------------------------------------------------------------------------------------------------------------------
2.Zugriff auf die äußere Klasse:

Verwenden Sie OuterClass.this innerhalb einer inneren Klasse, um auf die Instanz der äußeren Klasse zuzugreifen.
------------------------------------------------------------------------------------------------------------------------
3.Vermeidung von Namenskonflikten:

Wenn die Variablen der inneren Klasse die Variablen der äußeren Klasse überdecken,
verwenden Sie die OuterClass.this.Variable-Syntax, um auf die überdeckten Variablen der äußeren Klasse zuzugreifen.
------------------------------------------------------------------------------------------------------------------------
Durch das Verständnis und die korrekte Verwendung der this-Referenz können Sie sicherstellen,
dass Ihr Code klar und verständlich bleibt, insbesondere wenn Sie mit geschachtelten Klassen arbeiten.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_9.Nicht_Statisch_geschachtelt;

class FurnishedHouse {
    String s = "House";

    class Room {
        String s = "Room";

        void print() {
            System.out.println(s); // Ausgabe: Room
            System.out.println(FurnishedHouse.this.s); // Ausgabe: House
        }
    }
}

public class this_Referenz_Geschachtelte_Klassen {
    public static void main(String[] args) {
        // Instanz der äußeren Klasse
        FurnishedHouse house = new FurnishedHouse();

        // Instanz der inneren Klasse
        FurnishedHouse.Room room = house.new Room();

        // Aufruf der Methode print
        room.print();
    }
}
