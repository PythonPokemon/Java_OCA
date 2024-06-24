package JAVA_Insel_Smart.OCA.Kapitel_7;
// Eine Person kann mehrere Bankkonten haben.

import java.util.ArrayList;
import java.util.List;

class Bankkonto {
    private String kontonummer;

    public Bankkonto(String kontonummer) {
        this.kontonummer = kontonummer;
    }

    @Override
    public String toString() {
        return "Kontonummer: " + kontonummer;
    }
}

class Person {
    private String name;
    private List<Bankkonto> konten;

    public Person(String name) {
        this.name = name;
        this.konten = new ArrayList<>();
    }

    public void addKonto(Bankkonto konto) {
        konten.add(konto);
    }

    public void display() {
        System.out.println(name + " hat folgende Konten:");
        for (Bankkonto konto : konten) {
            System.out.println(konto);
        }
    }
}

public class Beziehung {
    public static void main(String[] args) {
        Person person = new Person("Max Mustermann");
        Bankkonto konto1 = new Bankkonto("DE1234567890");
        Bankkonto konto2 = new Bankkonto("DE0987654321");

        person.addKonto(konto1);
        person.addKonto(konto2);

        person.display(); // Ausgabe: Max Mustermann hat folgende Konten: Kontonummer: DE1234567890, Kontonummer: DE0987654321
    }
}
