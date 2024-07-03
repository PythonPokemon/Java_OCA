/*
Array
Ein Array hat eine feste Größe, die beim Erstellen des Arrays festgelegt wird.
Die Elemente eines Arrays müssen vom gleichen Typ sein.
* */

package JAVA_Insel_Smart.OCA.Kapitel_2.Array;

public class Test {
    public static void main(String[] args) {
        // Erstellen eines Arrays von Strings mit einer festen Größe von 3
        // Erstellen eines Arrays von Person-Objekten mit einer Länge von 3
        Person[] persons = new Person[3];

        // Zu diesem Zeitpunkt ist persons: [null, null, null]

        // Initialisieren der Elemente des Arrays mit Person-Objekten
        persons[0] = new Person("Alice", 30);
        persons[1] = new Person("Bob", 25);
        persons[2] = new Person("Charlie", 35);

        // Zu diesem Zeitpunkt ist persons: [Person(Alice, 30), Person(Bob, 25), Person(Charlie, 35)]

        // Ausgabe der Details jeder Person im Array
        for (int i = 0; i < persons.length; i++) {
            // Holen der Personendetails
            String details = persons[i].getDetails();
            // Ausgabe der Details
            System.out.println(details);
        }
    }
}
