/*
In einer bidirektionalen Beziehung kennen beide Objekte einander.
Beispiel: Ein Person-Objekt hat eine Address, und die Address kennt die Person.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Bidirektionale_Beziehung;

class Person {
    private String name;
    private Address address;

    public Person(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(name + " lebt in " + address);
    }
}

class Address {
    private String street;
    private String city;
    private Person person;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return street + ", " + city + " (bewohnt von " + person.getName() + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Max Mustermann");
        Address address = new Address("Musterstraße 1", "Musterstadt");

        person.setAddress(address);
        address.setPerson(person);

        person.display(); // Ausgabe: Max Mustermann lebt in Musterstraße 1, Musterstadt (bewohnt von Max Mustermann)
    }
}
