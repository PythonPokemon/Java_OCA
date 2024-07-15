class Person {
    String name; // Instanzvariable
    int age; // Instanzvariable
    static int population = 0; // Klassenvariable

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        population++; // Erhöht die Klassenvariable
    }
}

public class TestClass {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);// +1 neues Objekt
        Person person2 = new Person("Bob", 25);// +1 neues Objekt

        // Ausgabe: Population: verändert sich statisch bei allen Objekte,
        // in diesem Beispiel erhöht sich die 'Klassen variable' pro neu erstellten Objekt
        System.out.println("Population: " + Person.population);
        System.out.println("Objekt 1: " + person1.name + " " + (Person.population)); //0 +1 = 1
        System.out.println("Objekt 2: " + person2.name + " " + (Person.population));// 1 +1 = 2
    }
}