/*

* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit.Protected.paket1;


//----------------------------Beispiel 2: Zugriff in einem anderen packet einer Unterklasse-----------------------------
public class HauptKlasse {
    protected void geschützeMethode() {
        System.out.println("Geschützte Methode aufgerufen");
    }
}