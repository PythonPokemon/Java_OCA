/*
1:1 Beziehung
Jede Person hat genau einen Pass.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Multiplizität_Kardinalität;

class Pass {
    private String passnummer;

    public Pass(String passnummer) {
        this.passnummer = passnummer;
    }

    @Override
    public String toString() {
        return "Passnummer: " + passnummer;
    }
}

class Person {
    private String name;
    private Pass pass;

    public Person(String name, Pass pass) {
        this.name = name;
        this.pass = pass;
    }

    public void display() {
        System.out.println(name + " hat " + pass);
    }
}

public class Main {
    public static void main(String[] args) {
        Pass pass = new Pass("123456789");
        Person person = new Person("Max Mustermann", pass);
        person.display(); // Ausgabe: Max Mustermann hat Passnummer: 123456789
    }
}
