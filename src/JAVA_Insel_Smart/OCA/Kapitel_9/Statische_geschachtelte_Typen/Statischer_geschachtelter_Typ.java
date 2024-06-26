/*
1. Statischer geschachtelter Typ
Ein statischer geschachtelter Typ ist eine geschachtelte Klasse, die mit dem Schlüsselwort static deklariert wird.
Eine statische geschachtelte Klasse hat keinen Zugriff auf die Instanzvariablen und -methoden der äußeren Klasse.
------------------------------------------------------------------------------------------------------------------------
Erklärung
Die Klasse InnerStatic ist eine statische geschachtelte Klasse.
Sie kann ohne eine Instanz der äußeren Klasse OuterStatic erstellt werden.
* */

package JAVA_Insel_Smart.OCA.Kapitel_9.Statische_geschachtelte_Typen;

public class Statischer_geschachtelter_Typ {
    static class InnerStatic {
        void showMessage() {
            System.out.println("Statischer geschachtelter Typ");
        }
    }

    public static void main(String[] args) {
        Statischer_geschachtelter_Typ.InnerStatic inner = new Statischer_geschachtelter_Typ.InnerStatic();
        inner.showMessage();
    }
}
