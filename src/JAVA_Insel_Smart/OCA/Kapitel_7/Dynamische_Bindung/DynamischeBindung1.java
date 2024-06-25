/*
bedeutet das im umkehrschluss, das öffentliche und geschütze,
sowie nicht statische methoden dynamisch gebunden werden können?

Ja, das ist korrekt.
In Java sind öffentliche (public), geschützte (protected) und nicht-statische Methoden dynamisch gebunden.
Das bedeutet, dass diese Methoden zur Laufzeit auf Basis des tatsächlichen Objekttyps aufgerufen werden,
nicht auf Basis des deklarierten Typs der Variablen. Dies ermöglicht das Überschreiben von Methoden in Unterklassen
und die Nutzung von Polymorphismus.
------------------------------------------------------------------------------------------------------------------------
Regeln und Best Practices
Öffentliche Methoden:

Öffentliche Methoden (public) sind von überall sichtbar und können in Unterklassen überschrieben werden.
------------------------------------------------------------------------------------------------------------------------
Geschützte Methoden:

Geschützte Methoden (protected) sind innerhalb ihres Pakets und von Unterklassen sichtbar.
Sie können in Unterklassen überschrieben werden.
------------------------------------------------------------------------------------------------------------------------
Paket-private Methoden:

Paket-private Methoden (keine Zugriffsmodifizierer) sind nur innerhalb ihres Pakets sichtbar.
Sie können in Unterklassen, die im selben Paket sind, überschrieben werden.
------------------------------------------------------------------------------------------------------------------------
Dynamische Bindung:

Öffentliche, geschützte und paket-private Methoden sind dynamisch gebunden, was bedeutet,
dass der Methodenaufruf zur Laufzeit basierend auf dem tatsächlichen Objekttyp erfolgt.
Dies ermöglicht Polymorphismus und das Überschreiben von Methoden in Unterklassen.
------------------------------------------------------------------------------------------------------------------------
Durch die Beachtung dieser Regeln und Best Practices können Sie die Vorteile von dynamischer Bindung
und Polymorphismus in Java nutzen und sicherstellen, dass Ihr Code korrekt und flexibel ist.
* */
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
