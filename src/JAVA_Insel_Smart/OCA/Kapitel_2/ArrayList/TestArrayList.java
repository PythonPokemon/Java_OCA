package JAVA_Insel_Smart.OCA.Kapitel_2.ArrayList;

import java.util.ArrayList;

class Person {
    String name;
    int age;

    // Konstruktor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methode zur Rückgabe der Personendetails als String
    public String getDetails() {
        return name + ", " + age + " years old";
    }
}

public class TestArrayList {
    public static void main(String[] args) {
        // Erstellen einer ArrayList von Person-Objekten
        ArrayList<Person> persons = new ArrayList<>();

        // Hinzufügen von Person-Objekten zur ArrayList
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 25));
        persons.add(new Person("Charlie", 35));

        // Ausgabe der Details jeder Person in der ArrayList
        for (Person person : persons) {
            // Holen der Personendetails
            String details = person.getDetails();
            // Ausgabe der Details
            System.out.println(details);
        }
    }
}
