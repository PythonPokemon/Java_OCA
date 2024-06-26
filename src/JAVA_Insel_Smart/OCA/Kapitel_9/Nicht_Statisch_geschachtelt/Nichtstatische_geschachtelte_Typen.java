/*
Ein Exemplar der Klasse Room hat Zugriff auf alle Eigenschaften von House, auch auf die privaten.
Eine wichtige Eigenschaft ist, dass innere Klassen selbst keine statischen Eigenschaften deklarieren dürfen.
Der Versuch führt in unserem Fall zu einem Compilerfehler:
* */
package JAVA_Insel_Smart.OCA.Kapitel_9.Nicht_Statisch_geschachtelt;

class House {
     String owner = "Ich";

    class Room {
        void ok() {
            System.out.println(owner);
        }
        // static void error() { }
    }
}

public class Nichtstatische_geschachtelte_Typen {
    public static void main(String[] args) {
        // Instanz der äußeren Klasse
        House objInstanzHouse = new House();

        House.Room objInstanzRoom = objInstanzHouse.new Room();
        objInstanzRoom.ok();
    }
}
