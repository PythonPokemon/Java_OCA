/*
3. Lokaler (innerer) Typ
Ein lokaler Typ ist eine Klasse, die innerhalb einer Methode deklariert wird.
Sie hat Zugriff auf die finalen Variablen der Methode.
------------------------------------------------------------------------------------------------------------------------
Erklärung
Die Klasse Inner ist eine lokale Klasse, die innerhalb der Methode display deklariert wird.
Sie kann nur innerhalb dieser Methode verwendet werden.
* */

package JAVA_Insel_Smart.OCA.Kapitel_9;

public class OuterLocal {
    void display() {
        class Inner {
            void showMessage() {
                System.out.println("Lokaler (innerer) Typ");
            }
        }

        Inner inner = new Inner();
        inner.showMessage();
    }

    public static void main(String[] args) {
        OuterLocal outer = new OuterLocal();
        outer.display();
    }
}