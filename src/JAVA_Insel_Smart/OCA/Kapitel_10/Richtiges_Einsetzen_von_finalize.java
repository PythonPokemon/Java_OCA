/*
Erklärung:

In diesem Beispiel wird sichergestellt, dass die Ressourcen nur einmal aufgeräumt werden,
indem eine statische Variable cleanedUp verwendet wird.
finalize() führt das Aufräumen in einem try-finally Block durch und ruft anschließend super.finalize() auf,
um sicherzustellen, dass die Oberklassen-Version von finalize() ebenfalls ausgeführt wird.
System.gc() wird verwendet, um die Garbage Collection anzustoßen, aber es ist immer noch keine Garantie,
dass finalize() sofort aufgerufen wird.
------------------------------------------------------------------------------------------------------------------------
Regeln und Empfehlungen
1.Keine Garantie für die Ausführung: Es gibt keine Garantie, dass finalize() jemals aufgerufen wird,
da die Garbage Collection möglicherweise nie für das Objekt stattfindet.

2.Unvorhersehbares Timing: Selbst wenn finalize() aufgerufen wird, ist das Timing unvorhersehbar.
Es kann zu einem beliebigen Zeitpunkt nach der Dereferenzierung des Objekts passieren.

3.Leistungsprobleme: Das Überladen von finalize() kann die Leistung der Garbage Collection beeinträchtigen,
da die JVM mehr Arbeit verrichten muss.

4.Alternative Ansätze: Anstelle von finalize() sollten Ressourcen manuell mit spezifischen Methoden freigegeben werden,
z.B. durch Implementieren von AutoCloseable und Verwenden eines try-with-resources Blocks.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10;

// Richtiges_Einsetzen_von_finalize
public class Richtiges_Einsetzen_von_finalize {
    private static boolean cleanedUp = false;

    @Override
    protected void finalize() throws Throwable {
        try {
            if (!cleanedUp) {
                System.out.println("Cleaning up resources...");
                // Ressourcen aufräumen
                cleanedUp = true;
            }
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        Richtiges_Einsetzen_von_finalize obj1 = new Richtiges_Einsetzen_von_finalize();
        Richtiges_Einsetzen_von_finalize obj2 = new Richtiges_Einsetzen_von_finalize();
        obj1 = null; // Erstes Objekt ist jetzt berechtigt für die Garbage Collection
        obj2 = null; // Zweites Objekt ist jetzt berechtigt für die Garbage Collection
        System.gc(); // Hinweis an die JVM, die Garbage Collection auszuführen
    }
}
