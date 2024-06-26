/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Definition der lokalen Klasse:

Die Klasse LocalClass wird innerhalb der Methode display definiert.
LocalClass kann auf die lokale Variable message zugreifen, da diese als final deklariert ist.
Instanziierung und Verwendung der lokalen Klasse:

Eine Instanz von LocalClass wird innerhalb der Methode display erstellt und ihre Methode printMessage wird aufgerufen.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_9.Lokale_Klassen;

public class LokaleKlasseBeispiel {
//----------------------------------------------------------------------------------------------------------------------
   // Methode mit einer lokalen klasse
    void display() {
        final String message = "Hallo aus der lokalen Klasse!";

        // lokale klasse ist innerhalb der methode
        class LocalClass {
            void printMessage() {
                System.out.println(message);
            }
        }

        // ObjektInstanz der lokalen Klasse
        LocalClass localClass = new LocalClass();
        localClass.printMessage(); // Instaz ruf die methode auf mit dem finalen aurgumend aus der methode '.display()'
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        // das hier! aus der main methode wird der gesamte code ausgegeben!!!
        // ohne diese Instanz könnte oben die methoe auf die lokale klasse nicht zu aufrufen und die methode ausführen!
        LokaleKlasseBeispiel objInstanz = new LokaleKlasseBeispiel();
        objInstanz.display();
    }
}
