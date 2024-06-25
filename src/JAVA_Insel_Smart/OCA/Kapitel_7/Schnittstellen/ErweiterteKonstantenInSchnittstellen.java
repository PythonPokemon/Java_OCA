package JAVA_Insel_Smart.OCA.Kapitel_7.Schnittstellen;

// Definition der erweiterten Schnittstelle mit mehreren Konstanten
interface ErweiterteSchnittstelle_mit_Konstanten {
    int MIN_VALUE = 0;
    int MAX_VALUE = 100;
    String DEFAULT_NAME = "Unbekannt";

    void printValues();
}

// Klasse, die die erweiterte Schnittstelle implementiert
class ErweiterteImplementierung implements ErweiterteSchnittstelle_mit_Konstanten {
    @Override
    public void printValues() {
        System.out.println("MIN_VALUE: " + MIN_VALUE);
        System.out.println("MAX_VALUE: " + MAX_VALUE);
        System.out.println("DEFAULT_NAME: " + DEFAULT_NAME);
    }
}

public class ErweiterteKonstantenInSchnittstellen {
    public static void main(String[] args) {
        ErweiterteImplementierung obj = new ErweiterteImplementierung();
        obj.printValues();  // Ausgabe der Konstanten
    }
}
