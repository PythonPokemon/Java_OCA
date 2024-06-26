/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Klasse Person:
Diese Klasse hat zwei Attribute, name und age, und implementiert das Comparable-Interface, was uns zwingt,
die compareTo-Methode zu überschreiben.

Konstruktor:
Der Konstruktor initialisiert die Attribute name und age.

compareTo-Methode:
Diese Methode vergleicht das aktuelle Person-Objekt (this) mit einem anderen Person-Objekt (other).

Die Methode gibt:

Einen negativen Wert zurück, wenn this.age kleiner ist als other.age.
Null zurück, wenn this.age gleich other.age ist.
Einen positiven Wert zurück, wenn this.age größer ist als other.age.
toString-Methode:
Diese Methode gibt eine String-Repräsentation der Person zurück, was beim Drucken des Arrays hilfreich ist.

Main-Methode:
Hier erstellen wir einige Person-Objekte und vergleichen sie mit der compareTo-Methode.
Schließlich sortieren wir ein Array von Personen und drucken das Ergebnis aus.

Dieses Beispiel zeigt, wie man die compareTo-Methode verwendet, um Objekte zu vergleichen und zu sortieren.
Wenn du weitere Fragen hast oder zusätzliche Erklärungen benötigst, lass es mich wissen!
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.CompareTo_Methode;
import java.util.Arrays;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Charlie", 35);

        // Vergleich der Personen
        System.out.println(person1.compareTo(person2)); // Output: 1 (weil 30 > 25)
        System.out.println(person1.compareTo(person3)); // Output: -1 (weil 30 < 35)
        System.out.println(person1.compareTo(person1)); // Output: 0 (weil 30 == 30)

        // Array von Personen sortieren
        Person[] people = {person1, person2, person3};
        Arrays.sort(people);
        System.out.println(Arrays.toString(people)); // Output: [Bob (25), Alice (30), Charlie (35)]
    }
}
