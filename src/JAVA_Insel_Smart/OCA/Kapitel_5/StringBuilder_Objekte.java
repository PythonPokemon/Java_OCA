/*
StringBuilder vs. StringBuffer
1.Thread-Sicherheit:

StringBuffer:
Ist thread-sicher, d.h. seine Methoden sind synchronisiert,
sodass mehrere Threads gleichzeitig sicher darauf zugreifen können.
Dies bedeutet, dass jeder Methodenaufruf in StringBuffer durch einen Thread-Synchronisationsmechanismus geschützt wird,
was den Zugriff verlangsamt.

StringBuilder:
Ist nicht thread-sicher, d.h. seine Methoden sind nicht synchronisiert.
Dadurch ist StringBuilder schneller als StringBuffer, wenn es in einem Single-Threaded-Umfeld verwendet wird.
------------------------------------------------------------------------------------------------------------------------
2.Leistung:

StringBuffer:
Aufgrund der Synchronisation ist StringBuffer langsamer als StringBuilder.
StringBuilder:
Da keine Synchronisation erfolgt, ist StringBuilder schneller und effizienter in einem Single-Threaded-Umfeld.
------------------------------------------------------------------------------------------------------------------------
3.Verwendungszweck:

StringBuffer:
Wird verwendet, wenn String-Manipulationen in einem Multithreaded-Umfeld erforderlich sind
und die Thread-Sicherheit wichtig ist.

StringBuilder:
Wird verwendet, wenn String-Manipulationen in einem Single-Threaded-Umfeld stattfinden
oder wenn die Thread-Sicherheit nicht erforderlich ist.
* */
package JAVA_Insel_Smart.OCA.Kapitel_5;

//StringBuilder-Objekte werden verwendet, um veränderbare Zeichenketten zu erstellen.
// Sie sind nicht threadsicher, aber effizienter als StringBuffer.
public class StringBuilder_Objekte {
    public static void main(String[] args) {

        // Verwendung von StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Fügt " World" an den StringBuilder an
        String result = sb.toString(); // Konvertiert den StringBuilder in einen String
        System.out.println("StringBuilder: " + result); // Ausgabe: "Hello World"

        // Verwendung von StringBuffer
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World"); // Fügt " World" an den StringBuffer an
        String resultBuf = sbuf.toString(); // Konvertiert den StringBuffer in einen String
        System.out.println("StringBuffer: " + resultBuf); // Ausgabe: "Hello World"
    }
}
