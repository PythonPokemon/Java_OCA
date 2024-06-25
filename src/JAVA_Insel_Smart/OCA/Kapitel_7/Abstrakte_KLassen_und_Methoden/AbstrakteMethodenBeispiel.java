package JAVA_Insel_Smart.OCA.Kapitel_7.Abstrakte_KLassen_und_Methoden;

abstract class AbstrakteKlasse1 {
    // Abstrakte Methode (ohne Implementierung)
    abstract void abstrakteMethode();

    // Konkrete Methode (mit Implementierung)
    void konkreteMethode() {
        System.out.println("Konkrete Methode der AbstraktenKlasse");
    }
}

class KonkreteKlasse1 extends AbstrakteKlasse1 {
    // Implementierung der abstrakten Methode
    @Override
    void abstrakteMethode() {
        System.out.println("Implementierung der abstrakten Methode in KonkreteKlasse");
    }
}

public class AbstrakteMethodenBeispiel {
    public static void main(String[] args) {
        // AbstrakteKlasse obj1 = new AbstrakteKlasse(); // Fehler: Abstrakte Klassen können nicht instanziiert werden
        KonkreteKlasse1 obj2 = new KonkreteKlasse1();

        // da abstrakte klassen nicht instanziert werden können,
        // müssen sie durch konkrete Klassen Instanzen aufgerufen werden
        obj2.abstrakteMethode(); // Aufruf der implementierten abstrakten Methode
        obj2.konkreteMethode();  // Aufruf der konkreten Methode der abstrakten Klasse
    }
}
