/*
Ja, in Java muss der Typ einer Variablen, wenn es sich um eine Referenz auf ein Objekt handelt,
immer wie der Name der Klasse sein, die die Struktur dieses Objekts definiert.
Das liegt daran, dass der Typ in Java direkt die Klasse angibt, die die Form und das Verhalten des Objekts definiert.
------------------------------------------------------------------------------------------------------------------------
Klassen und Typen in Java
------------------------------------------------------------------------------------------------------------------------
Klasse als Datentyp:
In Java definiert eine Klasse sowohl den Datentyp als auch die Struktur der Objekte dieses Typs.
------------------------------------------------------------------------------------------------------------------------
Beispiel: A a1 = new A();
------------------------------------------------------------------------------------------------------------------------
Links von der Zuweisung: (A a1) =

A: Der Typ der Variablen a1. Es bedeutet, dass a1 eine Referenz auf ein Objekt der Klasse A ist.
a1: Der Name der Variablen. Diese Variable wird verwendet, um auf das Objekt zuzugreifen.

Rechts von der Zuweisung: = (new A();

new: Das Schlüsselwort zum Erzeugen eines neuen Objekts.
A(): Der Konstruktor der Klasse A, der ein neues Objekt der Klasse A erstellt.
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
Ja, jedes Mal, wenn Sie ein neues Objekt mit new A() erstellen, wird ein Konstruktor der Klasse A aufgerufen.
Wenn Sie keinen eigenen Konstruktor definieren, stellt Java einen impliziten Standardkonstruktor bereit.
* */

package JAVA_Insel_Smart.OCA.Kapitel_1;

// Beispiel: Wenn Sie eine Klasse Person haben, dann ist Person sowohl der Name der Klasse als auch der Datentyp.
class Person extends A {
    // Klassen variable
    String name = "lola";
    String sternzeichen;
    int alter;
    static int ARBEITEN = 8;

}


class A {
    // wenn kein explizit definierter Konstruktor erstellt wird, fügt der compiler einen unsichtbaren 'Konstruktor'
    // implizit hinzu:

    // public A() {
    //        // Impliziter Standardkonstruktor, der nichts tut
    //    }
}


public class Objekt_Referenz {
    public static void main(String[] args) {
        String lokaleVariable1 = "JAVA";
        String lokaleVariable2 = "JAVA";
        String lokaleVariable3 = "JAVA";


        // man kan mehrere Objekte des gleichen Typs einer Klasse erstellen
        // das, wenn ein neues Objekt erzeugt wird, es implizit ein Konstruktor der Klasse enthält !!!
        A a1 = new A(); // Klasse vom Typ A greift mi der Referenz variable a1 auf das Objekt A zu
        A a2 = new A();
        A a3 = new A();

        // damit man ein neues Objekt vom Typ A an den Konstruktor von Person referenzieren kann,
        // muss man entweder die Klasse A an Person vererben oder eine explizite Typumwandlung vollziehen!
        A a4 = new Person(); // Erlaubt, weil Person von A erbt


//        Person p3 = new A(); // <--- warum geht das nicht?

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("\n" + "hier wird die variable a1 der variable a3 zugewiesen" + (a3 = a1));
        System.out.println(a1.equals(a2)); // false
        System.out.println(a1.equals(a3)); // true
        System.out.println(a1 == a2); // false
        System.out.println(a1 == a3); // true


        // Ganz ausgeschrieben
        // Person p = new Person();
        //-------------------------
        // oder in Einzelschritten
        Person p1; // p ist eine Referenzvariable vom Typ Person | Deklaration
        p1 = new Person(); // p wird ein neues Person-Objekt zugewiesen | Initialisierung
        p1.name = "\nDora";
        p1.ARBEITEN = 10; // neue zuweisung

        System.out.println(p1.name); // die Klassen variable '.name' wird hier als attribut übernommen und ausgedrückt
        System.out.println(p1.sternzeichen);// solange nicht initialisiert springt der konstruktor stellvertretend ein
        System.out.println(p1.alter); // 0
        System.out.println(p1.ARBEITEN);

        // Objekt 2 des Typs Person und der klasse mit standartkonstruktor Person
        Person p2 = new Person();
        p2.name = "\nSido";
        p2.sternzeichen = "Fisch";
        p2.alter = 49;

        System.out.println(p2.name);
        System.out.println(p2.sternzeichen);
        System.out.println(p2.alter);

        // Zuweisen einer lokalen Variablen an ein Feld des Objekts
        p2.name = lokaleVariable1;
        System.out.println("Name von p2 nach Zuweisung der lokalen Variable: " + p2.name);



    }
}
