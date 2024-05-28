/* code 2 | im gegensatz package JAVA_OCA_Test_1.Aufgaben_30_bis_39.test34 | Ausführliche erklärung: Aufgaben_Gegensatz_OCA
Student[James, 27]
Student[James, 25]
Student[James, 25]
*
*Gesamterklärung
Bevor Sie diese Frage beantworten, müssen Sie wissen, dass 5 verschiedene Student-Objekte im Speicher erstellt wurden
 (4 zum Zeitpunkt des Hinzufügens zur Liste und 1 zum Zeitpunkt des Entfernens aus der Liste).

Das bedeutet, dass diese 5 Schülerobjekte an unterschiedlichen Speicheradressen gespeichert werden.

Die Methode remove(Object) entfernt das erste Vorkommen eines übereinstimmenden Objekts und die Methode equals(Object) entscheidet,
ob 2 Objekte gleich sind oder nicht. Die Methode equals(Object) wurde von der Klasse Student überschrieben und setzt das Objekt basierend auf ihrem Namen und Alter gleich.

3 übereinstimmende Studentenobjekte werden in der Liste gefunden und das 1. Listenelement wird aus der Liste entfernt. Die restlichen 3 Listenelemente werden im Insertionsauftrag gedruckt.
 * */
package JAVA_OCA_Test_2.Aufgaben_50_bis_59;
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

    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            if(this.name.equals(stud.name) && this.age == stud.age) {
                return true;
            }
        }
        return false;
    }
}

public class test56 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));

        for(Student stud : students) {
            System.out.println(stud);
        }
    }
}
