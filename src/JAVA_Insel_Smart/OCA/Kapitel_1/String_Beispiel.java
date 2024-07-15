/*
Erklärung der Vergleiche
------------------------------------------------------------------------------------------------------------------------
s1 und s2:

Beide referenzieren dasselbe String-Literal "Java" im String Pool.
Deshalb ist s1 == s2 true.
------------------------------------------------------------------------------------------------------------------------
s1 und s3:

s1 referenziert das Literal "Java" im String Pool.
s3 ist ein neues String-Objekt im Heap.
Deshalb ist s1 == s3 false.
------------------------------------------------------------------------------------------------------------------------
s3 und s4:

s3 und s4 sind beide neue String-Objekte im Heap.
Jedes new String("Java") erstellt ein neues Objekt im Heap, daher sind s3 und s4 unterschiedliche Objekte.
Deshalb ist s3 == s4 false.
------------------------------------------------------------------------------------------------------------------------
Vergleich des Inhalts
equals() Methode:
Die Methode equals() vergleicht den Inhalt der Strings.
Obwohl s1 und s3 sowie s3 und s4 unterschiedliche Objekte sind, haben sie denselben Inhalt.
Deshalb geben s1.equals(s3) und s3.equals(s4) true zurück.
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
String Pool: String-Literale werden im String Pool gespeichert und wiederverwendet.
Heap-Speicher: Strings, die mit new String() erstellt werden, werden im allgemeinen Heap-Speicher erstellt
und sind separate Objekte, auch wenn sie denselben Inhalt haben.
Unterschied: Der String Pool ist ein spezieller Bereich des Heaps zur Optimierung der Speicherverwaltung,
während der allgemeine Heap für alle anderen Objekte, einschließlich mit new erstellter Strings, verwendet wird.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_1;

import JAVA_Insel_Smart.OCA.Kapitel_10.System_IdentityHashCode.Standard_SystemIdentityHashCode;

public class String_Beispiel {
    public static void main(String[] args) {

        // Hier wird explizit im String pool geprüft, ob da Literal bereits vorhanden ist
        String s1 = "Java"; // String-Literal im String Pool
        String s2 = "Java"; // Wiederverwendung des String-Literals im String Pool | Deshalb kein neues Objekt !!!

        // mit 'new' wird immer ein neues String Objekt erzeugt, im Heap
        String s3 = new String("Java"); // Neues String-Objekt im Heap
        String s4 = new String("Java"); // Wieder ein neues String-Objekt im Heap

        // Vergleicht, ob die Referenzen auf dieselbe Speicheradresse zeigen
        System.out.println(s1 == s2); // true, s1 und s2 referenzieren dasselbe Objekt im String Pool
        System.out.println(s1 == s3); // false, s1 ist im String Pool, s3 ist im Heap
        System.out.println(s3 == s4); // false, s3 und s4 sind unterschiedliche Objekte im Heap

        // Inhalte vergleichen
        System.out.println(s1.equals(s3)); // true, der Inhalt ist gleich
        System.out.println(s3.equals(s4)); // true, der Inhalt ist gleich

        // Identitätsprüfung mit dem Hashcode
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
    }
}
