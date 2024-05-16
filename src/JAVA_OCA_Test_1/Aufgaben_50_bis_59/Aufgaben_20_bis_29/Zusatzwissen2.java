/*
* Der Heap-Speicher ist ein Bereich des Hauptspeichers (RAM), der von der Java Virtual Machine (JVM) verwaltet wird
* und zur dynamischen Speicherverwaltung verwendet wird. Er wird zur Laufzeit genutzt, um Objekte und Instanzen von Klassen zu speichern.
*
* Hier sind einige wichtige Punkte zum Verständnis des Heap-Speichers:
*-------------------------------------Eigenschaften des Heap-Speichers--------------------------------------------------
Dynamische Speicherzuweisung:
* Der Heap-Speicher wird verwendet, um Speicher für Objekte dynamisch zur Laufzeit zuzuweisen.
* Dies bedeutet, dass der genaue Speicherbedarf nicht zur Kompilierungszeit bekannt sein muss.
*
Garbage Collection:
* Die JVM verwaltet den Heap-Speicher und verwendet einen Mechanismus namens Garbage Collection,
* um nicht mehr benötigte Objekte automatisch zu entfernen und den belegten Speicher freizugeben.
* Dies hilft, Speicherlecks zu vermeiden und den Speicher effizient zu nutzen.
*
Lebensdauer von Objekten:
* Objekte, die im Heap-Speicher erstellt werden, haben eine längere Lebensdauer als lokale Variablen, die auf dem Stack gespeichert werden.
* Sie bleiben im Speicher, bis sie nicht mehr referenziert werden und von der Garbage Collection entfernt werden.
*
Globaler Speicherbereich:
* Im Gegensatz zum Stack-Speicher, der pro Thread existiert, ist der Heap-Speicher ein globaler Speicherbereich,
* der von allen Threads der Anwendung gemeinsam genutzt wird.
*
*------------------------------------Heap-Speicher vs. Stack-Speicher---------------------------------------------------
Heap-Speicher:
* Enthält alle Objekte und Klasseninstanzen.
* Wird durch die Garbage Collection verwaltet.
* Gemeinsamer Speicherbereich für alle Threads.
* Langsamere Zugriffszeit im Vergleich zum Stack-Speicher.

Stack-Speicher:
* Enthält primitive Variablen, Methodenaufrufe und lokale Variablen.
* Wird automatisch verwaltet (LIFO-Prinzip).
* Jeder Thread hat seinen eigenen Stack.
* Schnellere Zugriffszeit im Vergleich zum Heap-Speicher.
* */

package JAVA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_20_bis_29;

public class Zusatzwissen2 {
    public static void main(String[] args) {
        // Objekt wird im Heap-Speicher erstellt
        Person person = new Person("John", 30);

        // Primitive Daten werden im Stack-Speicher gespeichert
        int age = 25;

        System.out.println(person.getName());
        System.out.println(age);
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
/*----------------------------------------------------------------------------------------------------------------------
* In diesem Beispiel wird das Person-Objekt im Heap-Speicher erstellt, während die Variable age im Stack-Speicher gespeichert wird.
* Das Person-Objekt bleibt im Heap-Speicher, bis es nicht mehr referenziert wird und von der Garbage Collection entfernt wird.
*
* Zusammenfassung
* Der Heap-Speicher ist ein kritischer Bestandteil des Speichermanagements in Java, der für die dynamische Zuweisung
* und Verwaltung von Objekten verwendet wird.
* Er ermöglicht eine flexible Speicherverwaltung zur Laufzeit und wird durch die Garbage Collection der JVM überwacht und bereinigt.
* Der korrekte Umgang mit dem Heap-Speicher ist entscheidend für die Leistung und Stabilität einer Java-Anwendung.
* */