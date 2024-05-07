/*
* Zuerst wird ein Student1-Objekt mit dem Namen "James" und 25 Punkten erstellt.
* Dann wird die review-Methode aufgerufen, wobei das student-Objekt und der Wert der marks-Variable (25) übergeben werden.
* Innerhalb der review-Methode wird der Wert von marks 25 um 10 erhöht, sodass marks jetzt 35 ist.
* Dann wird dieser Wert zur marks-Instanzvariable des student-Objekts hinzugefügt, sodass der Wert von student.marks von 25 + 35 auf 60 erhöht wird.
Schließlich wird die Ausgabe "25-60" erzeugt, wobei der Wert der marks-Variable in der main-Methode (25) und der Wert der marks-Instanzvariable des student-Objekts (60) angezeigt werden.
Also kommt das Ergebnis von 25 | 25 + 10 = 35 + 25 = 60 zustande.
*
* 25-60
* */

package JACA_OCA_Test_1.Aufgaben_30_bis_39;

class Student1 {
    String name;
    int marks;

    Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class test37 {
    public static void main(String[] args) {
        Student1 student = new Student1("James", 25);
        int marks = 25;
        review(student, marks);
        System.out.println(marks + "-" + student.marks);    // <-- was kommt raus?
    }

    private static void review(Student1 stud, int marks){
        marks = marks + 10;
        stud.marks+=marks;
    }
}
