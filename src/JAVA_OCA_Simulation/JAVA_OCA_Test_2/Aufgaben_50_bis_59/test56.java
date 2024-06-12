/* code 2 | im gegensatz JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_30_bis_39.test34 | Ausführliche erklärung: Aufgaben_Gegensatz_OCA

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_50_bis_59;
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

    // überschreibung der standard .equals() Methode
    public boolean equals(Object obj) {     // wahrheitswert für das obj das mit den objekten verglichen wird
        if(obj instanceof Student) {        // wenn die instanzen name, age vom Studenten
            Student stud = (Student)obj;    // stud wird Student zugewiesen obj
            if(this.name.equals(stud.name) && this.age == stud.age) {   // wenn die instanzen name gleich stud.name &&
                return true;    // wird true ausgegeben
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

        // vergleicht aufgrund der Überschriebenen .equals() Methode nicht die speicheradressen des Objekts
        // sondern die Inhalte des Objekts, indem fall name, age, wenn sie true sind, wird das objekt entfernt
        students.remove(new Student("James", 25));

        for(Student stud : students) {
            System.out.println(stud);
        }
    }
}
/*-----------------------------------------ZUSATZ_WISSEN----------------------------------------------------------------
Hier wird die equals()-Methode überschrieben,
um die Objekte basierend auf ihren Attributwerten (Name und Alter) zu vergleichen.
Dadurch werden zwei Student-Objekte als gleich betrachtet, wenn sie den gleichen Namen und dasselbe Alter haben,
unabhängig von ihrer Speicheradresse.
Daher wird das Objekt erfolgreich aus der Liste entfernt.
------------------------------------------------------------------------------------------------------------------------
 public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            if(this.name.equals(stud.name) && this.age == stud.age) { //<--überschreibung der standard .equals() Methode
                return true;
            }
        }

diese Methode überschreibt die Standardimplementierung der equals()-Methode, um anzugeben,
wann zwei Student-Objekte als gleich betrachtet werden sollen.
In diesem Fall werden zwei Student-Objekte als gleich betrachtet, wenn ihre Namen und Alter übereinstimmen.
So kann die Methode remove(Object o) der Liste korrekt feststellen, ob ein bestimmtes Student-Objekt
aus der Liste entfernt werden soll, indem sie die equals()-Methode aufruft, um Objekte zu vergleichen.
------------------------------------------------------------------------------------------------------------------------
* */