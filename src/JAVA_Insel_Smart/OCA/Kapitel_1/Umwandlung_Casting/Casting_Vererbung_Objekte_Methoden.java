/*
Zusammengefasst:

A a = new A();: Eine Instanz von A mit einer Referenz vom Typ A.
A a = new B();: Eine Instanz von B mit einer Referenz vom Typ A.
Nur Methoden und Eigenschaften von A sind zugänglich, aber Methoden, die in B überschrieben wurden, werden ausgeführt.

B a = new A();: Nicht erlaubt, da A nicht alle Eigenschaften und Methoden von B hat.
B a = new B();: Eine Instanz von B mit einer Referenz vom Typ B. Alle Methoden und Eigenschaften von A und B sind zugänglich.
Dies zeigt, wie Polymorphismus und Vererbung in Java funktionieren, und wie die Typen von Variablen die Zugriffsmöglichkeiten beeinflussen.
* */
package JAVA_Insel_Smart.OCA.Kapitel_1.Umwandlung_Casting;

class A {
    // Eigenschaften und Methoden von A
    public void methode_A() {
        System.out.println("Method of class A");
    }
}

class B extends A {
    // Eigenschaften und Methoden von B
    public void methode_B() {
        System.out.println("Method of class B");
    }
}

public class Casting_Vererbung_Objekte_Methoden {
    public static void main(String[] args) {
        // Instanz der Klasse A
        A a1 = new A();
        a1.methode_A(); // Erlaubt

        // Instanz der Klasse B, referenziert durch A
        A a2 = new B();
        a2.methode_A(); // Erlaubt, aber die Methode von B wird ausgeführt, wenn überschrieben
        // a2.methodOfB(); // Nicht erlaubt, da a2 vom Typ A ist

        // Instanz der Klasse B
        B b1 = new B();
        b1.methode_A(); // Erlaubt, weil B von A erbt
        b1.methode_B(); // Erlaubt

        // Dies ist nicht erlaubt und verursacht einen Kompilierfehler
        // B b2 = new A(); // Kompilierfehler: incompatible types: A cannot be converted to B

        // Demonstration von Castings
        if (a2 instanceof B) {
            B b2 = (B) a2;
            b2.methode_B(); // Jetzt erlaubt, da a2 tatsächlich eine Instanz von B ist
        }
    }
}
