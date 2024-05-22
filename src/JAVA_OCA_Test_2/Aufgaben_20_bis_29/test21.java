/*
Was wird das Ergebnis des Kompilierens und Ausführens der Testklasse sein?

Gesamterklärung
public void Test() ist eine Methode und kein Konstruktor, da der Rückgabetyp void ist.
method kann denselben Namen wie der Klassenname haben, daher gibt es keine Probleme mit der Deklaration der Test()-Methode.
------------------------------------------------------------------------------------------------------------------------
Da für diese Klasse keine Konstruktoren verfügbar sind, fügt der Java-Compiler den folgenden Konstruktor hinzu.

public Test() {}
Test obj = new Test(); Ruft den Standardkonstruktor auf,
ändert jedoch nicht den Wert der Eigenschaft name (standardmäßig wird der Eigenschaft name null zugewiesen)
------------------------------------------------------------------------------------------------------------------------
System.out.println(obj.name); gibt null aus.
* */
package JAVA_OCA_Test_2.Aufgaben_20_bis_29;

public class test21 {
    public String name;

    public void test21() {
        name = "James";
    }

    public static void main(String [] args) {
        test21 obj = new test21();
        System.out.println(obj.name);
    }
}
