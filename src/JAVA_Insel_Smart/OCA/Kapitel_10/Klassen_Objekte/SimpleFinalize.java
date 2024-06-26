/*
Nutzung der Methode finalize()
Die Methode finalize() wird von der Garbage Collection aufgerufen, bevor ein Objekt zerstört wird.
Hier sind einfache Beispiele, wie man finalize() verwenden kann, und wie man es richtig einsetzt.
Auch werde ich erklären, warum man sich nicht auf finalize() verlassen sollte.
------------------------------------------------------------------------------------------------------------------------
Erklärung:

Die Methode finalize() wird überschrieben und gibt eine Nachricht aus, wenn sie aufgerufen wird.
Das Objekt obj wird auf null gesetzt, wodurch es für die Garbage Collection berechtigt ist.
System.gc() gibt einen Hinweis an die JVM, die Garbage Collection auszuführen,
aber es ist nicht garantiert, dass finalize() sofort aufgerufen wird.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte;

public class SimpleFinalize {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called");
    }

    public static void main(String[] args) {
        SimpleFinalize obj = new SimpleFinalize();
        obj = null;  // Objekt ist jetzt berechtigt für die Garbage Collection
        System.gc(); // Hinweis an die JVM, die Garbage Collection auszuführen
    }
}
