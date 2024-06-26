/*
Nichtstatische (innere) Klasse:

Die Klasse Inner ist eine nichtstatische geschachtelte Klasse innerhalb der äußeren Klasse Outer.
Zur Instanziierung von Inner ist eine Instanz von Outer erforderlich.
Der Code outer.new Inner() verwendet eine Instanz der äußeren Klasse Outer (outer),
um eine Instanz der inneren Klasse Inner zu erstellen.
* */

package JAVA_Insel_Smart.OCA.Kapitel_9.Nicht_Statisch_geschachtelt;

public class Outer {

    class InnereKlasse {
        void display() {
            System.out.println("Nichtstatische (innere) Klasse");
        }

    }

    public static void main(String[] args) {
        // Instanziierung der äußeren Klasse
        Outer outer = new Outer();

        // Instanziierung der inneren Klasse erfordert eine Instanz der äußeren Klasse
        InnereKlasse innereKlasse = outer.new InnereKlasse();
        innereKlasse.display();
    }
}
