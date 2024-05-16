/*
Inner Peace!

Gesamterklärung
System.out.println(neues Kind()); ruft die toString()-Methode für die Child-Instanz auf.

Die Methode der übergeordneten Klasse kann mit dem Schlüsselwort super aufgerufen werden.
Die Methode super.toString() gibt "Inner" und "Inner" zurück.concat("Frieden!") gibt "Innerer Frieden!" zurück.
 * */
package JACA_OCA_Test_2.Aufgaben_60_bis_70;

class Parent {
    public String toString() {
        return "Inner ";
    }
}

class Child extends Parent {
    public String toString() {
        return super.toString().concat("Peace!");
    }
}

public class test69 {
    public static void main(String[] args) {
        System.out.println(new Child());
    }
}
