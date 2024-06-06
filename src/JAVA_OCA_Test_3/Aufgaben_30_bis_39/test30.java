/*
Student[James, 25]
Student[James, 27]
Student[James, 25]
Student[James, 25]
------------------------------------------------------------------------------------------------------------------------
1. Klasse Student und equals Methode
Die equals Methode in der Klasse Student hat folgende Signatur:

public boolean equals(Student obj) {            //<---
    if (obj instanceof Student) {
        Student stud = (Student) obj;
        if (this.name.equals(stud.name) && this.age == stud.age) {
            return true;
        }
    }
    return false;
}
------------------------------------------------------------------------------------------------------------------------
Problem im Ursprünglichen Code

Falsche Signatur der equals Methode:
In Java überschreibt man die equals Methode aus der Klasse Object,
die die Signatur public boolean equals(Object obj) hat.
Im ursprünglichen Code hat die equals Methode die Signatur public boolean equals(Student obj).
Diese Signatur überschreibt nicht die equals Methode von Object.
Daher verwendet die ArrayList weiterhin die equals Methode der Object Klasse, die nur die Referenzen vergleicht,
nicht die Inhalte der Objekte.

Fehlende hashCode Methode:
Laut dem Vertrag von equals und hashCode in Java sollte jede Klasse, die equals überschreibt, auch hashCode überschreiben.
Obwohl in diesem spezifischen Beispiel hashCode nicht direkt für die remove Methode benötigt wird,
ist es eine gute Praxis, hashCode zu implementieren, um Konsistenz in Hash-basierten Sammlungen wie HashMap
oder HashSet sicherzustellen.
------------------------------------------------------------------------------------------------------------------------
Korrekturen im modifizierten Code
Hier ist der modifizierte Code mit den notwendigen Änderungen:

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student stud = (Student) obj;
            return this.name.equals(stud.name) && this.age == stud.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
------------------------------------------------------------------------------------------------------------------------
Unterschiede und Erklärungen
1. Korrekte Signatur der equals Methode:
Ursprünglich: public boolean equals(Student obj)
Modifiziert: @Override public boolean equals(Object obj)

Erklärung:
Die modifizierte Signatur public boolean equals(Object obj) überschreibt korrekt die equals Methode von Object.
Das @Override Schlüsselwort ist optional, hilft aber dabei, sicherzustellen,
dass man tatsächlich eine Methode überschreibt.

2. Implementierung der hashCode Methode:

Ursprünglich: Keine hashCode Methode implementiert.
Modifiziert: @Override public int hashCode() { return name.hashCode() + age; }

Erklärung:
Das Implementieren der hashCode Methode ist notwendig, um den Vertrag zwischen equals und hashCode in Java zu erfüllen.
Dies stellt sicher, dass Objekte, die als gleich betrachtet werden, denselben hashCode haben.
------------------------------------------------------------------------------------------------------------------------
Auswirkung auf die remove Methode
Mit diesen Änderungen funktioniert die remove Methode der ArrayList wie erwartet.
Die Methode remove verwendet die equals Methode, um das zu entfernende Objekt zu finden.
Da die equals Methode jetzt korrekt überschrieben wird, kann remove das passende Objekt finden und entfernen.

Fazit
Durch die korrekte Implementierung und Überschreibung der equals Methode sowie das Hinzufügen der hashCode Methode
stellen wir sicher, dass die remove Methode der ArrayList funktioniert.
Ohne diese Änderungen würde die remove Methode das Objekt nicht finden und entfernen können,
weil die equals Methode nicht korrekt überschrieben wurde und die Referenzvergleiche der Object Klasse verwendet wurden.
 * */
package JAVA_OCA_Test_3.Aufgaben_30_bis_39;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

    public boolean equals(Student obj) {
        if (obj instanceof Student) {
            Student stud = (Student) obj;
            if (this.name.equals(stud.name) && this.age == stud.age) {
                return true;
            }
        }
        return false;
    }
}

public class test30 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));

        for (Student stud : students) {
            System.out.println(stud);
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
/*
3. Korrekte Implementierung der equals Methode
Um den Code korrekt zu machen, sollte die equals Methode richtig überschrieben werden
und zusätzlich die hashCode Methode implementiert werden:

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student stud = (Student) obj;
            return this.name.equals(stud.name) && this.age == stud.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
------------------------------------------------------------------------------------------------------------------------
* */
// 4. Modifizierter Code
//class Student {
//    private String name;
//    private int age;
//
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student[" + name + ", " + age + "]";
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Student) {
//            Student stud = (Student) obj;
//            return this.name.equals(stud.name) && this.age == stud.age;
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return name.hashCode() + age;
//    }
//}
//
//public class test30 {
//    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("James", 25));
//        students.add(new Student("James", 27));
//        students.add(new Student("James", 25));
//        students.add(new Student("James", 25));
//
//        students.remove(new Student("James", 25));
//
//        for (Student stud : students) {
//            System.out.println(stud);
//        }
//    }
//}
