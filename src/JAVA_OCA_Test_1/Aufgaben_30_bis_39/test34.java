/* code 1 | gegensatz package JAVA_OCA_Test_2.Aufgaben_50_bis_59.test56 | Ausführliche erklärung: Aufgaben_Gegensatz_OCA

 * In Java entspricht der Standardverhalten der remove-Methode für Listen nicht dem, was Sie möglicherweise erwarten.
 * Die remove-Methode entfernt ein Objekt aus der Liste basierend auf seiner Referenz. Sie vergleicht nicht die inhaltlichen Werte der Objekte.
 *
 * Wenn Sie students.remove(new Student("James", 25)); aufrufen, erstellt Java ein neues Student-Objekt mit den gleichen Attributen ("James" und 25),
 *  aber das ist nicht das gleiche Objekt, das Sie zuvor der Liste hinzugefügt haben.
 * Diese beiden Objekte haben unterschiedliche Speicheradressen und werden daher als unterschiedliche Objekte betrachtet.
 *
 * Um das gewünschte Verhalten zu erreichen und das Objekt zu entfernen, das denselben Namen und dasselbe Alter hat,
 * müssen Sie eine benutzerdefinierte Logik implementieren, um die Objekte in der Liste zu vergleichen und das entsprechende Objekt zu entfernen.
 * */

package JAVA_OCA_Test_1.Aufgaben_30_bis_39;
import java.util.ArrayList;
import java.util.List;

// Variante 1 | zum Testen auskommentieren

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
}


public class test34 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));  //  listen Eintrag, wird zuerst erstellt und anschließend gelöscht


        for (Student stud : students) {
            System.out.println(stud);   // Was kommt raus?
        }
    }
}

//----------------------------------------------------------------------------------------------------------------------
/*
* Erklärung
* equals() und hashCode() Methoden:
*
* Diese Methoden wurden in der Student-Klasse überschrieben, um Objekte auf Basis ihrer Attribute zu vergleichen.
* Dies ermöglicht die Verwendung von lastIndexOf und remove mit Student-Objekten.
*
* lastIndexOf Methode:
* lastIndexOf wird verwendet, um den Index des letzten Vorkommens eines bestimmten Elements in der Liste zu finden.
* Wenn das Element gefunden wird (lastIndex != -1), wird es mit remove aus der Liste entfernt.
* */


// Variante 2 | zum Testen auskommentieren
//class Student {
//    private String name;
//    private int age;
//
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String toString() {
//        return "Student[" + name + ", " + age + "]";
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//
//        Student student = (Student) obj;
//
//        if (age != student.age) return false;
//        return name != null ? name.equals(student.name) : student.name == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + age;
//        return result;
//    }
//}
//
//public class test34 {
//    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("James", 25));
//        students.add(new Student("James", 27));
//        students.add(new Student("James", 25));
//        students.add(new Student("James", 25));
//
//        // Entferne den letzten Eintrag mit dem Namen "James" und Alter 25
//        Student target = new Student("James", 25);
//        int lastIndex = students.lastIndexOf(target);
//        if (lastIndex != -1) {
//            students.remove(lastIndex);
//        }
//
//        for (Student stud : students) {
//            System.out.println(stud);  // Ausgabe
//        }
//    }
//}

//----------------------------------------------------------------------------------------------------------------------
/*
* Wenn Sie ein Element aus einer Liste entfernen möchten, indem Sie seinen Wert vergleichen,
* müssen Sie explizit den Wert des Elements angeben, den Sie entfernen möchten.
*
* In Ihrem Fall bedeutet das, dass Sie eine Schleife verwenden müssen, um durch die Liste zu iterieren
* und jedes Student-Objekt darauf zu überprüfen, ob es den gleichen Namen und das gleiche Alter wie das zu entfernende Student-Objekt hat.
* Wenn ja, können Sie es aus der Liste entfernen.

Hier ist ein Beispiel, wie Sie das tun könnten:
* Hier wird jedes Student-Objekt in der Liste überprüft,
* und wenn es den gleichen Namen und das gleiche Alter wie das zu entfernende Student-Objekt hat, wird es aus der Liste entfernt.
* */

// Variante 3 | zum Testen auskommentieren

//class Student {
//    private String name;
//    private int age;
//
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {   //get ist pflicht da die klasse mit den Eigenschaften auf privat gesetzt ist!
//        return name;
//    }
//
//    public int getAge() {       //get ist pflicht da die klasse mit den Eigenschaften auf privat gesetzt ist!
//        return age;
//    }
//
//    public String toString() {
//        return "Student[" + name + ", " + age + "]";
//    }
//}
//
//
//public class test34 {
//    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("James", 25));
//        students.add(new Student("James", 27));
//        students.add(new Student("James", 25));
//        students.add(new Student("James", 25));
//
//        // Elemente mit dem Namen "James" und dem Alter 25 entfernen
//        String nameToRemove = "James";
//        int ageToRemove = 25;
//        Iterator<Student> iterator = students.iterator();
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            if (student.getName().equals(nameToRemove) && student.getAge() == ageToRemove) {
//                iterator.remove();
//            }
//        }
//
//        for (Student stud : students) {
//            System.out.println(stud);       // <-- was kommt raus?
//        }
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
