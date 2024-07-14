/*
Implizites Casting (Upcasting)
Implizites Casting tritt auf, wenn ein Objekt einer Subklasse einer Superklasse zugewiesen wird.
Dies geschieht automatisch, da ein Objekt der Subklasse auch ein Objekt der Superklasse ist.
* */

package JAVA_Insel_Smart.OCA.Kapitel_1;

class A1 {
    // Klasseninhalt von A
}

class B1 extends A1 {
    // Klasseninhalt von Person
}
public class Objekt_Casting_Implizit {
    public static void main(String[] args) {

        B1 b = new B1(); // Erstellen eines Objekts der Klasse B
        A1 a = b;       // Implizites Casting von B nach A (Upcasting)

        System.out.println(b);
        System.out.println(a);

        A1 a1 = new B1(); // implizites casting verfahren die Ober klasse hat eine referenz zum Objekt der Unterklasse
        System.out.println(a1);

    }
}
