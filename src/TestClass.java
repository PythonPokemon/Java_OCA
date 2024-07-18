class Parent {
    int VALUE = 10;
    int i = 10;

    void printValues() {
        System.out.println("Methode der Oberklasse");
    }
}

class Child extends Parent {
    // Diese Variable blendet die final Variable VALUE der Oberklasse aus.
    int VALUE = 20;
    int j = 20;

    @Override
    protected void printValues() {
        System.out.println("Methode der Unterklasse");
        System.out.println("Child VALUE: " + VALUE); // Gibt 20 aus
        System.out.println("Parent VALUE: " + super.VALUE); // Gibt 10 aus
    }
}

public class TestClass {
    public static void main(String[] args) {
        Parent parent = new Parent();// Oberklasse-Referenz auf ein Oberklasse-Objekt
        parent.printValues();// Ruft die Methode der Oberklasse auf



        Child child = new Child();// Unterklasse-Referenz auf ein Unterklasse-Objekt
        child.printValues();// Ruft die Methode der Unterklasse auf

        System.out.println("Unterklasse hat immer eine referenz zur oberklassen variable" + child.i);
        System.out.println(child.j);

        Parent parent1 = new Child();// Oberklasse-Referenz auf ein Unterklasse-Objekt
        parent1.printValues();// Ruft die Methode der Unterklasse auf
        System.out.println(parent1);
    }
}