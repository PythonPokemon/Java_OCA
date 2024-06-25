package JAVA_Insel_Smart.OCA.Kapitel_7.Dynamische_Bindung;

class Oberklasse4 {
    public void publicMethode() {
        System.out.println("Öffentliche Methode der Oberklasse");
    }

    protected void protectedMethode() {
        System.out.println("Geschützte Methode der Oberklasse");
    }

    void packagePrivateMethode() {
        System.out.println("Paket-private Methode der Oberklasse");
    }

    public void aufrufMethoden() {
        publicMethode();
        protectedMethode();
        packagePrivateMethode();
    }
}

class Unterklasse4 extends Oberklasse4 {
    @Override
    public void publicMethode() {
        System.out.println("Öffentliche Methode der Unterklasse");
    }

    @Override
    protected void protectedMethode() {
        System.out.println("Geschützte Methode der Unterklasse");
    }

    @Override
    void packagePrivateMethode() {
        System.out.println("Paket-private Methode der Unterklasse");
    }
}

public class DynamischeBindung1 {
    public static void main(String[] args) {
        Oberklasse4 obj1 = new Oberklasse4();
        Oberklasse4 obj2 = new Unterklasse4();

        System.out.println("Aufruf mit Oberklasse-Referenz auf Oberklasse-Objekt:");
        obj1.aufrufMethoden();

        System.out.println("\nAufruf mit Oberklasse-Referenz auf Unterklasse-Objekt:");
        obj2.aufrufMethoden();
    }
}
