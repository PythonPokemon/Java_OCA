/*
null0.0false0

Gesamterklärung
name, height, result und age sind Instanzvariablen der Student-Klasse. Und Instanzvariablen werden mit ihren jeweiligen Standardwerten initialisiert.
name wird mit null, age mit 0, result mit false und height mit 0,0 initialisiert.

Anweisung System.out.println(stud.name + stud.height + stud.result + stud.age); gibt null0.0false0 aus
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_40_bis_49;

class Student {
    String name;
    int age;
    boolean result;
    double height;
}

public class test42 {
    public static void main(String[] args) {
        Student stud = new Student();
        System.out.println(stud.name + stud.height + stud.result + stud.age);
    }
}
