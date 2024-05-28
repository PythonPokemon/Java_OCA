package Good_To_Know_Goody;
import java.util.ArrayList;
import java.util.List;

//public class Vergleichs_Methoden {
//    public static void main(String[] args) {
//        StringBuilder sb1 = new StringBuilder("Hello");
//        StringBuilder sb2 = new StringBuilder("Hello");
//
//        // Vergleich mit == (Referenzvergleich)
//        System.out.println(sb1 == sb2); // false, weil sb1 und sb2 verschiedene Objekte sind
//
//        // Vergleich mit equals() (Standardimplementierung in StringBuilder verwendet ==)
//        System.out.println(sb1.equals(sb2)); // false, weil equals() in StringBuilder nicht überschrieben wurde und == verwendet
//
//        // Hinzufügen von sb1 zur Liste
//        List<StringBuilder> list = new ArrayList<>();
//        list.add(sb1);
//
//        // Überprüfen, ob die Liste ein Objekt enthält, das inhaltlich gleich sb2 ist
//        System.out.println(list.contains(sb2)); // false, weil contains() equals() verwendet und StringBuilder equals() nicht überschreibt
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
/*                          .contains() <---Methode im Vergleich zu ---> e.quals()

Um contains() zum Vergleichen von inhaltlich gleichen Objekten zu verwenden,
musst du equals() in der entsprechenden Klasse überschreiben:
* */
class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}

public class Vergleichs_Methoden {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));

        Student target = new Student("James", 25);
        System.out.println(students.contains(target)); // true, weil equals() überschrieben wurde und inhaltlichen Vergleich durchführt
    }
}
/*
In diesem Beispiel wird equals() überschrieben, um einen inhaltlichen Vergleich der Student-Objekte zu ermöglichen.
Dadurch funktioniert contains() wie erwartet und findet ein inhaltlich gleiches Objekt in der Liste.
* */