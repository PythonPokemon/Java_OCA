/*
In einer unidirektionalen Beziehung kennt nur ein Objekt das andere Objekt. Beispiel: Ein Person-Objekt hat eine Address.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Unidirektionale_Beziehung;

class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return street + ", " + city;
    }
}

class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println(name + " lebt in " + address);
    }
}

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Musterstraße 1", "Musterstadt");
        Person person = new Person("Max Mustermann", address);
        person.display(); // Ausgabe: Max Mustermann lebt in Musterstraße 1, Musterstadt
    }
}
