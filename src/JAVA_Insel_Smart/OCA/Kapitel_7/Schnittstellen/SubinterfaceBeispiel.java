package JAVA_Insel_Smart.OCA.Kapitel_7.Schnittstellen;

// Definition der Super-Schnittstelle
interface SuperSchnittstelle {
    void superMethode();
}

// Definition der Sub-Schnittstelle, die von der Super-Schnittstelle erbt, bzw. erweitert wird.
interface SubSchnittstelle extends SuperSchnittstelle {
    void subMethode();
}

// Klasse, die die Sub-Schnittstelle implementiert
class ImplementierungsKlasse implements SubSchnittstelle {
    @Override
    public void superMethode() {
        System.out.println("Implementierung der superMethode in Implementierung");
    }

    @Override
    public void subMethode() {
        System.out.println("Implementierung der subMethode in Implementierung");
    }
}

public class SubinterfaceBeispiel {
    public static void main(String[] args) {
        ImplementierungsKlasse obj = new ImplementierungsKlasse();
        obj.superMethode();  // Aufruf der Methode der Super-Schnittstelle
        obj.subMethode();    // Aufruf der Methode der Sub-Schnittstelle
    }
}
