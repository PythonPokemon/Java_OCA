/*
* In diesem Code wird eine Klasse Student definiert, die zwei Instanzvariablen name und age hat. Es gibt zwei Methoden mit dem Namen Student.
* Eine Methode hat keinen Rückgabetyp und wird als Konstruktor verwendet, aber da sie denselben Namen wie die Klasse hat, wird sie nicht als Konstruktor erkannt.
* Die andere Methode hat dieselbe Signatur wie ein Konstruktor, aber da sie einen Rückgabetyp hat, wird sie als gewöhnliche Methode betrachtet.
*
* Wenn Sie eine Instanz von Student erstellen, wird der Standardkonstruktor aufgerufen, der keine Argumente hat.
* Dieser Konstruktor ruft die Methode Student() auf, nicht den anderen Konstruktor. Die Methode Student() setzt name und age auf "James" und 25.
* Da diese Methode jedoch nicht als Konstruktor erkannt wird, werden name und age nicht initialisiert, wenn die Instanz erstellt wird.
* Daher haben name und age die Standardwerte null und 0.
*
* Um dieses Problem zu beheben, sollten Sie die Methode Student() in einen Konstruktor umwandeln, indem Sie den Rückgabetyp entfernen:
*
* Student() {
    this("James", 25);
}

* */

package JAVA_OCA_Test_1.Aufgaben_60_bis_69;

class Student {
    String name;
    int age;

    void Student() {
        Student("James", 25);
    }

    void Student(String name, int age) {
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
