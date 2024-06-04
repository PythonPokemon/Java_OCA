/*
There is a compilation error in the Student class.

Which modifications, done independently, print "James:25" on to the console?

Select 2 options.
------------------------------------------------------------------------------------------------------------------------
Correct selection
Replace Student("James", 25);  with this("James", 25);
------------------------------------------------------------------------------------------------------------------------
Correct selection
Add below code in the Student class:

void Student(String name, int age) {
     this.name = name;
     this.age = age;
}
------------------------------------------------------------------------------------------------------------------------
Replace Student("James", 25);  with this.Student("James", 25);  //<-- falsch
------------------------------------------------------------------------------------------------------------------------
Replace Student("James", 25);  with super("James", 25);     //<-- falsch
------------------------------------------------------------------------------------------------------------------------
 * */
package JAVA_OCA_Test_4.Aufgaben_50_bis_59;

class Student {
    String name;
    int age;

    Student() {                     // Konstruktor
//        Student("James", 25);     // falsch
        this("James", 25);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    void Student(String name, int age) {      //<--- auch korrekt
//        this.name = name;
//        this.age = age;
//    }
}

public class test52 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}
