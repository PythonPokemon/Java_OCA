/*
Erklärung:

WeakReference erlaubt es dem Garbage Collector, das referenzierte Objekt zu entfernen,
wenn keine starken Referenzen mehr darauf verweisen.
Vor dem Entfernen der starken Referenz (strongReference) und dem Auslösen der Garbage Collection
gibt die schwache Referenz (weakReference.get()) das Objekt zurück.

Nach dem Entfernen der starken Referenz und der Garbage Collection gibt die schwache Referenz null zurück.
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Referenzen_und_Cleaner;

import java.lang.ref.WeakReference;

public class SimpleWeakReference {
    public static void main(String[] args) {

        // Erstellen eines Objekts und einer starken Referenz darauf
        String strongReference = new String("Hello, World");

        // Erstellen einer schwachen Referenz auf das Objekt
        WeakReference<String> weakReference = new WeakReference<>(strongReference);

        // Ausgabe des Objekts über die schwache Referenz
        System.out.println("Before GC: " + weakReference.get());

        // Entfernen der starken Referenz
        strongReference = null;

        // Manuelles Auslösen der Garbage Collection
        System.gc();

        // Ausgabe des Objekts über die schwache Referenz nach der Garbage Collection
        System.out.println("After GC: " + weakReference.get());
    }
}
