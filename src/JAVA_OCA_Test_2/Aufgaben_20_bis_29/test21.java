/*
* Was wird das Ergebnis des Kompilierens und Ausführens der Testklasse sein?
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
