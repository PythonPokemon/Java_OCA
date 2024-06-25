package JAVA_Insel_Smart.OCA.Kapitel_7.Schnittstellen;

// Definition der Basisschnittstelle
interface Schnittstelle {
    void methode();
}

// Definition der erweiterten Schnittstelle, die von der Basisschnittstelle erbt
interface ErweiterteSchnittstelle extends Schnittstelle {
    void weitereMethode();
}

// Klasse, die die erweiterte Schnittstelle implementiert
class Implementierung2 implements ErweiterteSchnittstelle {
    @Override
    public void methode() {
        System.out.println("Implementierung der Methode in Implementierung2");
    }

    @Override
    public void weitereMethode() {
        System.out.println("Implementierung der weiteren Methode in Implementierung2");
    }
}

public class SchnittstellenvererbungBeispiel {
    public static void main(String[] args) {
        Implementierung2 obj = new Implementierung2();
        obj.methode();          // Aufruf der Methode der Basisschnittstelle
        obj.weitereMethode();   // Aufruf der Methode der erweiterten Schnittstelle
    }
}
