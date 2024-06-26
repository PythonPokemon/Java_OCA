/*
Einfaches Beispiel zur Synchronisation
Dieses Beispiel zeigt, wie man eine Methode synchronisieren kann, um sicherzustellen,
dass nur ein Thread gleichzeitig darauf zugreift.
------------------------------------------------------------------------------------------------------------------------
Erklärung:

Die Methode increment() ist synchronisiert, sodass nur ein Thread gleichzeitig darauf zugreifen kann.
Zwei Threads inkrementieren den Zähler einmal. Da die Methode increment() synchronisiert ist,
wird die erwartete Ausgabe 2 sein.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte;

// Synchronisation
class Counter {
    private int count = 0;

    // Synchronisierte Methode
    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class Synchronisation {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Erstellen von zwei Threads
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                counter.increment();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        // Warten, bis beide Threads beendet sind
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Ausgabe des Zählerwerts
        System.out.println("Count: " + counter.getCount());
    }
}
