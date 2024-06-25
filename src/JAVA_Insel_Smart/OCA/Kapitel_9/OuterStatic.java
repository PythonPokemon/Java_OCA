/*
1. Statischer geschachtelter Typ
Ein statischer geschachtelter Typ ist eine geschachtelte Klasse, die mit dem Schlüsselwort static deklariert wird.
Eine statische geschachtelte Klasse hat keinen Zugriff auf die Instanzvariablen und -methoden der äußeren Klasse.
------------------------------------------------------------------------------------------------------------------------
Erklärung
Die Klasse InnerStatic ist eine statische geschachtelte Klasse.
Sie kann ohne eine Instanz der äußeren Klasse OuterStatic erstellt werden.
* */

package JAVA_Insel_Smart.OCA.Kapitel_9;

public class OuterStatic {
    static class InnerStatic {
        void showMessage() {
            System.out.println("Statischer geschachtelter Typ");
        }
    }

    public static void main(String[] args) {
        OuterStatic.InnerStatic inner = new OuterStatic.InnerStatic();
        inner.showMessage();
    }
}
