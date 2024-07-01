/*
Erklärung:
------------------------------------------------------------------------------------------------------------------------
State-Klasse:

Diese innere Klasse implementiert Runnable und definiert die Aufräumaktion, die ausgeführt wird,
wenn das Resource-Objekt vom Garbage Collector entfernt wird. In diesem Fall gibt sie eine
Nachricht "Cleaning up resources..." aus.
------------------------------------------------------------------------------------------------------------------------
Resource-Klasse:

Diese Klasse verwaltet die zu bereinigenden Ressourcen. Im Konstruktor wird das Objekt beim Cleaner registriert
und eine Instanz der State-Klasse übergeben, die die Aufräumaktion enthält.
------------------------------------------------------------------------------------------------------------------------
Cleaner:

Ein Cleaner-Objekt wird erstellt. Dieses Cleaner-Objekt wird verwendet,
um die Aufräumaktionen zu registrieren und auszuführen.
------------------------------------------------------------------------------------------------------------------------
Garbage Collection anstoßen:

Die starke Referenz auf das Resource-Objekt wird entfernt, indem resource = null gesetzt wird.
Dann wird System.gc() aufgerufen, um die Garbage Collection anzustoßen.
------------------------------------------------------------------------------------------------------------------------
Warten:

Eine kurze Pause (Thread.sleep(1000)) gibt der JVM und dem Cleaner Zeit, die Aufräumaktion auszuführen.
------------------------------------------------------------------------------------------------------------------------
Ausgabe: Die Nachricht "Cleaning up resources..." wird ausgegeben, wenn das Resource-Objekt vom Garbage Collector
entfernt wird und die Aufräumaktion ausgeführt wird.
------------------------------------------------------------------------------------------------------------------------
Regeln und Empfehlungen
Cleaner verwenden: Verwende Cleaner, wenn du sicherstellen möchtest, dass bestimmte Aufräumaktionen durchgeführt werden,
wenn ein Objekt vom Garbage Collector entfernt wird.

Aufräumaktion definieren:
Definiere eine Aufräumaktion durch Implementierung der Runnable-Schnittstelle und registriere diese mit dem Cleaner.

Starke Referenzen entfernen:
Entferne starke Referenzen auf das Objekt, damit es für die Garbage Collection berechtigt ist.

System.gc() Hinweis:
Das Aufrufen von System.gc() gibt nur einen Hinweis an die JVM, die Garbage Collection auszuführen.
Es gibt keine Garantie, dass sie sofort ausgeführt wird.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Referenzen_und_Cleaner;

import java.lang.ref.Cleaner;

public class SimpleCleanerExample {
    // Innere Klasse, die die Aufräumaktion definiert
    static class State implements Runnable {
        @Override
        public void run() {
            System.out.println("Cleaning up resources...");
        }
    }

    // Klasse, die die zu bereinigenden Ressourcen verwaltet
    static class Resource {
        private final Cleaner.Cleanable cleanable;

        // Konstruktor, der das Objekt beim Cleaner registriert
        Resource(Cleaner cleaner) {
            this.cleanable = cleaner.register(this, new State());
        }
    }

    public static void main(String[] args) {
        Cleaner cleaner = Cleaner.create();

        // Erstellen und verwenden des Resource-Objekts
        Resource resource = new Resource(cleaner);

        // Entfernen der starken Referenz, damit das Objekt für die Garbage Collection berechtigt ist
        resource = null;

        // Hinweis an die JVM, die Garbage Collection auszuführen
        System.gc();

        // Warten, um dem Cleaner Zeit für die Ausführung der Aufräumaktion zu geben
        try {
            Thread.sleep(1000); // Kurze Pause, damit der Cleaner seine Arbeit machen kann
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method");
    }
}
