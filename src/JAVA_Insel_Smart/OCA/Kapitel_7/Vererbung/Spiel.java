package JAVA_Insel_Smart.OCA.Kapitel_7.Vererbung;

class Spielobjekt {
    String name;

    Spielobjekt(String name) {
        this.name = name;
    }

    public void anzeigen() {
        System.out.println("Name: " + name);
    }
}

class Raum extends Spielobjekt {
    Raum(String name) {
        super(name);
    }

    @Override
    public void anzeigen() {
        System.out.println("Raum Name: " + name);
    }
}

class Spieler extends Spielobjekt {
    Spieler(String name) {
        super(name);
    }

    @Override
    public void anzeigen() {
        System.out.println("Spieler Name: " + name);
    }
}

class Schluessel extends Spielobjekt {
    Schluessel(String name) {
        super(name);
    }

    @Override
    public void anzeigen() {
        System.out.println("Schlüssel Name: " + name);
    }
}

public class Spiel {
    public static void main(String[] args) {
        Raum raum = new Raum("Küche");
        Spieler spieler = new Spieler("Max");
        Schluessel schluessel = new Schluessel("Goldener Schlüssel");

        raum.anzeigen();       // Ausgabe: Raum Name: Küche
        spieler.anzeigen();    // Ausgabe: Spieler Name: Max
        schluessel.anzeigen(); // Ausgabe: Schlüssel Name: Goldener Schlüssel
    }
}
