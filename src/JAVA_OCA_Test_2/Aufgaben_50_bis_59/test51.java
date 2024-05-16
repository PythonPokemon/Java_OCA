/*
 * Kompilierungsfehler für den Child(int, int)-Konstruktor
 * ---------------------------------------------------------------------------------------------------------------------
 * Gesamterklärung
super(); inside Parent(int)-Konstruktor ruft den no-arg-Konstruktor der Object-Klasse auf und daher keinen Kompilierungsfehler für den Parent(int)-Konstruktor.

super(0); inside Child(int)-Konstruktor ruft den Parent(int)-Konstruktor auf, der verfügbar ist und daher keine Probleme bereitet.

Der Child(int, int)-Konstruktor verfügt sowohl über super(i)- als auch über this(j)-Anweisungen.
* Ein Konstruktor sollte super(...) oder this(...) haben, aber nicht beides. Daher verursacht Child(int, int) einen Kompilierungsfehler.

Da alle Klassen in Test.java Datei unter dem Paket com.udayan.oca.test definiert sind, geben child.i und child.j keinen Kompilierungsfehler aus. i und j werden mit dem Paketbereich deklariert.
 * */
package JAVA_OCA_Test_2.Aufgaben_50_bis_59;

//class Parent {
//    int i = 10;
//    Parent(int i) {
//        super();
//        this.i = i;
//    }
//}
//
//class Child extends Parent {
//    int j = 20;
//
//    Child(int j) {
//        super(0);
//        this.j = j;
//    }
//
//    Child(int i, int j) {
//        super(i);
//        this(j);    // korrekt wär | this.j =j;
//    }
//
//}
//
//public class test51 {
//    public static void main(String[] args) {
//        Child child = new Child(1000, 2000);
//        System.out.println(child.i + ":" + child.j);
//    }
//}
