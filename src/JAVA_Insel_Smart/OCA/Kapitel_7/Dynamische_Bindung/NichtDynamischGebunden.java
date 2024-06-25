/*
Beispiel für Methoden, die nicht dynamisch gebunden sind
Private, statische und finale Methoden in Java sind nicht dynamisch gebunden.
Das bedeutet, dass sie nicht zur Laufzeit überschrieben werden können und das Verhalten zur Kompilierzeit festgelegt ist.
------------------------------------------------------------------------------------------------------------------------
Erklärung

1.Private Methoden:

privateMethode() in Oberklasse ist eine private Methode und kann nicht in Unterklasse überschrieben werden.
Die private Methode privateMethode() in Unterklasse ist eine neue Methode, die nur innerhalb der Unterklasse sichtbar ist.
Aufrufe innerhalb der Oberklasse verwenden die Implementierung der Oberklasse,
und Aufrufe innerhalb der Unterklasse verwenden die Implementierung der Unterklasse.
------------------------------------------------------------------------------------------------------------------------
2.Statische Methoden:

statischeMethode() in Oberklasse ist eine statische Methode und kann nicht überschrieben werden.
Die statische Methode statischeMethode() in Unterklasse ist ebenfalls eine neue Methode.
Statische Methoden sind an die Klasse gebunden und werden aufgerufen basierend auf dem Typ der Referenz
zur Kompilierzeit, nicht zur Laufzeit.
------------------------------------------------------------------------------------------------------------------------
3.Finale Methoden:

finaleMethode() in Oberklasse kann nicht überschrieben werden, da sie als final deklariert ist.
Jeder Versuch, diese Methode in Unterklasse zu überschreiben, führt zu einem Kompilierfehler.
------------------------------------------------------------------------------------------------------------------------
4.Aufrufe von Methoden:

In der Methode aufrufMethoden() in Oberklasse und Unterklasse werden die private, statische und finale Methode aufgerufen.
Die Implementierung in Oberklasse verwendet die Versionen der Oberklasse,
und die Implementierung in Unterklasse verwendet die Versionen der Unterklasse.
------------------------------------------------------------------------------------------------------------------------
Regeln und Best Practices
------------------------------------------------------------------------------------------------------------------------
Private Methoden:

Private Methoden sind nur innerhalb der eigenen Klasse sichtbar und können nicht überschrieben werden.
Jede Methode mit dem gleichen Namen in einer Unterklasse ist eine neue Methode, nicht eine Überschreibung.
------------------------------------------------------------------------------------------------------------------------
Statische Methoden:

Statische Methoden sind an die Klasse gebunden, nicht an die Instanz.
Sie können nicht überschrieben werden, sondern werden in der Unterklasse neu definiert, wenn sie denselben Namen haben.
------------------------------------------------------------------------------------------------------------------------
Finale Methoden:

Finale Methoden können nicht überschrieben werden. Sie stellen sicher, dass die Implementierung unverändert bleibt,
wenn sie von Unterklassen geerbt wird.
------------------------------------------------------------------------------------------------------------------------
Dynamische Bindung:

Nur nicht-private, nicht-statische und nicht-finale Methoden sind dynamisch gebunden und können überschrieben werden.
Diese Methoden nutzen die Vorteile des Polymorphismus und der dynamischen Bindung zur Laufzeit.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Dynamische_Bindung;

class Oberklasse2 {
    private void privateMethode() {
        System.out.println("Private Methode der Oberklasse");
    }

    static void statischeMethode() {
        System.out.println("Statische Methode der Oberklasse");
    }

    final void finaleMethode() {
        System.out.println("Finale Methode der Oberklasse");
    }

    // eine methode die andere methoden aufruft
    public void aufrufMethoden() {
        privateMethode();
        statischeMethode();
        finaleMethode();
    }
}

class Unterklasse2 extends Oberklasse2 {
    // Diese Methode ist eine neue Methode, keine Überschreibung
    private void privateMethode() {
        System.out.println("Private Methode der Unterklasse");
    }

    // Diese Methode ist eine neue Methode, keine Überschreibung
    static void statischeMethode() {
        System.out.println("Statische Methode der Unterklasse");
    }

    // Diese Methode kann nicht überschrieben werden, da sie final ist
    // void finaleMethode() { }

    @Override
    public void aufrufMethoden() {
        privateMethode();
        statischeMethode();
        finaleMethode();
    }
}

public class NichtDynamischGebunden {
    public static void main(String[] args) {
        Oberklasse2 obj1 = new Oberklasse2();
        Oberklasse2 obj2 = new Unterklasse2();

        System.out.println("Aufruf mit Oberklasse-Referenz auf Oberklasse-Objekt:");
        obj1.aufrufMethoden();

        System.out.println("\nAufruf mit Oberklasse-Referenz auf Unterklasse-Objekt:");
        obj2.aufrufMethoden();
    }
}
