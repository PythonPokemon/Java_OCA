/*

* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit.Protected;

// Beispiel 1: Zugriff innerhalb desselben Pakets
public class BaseClass {

    protected void geschuetzeMethode() {
        System.out.println("Geschütz Methode aufgerufen");
    }

    protected static void geschuetzStatischeMethode () {
        System.out.println("Geschütze statische Methode aufgerufen");
    }

}
