package JAVA_Insel_Smart.OCA.Kapitel_2.ArrayList;

import java.util.ArrayList;

class Person {
    String name;
    String geschlecht;
    int alter;

    // Expliziter Konstruktor
    Person(String name, String geschlecht, int alter) {
        this.name = name;
        this.geschlecht = geschlecht;
        this.alter = alter;
    }

    // Methode zur Rückgabe der Personendetails als String
    public String getDetails() {
        return name + ": " + geschlecht + ": " + alter + " ist jahre alt";
    }
}

public class TestArrayList {
    public static void main(String[] args) {
        // Erstellen einer ArrayList von Person-Objekten
        ArrayList<Person> persons = new ArrayList<>();

        // Hinzufügen von Person-Objekten zur ArrayList
        persons.add(new Person("Alice", "Weiblich",30));
        persons.add(new Person("Bob", "Männlich",25));
        persons.add(new Person("Charlie", "Divers",35));

        // Ausgabe der Details jeder Person in der ArrayList
        for (Person person : persons) {
            // Holen der Personendetails
            String details = person.getDetails();
            // Ausgabe der Details
            System.out.println(details);
        }
    }
}
