package JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit.Protected.paket2;

// Import deklaration wichtig damit zugriff auf andere verzeichnisse gewährleistet wird.
// alternativ: import JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit.Protected.paket1.*;
import JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit.Protected.paket1.HauptKlasse;

// das ist die Unterklasse DerivedClass in einem anderen Paket, von BaseClass
public class UnterKlasse extends HauptKlasse {
    public void zugriffAufGeschuetzeMethode(){
        geschützeMethode(); // zugriff auf die geschütze methode in der Hauptklasse
    }

    public static void main(String[] args) {
        // Erstellung eines/r ObjektInstanzDummy der Klasse: 'Unterklasse', weil sie nicht statisch ist
        UnterKlasse objektInstanz = new UnterKlasse();

        // Damit man mit dem dummy die Methode 'zugriffAufGeschuetzeMethode' aus der Klasse 'UnterKlasse' aufrufen kann
        objektInstanz.zugriffAufGeschuetzeMethode();


    }
}
