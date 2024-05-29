/*
Der gegebene Code führt zu dem Ergebnis null:0, weil die Konstruktoren in der Student-Klasse nicht korrekt definiert sind.
------------------------------------------------------------------------------------------------------------------------
Analyse des Codes
1.Definition der Student-Klasse:
Die Klasse Student hat zwei Felder: String name und int age.
Es gibt zwei Methoden namens Student, aber sie sind keine Konstruktoren, weil sie einen Rückgabewert vom Typ void haben.

2.Methoden Student:
void Student(): Diese Methode sieht wie ein Standardkonstruktor aus,
ist aber tatsächlich eine normale Methode aufgrund des Rückgabetyps void.
void Student(String name, int age): Diese Methode sieht wie ein überladener Konstruktor aus,
ist aber ebenfalls eine normale Methode aufgrund des Rückgabetyps void.

3.Instanziierung der Student-Klasse:
Im main-Method wird ein Student-Objekt s mit dem Standardkonstruktor new Student() erstellt.
Da keine Konstruktoren korrekt definiert sind, wird der vom Compiler generierte Standardkonstruktor verwendet. Dieser setzt name auf null und age auf 0.

4.Ausgabe der Felder name und age:
System.out.println(s.name + ":" + s.age);: Da name null und age 0 sind, wird null:0 ausgegeben.
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
Die Methoden Student sind keine Konstruktoren, weil sie einen Rückgabewert vom Typ void haben.
Der Compiler generiert einen Standardkonstruktor, da keine gültigen Konstruktoren vorhanden sind.
Die Felder name und age werden auf ihre Standardwerte null und 0 gesetzt.
Die Ausgabe null:0 ist das Ergebnis der Standardwerte dieser Felder.
* */

package JAVA_OCA_Test_1.Aufgaben_60_bis_69;

class Student {
    String name;
    int age;


    void Student() {                       // ohne void
        Student("James", 25);   // Student falsch | this("James", 25)
    }

    void Student(String name, int age) {   // ohne void
        this.name = name;
        this.age = age;
    }
}

public class test62 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}
//----------------------------------------------------------------------------------------------------------------------
/*
Korrektur des Codes
Um das gewünschte Verhalten zu erreichen, sollten die Methoden Student zu echten Konstruktoren gemacht werden,
indem der Rückgabewert entfernt wird:
* */
//class Student {
//    String name;
//    int age;
//
//    // Korrekt definierter Standardkonstruktor
//    Student() {
//        this("James", 25);
//    }
//
//    // Korrekt definierter überladener Konstruktor
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
//
//public class test62 {
//    public static void main(String[] args) {
//        Student s = new Student();
//        System.out.println(s.name + ":" + s.age);
//    }
//}
