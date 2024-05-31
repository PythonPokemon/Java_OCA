/*
Grund für den Compiler-Fehler
Die Deklaration der Variablen i und j in der main-Methode enthält das Schlüsselwort private.
In Java sind Zugriffsmodifizierer (private, protected, public) nur in Klassen-, Instanz-
oder statischen Variablen sowie Methoden erlaubt, aber nicht innerhalb von Methodenblöcken für lokale Variablen.

Fazit
Der Compiler-Fehler tritt auf, weil in Java lokale Variablen innerhalb von Methodenblöcken
keine Zugriffsmodifizierer wie private, protected oder public haben dürfen.
 * */
//package JAVA_OCA_Test_3.Aufgaben_10_bis_19;
//
//class Rectangle {
//    private int height;
//    private int width;
//
//    public Rectangle(int height, int width) {
//        this.height = height;
//        this.width = width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//}
//
//public class test14 {
//    public static void main(String[] args) {
//        private int i = 100;    //  zugriffsmodifizierer weglassen | ist innerhalb verboten!
//        private int j = 200;
//        Rectangle rect = new Rectangle(i, j);
//        System.out.println(rect.getHeight() + ", " + rect.getWidth());
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
package JAVA_OCA_Test_3.Aufgaben_10_bis_19;

class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

public class test14 {
    public static void main(String[] args) {
        int i = 100;  //  modifier entfernt
        int j = 200;  //  modifier entfernt
        Rectangle rect = new Rectangle(i, j);
        System.out.println(rect.getHeight() + ", " + rect.getWidth());
    }
}
