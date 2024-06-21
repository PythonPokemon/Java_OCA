/*
Erklärung:
Zugriff innerhalb desselben Pakets:

In meinpaket.BaseClass ist die Methode geschuetzteMethode als protected deklariert.
In meinpaket.SamePackageClass können wir direkt auf diese Methode zugreifen, da sie im selben Paket liegt.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit.Protected;

//----------------------------Beispiel 1: Zugriff innerhalb desselben Pakets--------------------------------------------
public class BaseClass {

    protected void geschuetzeMethode() {
        System.out.println("Geschütz Methode aufgerufen");
    }

    protected static void geschuetzStatischeMethode () {
        System.out.println("Geschütze statische Methode aufgerufen");
    }

}
