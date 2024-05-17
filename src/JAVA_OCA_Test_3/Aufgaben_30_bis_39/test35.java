/*
Derived: m1()

Gesamterklärung
NullPointerException erweitert RuntimeException, aber es gibt keine überschreibenden Regeln im Zusammenhang mit nicht überprüften Ausnahmen.

Daher überschreibt die Methode m1() in der abgeleiteten Klasse die Basisklassenmethode korrekt.

Der Rest ist einfacher Polymorphismus. obj bezieht sich auf eine Instanz der Klasse Derived und daher auf obj.m1();
Ruft die Methode m1() der Klasse Derived auf, die "Derived: m1()" in der Konsole ausgibt.

 * */
package JAVA_OCA_Test_3.Aufgaben_30_bis_39;

class Base {
    public void m1() throws NullPointerException {
        System.out.println("Base: m1()");
    }
}

class Derived extends Base {
    public void m1() throws RuntimeException {
        System.out.println("Derived: m1()");
    }
}

public class test35 {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.m1();
    }
}
