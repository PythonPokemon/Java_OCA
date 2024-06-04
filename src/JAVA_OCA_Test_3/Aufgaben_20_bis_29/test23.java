/*
schau die datei Apple
an.

 * */
package JAVA_OCA_Test_3.Aufgaben_20_bis_29;

public class test23 {   // öffentliche KLasse
    public String color;

    public test23(String color){    // öffentlicher Konstruktor
        this.color = color;         // deklaration und initialisierung von Instanzvariablen im Konstruktor
    }

    public static void main(String[] args) {
        test23 obj = new test23("GREEN");
        System.out.println(obj.color);
    }
}
