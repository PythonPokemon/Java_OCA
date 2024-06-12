/*
Der Compilerfehler in diesem Code entsteht aufgrund eines falschen Aufrufs des Konstruktors
innerhalb des Standardkonstruktors.
In Java muss ein Konstruktor, der einen anderen Konstruktor derselben Klasse aufruft, dies mit this tun,
und der Aufruf muss die erste Anweisung im Konstruktor sein.

Grund für den Fehler
Falscher Konstruktoraufruf:

In Java ruft man einen anderen Konstruktor derselben Klasse mit this auf, nicht mit dem Klassennamen.
Der Aufruf Student("James", 25); ist syntaktisch falsch. Er sollte this("James", 25); lauten.
Position des Konstruktoraufrufs:

Der Aufruf eines anderen Konstruktors muss die erste Anweisung im Konstruktor sein.
Dies ist bereits der Fall, aber die Syntax ist falsch.
* */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_30_bis_39;

//class Student {
//    String name;
//    int age;
//
//    Student() {                   // Merkmal: Konstruktor hat den gleichen Namen wie die Klasse! kein rückgabewert void
//        Student("James", 25);     // <-- Falscher Konstruktor aufruf! | this("James", 25); // Korrekte Syntax
//    }
//
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
//
//public class test39 {
//    public static void main(String[] args) {
//        Student s = new Student();
//        System.out.println(s.name + ":" + s.age);
//    }
//}
/*----------------------------------------------------------------------------------------------------------------------
Richtige Implementierung.
Um den Fehler zu beheben, sollte der Standardkonstruktor den anderen Konstruktor korrekt aufrufen:
* */
class Student {
    String name;
    int age;

    Student() {
        this("James", 25); // Korrekte Syntax
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class test39 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}
/*
Erklärung des korrigierten Codes
1.Standardkonstruktor:

Student() {
    this("James", 25); // Korrekte Syntax für den Aufruf eines anderen Konstruktors
}
Der Standardkonstruktor ruft den anderen Konstruktor mit den Argumenten "James" und 25 auf.
Dadurch werden die Felder name und age des Student-Objekts korrekt initialisiert.
------------------------------------------------------------------------------------------------------------------------
2.Parametrisierter Konstruktor:

Student(String name, int age) {
    this.name = name;
    this.age = age;
}

Dieser Konstruktor initialisiert die Felder name und age mit den übergebenen Werten.
------------------------------------------------------------------------------------------------------------------------
3.Main-Methode:

public static void main(String[] args) {
    Student s = new Student();
    System.out.println(s.name + ":" + s.age);
}

Ein Student-Objekt wird mit dem Standardkonstruktor erstellt, der den parametrierten Konstruktor aufruft.
Die Felder name und age werden auf "James" und 25 gesetzt.
Die Ausgabe ist "James:25".
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
Der Compilerfehler tritt auf, weil der Konstruktoraufruf Student("James", 25); nicht die richtige Syntax hat.
Der richtige Weg, einen anderen Konstruktor derselben Klasse aufzurufen, ist die Verwendung von this,
z.B. this("James", 25);.
Der Aufruf muss die erste Anweisung im Konstruktor sein.
* */