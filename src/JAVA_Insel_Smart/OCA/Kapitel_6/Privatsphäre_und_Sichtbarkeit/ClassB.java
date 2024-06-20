/*
Zusammengefasst:
Die main-Methode in ClassB erstellt ein Objekt b von ClassB.
Auf dem Objekt b wird die Methode methodeZumKlassenaufruf aufgerufen.
Die Methode methodeZumKlassenaufruf erstellt ein Objekt a von Klasse1a.
Auf dem Objekt a wird die Methode methodenZumAusgebenDerMethode aufgerufen,
die den Text "Ausgabe der Methode aus der Klasse1a" auf der Konsole ausgibt.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit;

class Klasse1a {
    // Methode, die einen Text ausgibt
    public void methodenZumAusgebenDerMethode() {
        System.out.println("Ausgabe der Methode aus der Klasse1a");
    }
}

public class ClassB {
    // Methode, die ein Objekt von Klasse1a erstellt und dessen Methode aufruft
    public void methodeZumKlassenaufruf() { //
        Klasse1a a = new Klasse1a(); // erstellung eines neuen Objektes/Instanz für die Klasse1a | Name:a
        a.methodenZumAusgebenDerMethode(); // Instanz der Klasse1a ruf die darin enthaltene methode auf
    }

    // Hauptmethode, die beim Programmstart aufgerufen wird
    public static void main(String[] args) {
        ClassB b = new ClassB(); // erstellung eines neuen Objektes/Instanz für die ClassB | Name:b
        b.methodeZumKlassenaufruf(); // das Objekt/Instanz b ruft die methode: methodeZumKlassenaufruf auf
    }
}
