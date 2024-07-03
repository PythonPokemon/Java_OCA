package JAVA_Insel_Smart.OCA.Kapitel_2.Array;

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
