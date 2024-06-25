/*
2. Innerer Typ (nichtstatischer geschachtelter Typ)
Ein innerer Typ ist eine nichtstatische geschachtelte Klasse, die eine Referenz auf die Instanz der äußeren Klasse hat
und auf deren Mitglieder zugreifen kann.
------------------------------------------------------------------------------------------------------------------------
Erklärung
Die Klasse Inner ist eine innere Klasse.
Sie kann nur innerhalb einer Instanz der äußeren Klasse OuterInner erstellt werden.
* */

package JAVA_Insel_Smart.OCA.Kapitel_9;

public class OuterInner {
    class Inner {
        void showMessage() {
            System.out.println("Innerer Typ (nichtstatischer geschachtelter Typ)");
        }
    }

    public static void main(String[] args) {
        OuterInner outer = new OuterInner();
        OuterInner.Inner inner = outer.new Inner();
        inner.showMessage();
    }
}
