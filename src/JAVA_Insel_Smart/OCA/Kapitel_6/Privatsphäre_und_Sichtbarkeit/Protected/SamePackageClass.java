/*
Erklärung:
Zugriff innerhalb desselben Pakets:

In meinpaket.BaseClass ist die Methode geschuetzteMethode als protected deklariert.
In meinpaket.SamePackageClass können wir direkt auf diese Methode zugreifen, da sie im selben Paket liegt.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit.Protected;

//----------------------------Beispiel 1: Zugriff innerhalb desselben Pakets--------------------------------------------
public class SamePackageClass {
    public static void main(String[] args) {

        // erstellung der ObjektInstanz für die Klasse 'BaseClass' pflicht, weil nicht statisch!
        BaseClass objektInstanzDummy1 = new BaseClass();
        // Die Instanz der Klasse, ruft die methode in der Klasse auf.
        objektInstanzDummy1.geschuetzeMethode(); //

        // das kann man so oft wiederholen so lange der speicher reicht XD | fast wie beim Sonderschlussverkauf
        BaseClass objektInstanzDummy2 = new BaseClass();
        objektInstanzDummy2.geschuetzeMethode();

        // Aufruf der Methode direkt über den Klassen namen,
        // da die methode statisch ist, braucht man kein Objekt_Instanz_Dummy
        BaseClass.geschuetzStatischeMethode();

    }
}
