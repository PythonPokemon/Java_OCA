/*
Student[James, 25]
Student[James, 27]
Student[James, 25]
Student[James, 25]

Gesamterklärung
Bevor Sie diese Frage beantworten, müssen Sie wissen, dass 5 verschiedene Student-Objekte im Speicher erstellt wurden
 (4 zum Zeitpunkt des Hinzufügens zur Liste und 1 zum Zeitpunkt des Entfernens aus der Liste).
 Das bedeutet, dass diese 5 Schülerobjekte an unterschiedlichen Speicheradressen gespeichert werden.

remove(Object)-Methode entfernt das erste Vorkommen eines übereinstimmenden Objekts und die equals(Object)-Methode entscheidet,
ob 2 Objekte gleich sind oder nicht. equals(Object)-Methode wurde NICHT von der Student-Klasse überschrieben.
Tatsächlich ist equals(Student) überladen. Die überladene Version wird jedoch nicht aufgerufen, während die Student-Objekte gleichgesetzt werden.

Die in der Klasse Object definierte Methode equals(Object) wird aufgerufen und die in der Klasse Object definierte Methode equals(Object)
verwendet den Operator ==, um die Gleichheit zu überprüfen, und in diesem Fall,
a alle Student-Objekte an unterschiedlichen Speicherorten gespeichert sind, sind sie daher nicht gleich.

Es wird nichts aus der Schülerliste entfernt, alle 4 Schülerobjekte werden in der Einfügereihenfolge gedruckt.

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
