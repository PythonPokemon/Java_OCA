/*
Erklärung:

Die Klasse Resource implementiert das AutoCloseable Interface, wodurch die Methode close() definiert wird.
Im try-with-resources Block wird res.close() automatisch aufgerufen, wenn der Block verlassen wird,
was eine deterministische und zuverlässige Freigabe von Ressourcen ermöglicht.
Zusammenfassend lässt sich sagen, dass finalize() in modernen Java-Programmen weitgehend vermieden werden sollte.
Stattdessen sollte man auf sicherere und besser vorhersehbare Ansätze wie AutoCloseable und try-with-resources setzen,
um Ressourcen zu verwalten und aufzuräumen.
* */

package JAVA_Insel_Smart.OCA.Kapitel_10;

// Bessere_Alternative_zu_Finilze
public class Bessere_Alternative_zu_Finilze implements AutoCloseable {

    public void use() {
        System.out.println("Using resource");
    }

    @Override
    public void close() {
        System.out.println("Closing resource");
    }

    public static void main(String[] args) {
        try (Bessere_Alternative_zu_Finilze objInstanz = new Bessere_Alternative_zu_Finilze()) {
            objInstanz.use();
        } // res.close() wird automatisch aufgerufen
    }
}
