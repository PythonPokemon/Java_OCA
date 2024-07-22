/*
diese methoden werden nur für private member benutzt, um diese mit entweder der getter methode abzurufen
oder der Instanzvariable einen neuen wert mit der setter methode zuzuweisen,
da man sonst nicht an die privaten member rankommt!
------------------------------------------------------------------------------------------------------------------------
Getter: zum abrufen der privaten Member.
Setter: um den privaten Member einen neuen Wert zuzuweisen.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Zugriffs_Modifizierer.Getter_und_Setter;

public class Person {

    // Private Felder
    private String name;
    private int alter;
    private int test;


//----------------------------------------------------------------------------------------------------------------------
    // Getter und Setter für 'name'
    // Getter: zum Abrufen der privaten Instanzvariable 'name' | String Default wert: null
    public String getName() {
        return name;
    }

    // Setter: zum Setzen, neuer Werte der privaten Instanzvariable 'name' | String Default wert: null
    public void setName(String name) {
        this.name = name;
    }

//----------------------------------------------------------------------------------------------------------------------
    // Getter und Setter für 'alter'
    // Getter: zum Abrufen der privaten Instanzvariable 'age' | String Default wert: 0
    public int getAlter() {
        return alter;
    }

    // Setter: zum Setzen, neuer Werte der privaten Instanzvariable 'age' | String Default wert: 0
    public void setAlter(int alter) {
        this.alter = alter;
    }

//----------------------------------------------------------------------------------------------------------------------
    // Main-Methode zum Testen
    public static void main(String[] args) {

        //
        Person person = new Person(); // Erstellen eines Person-Objekts | Instanz der Klasse 'Person'

        // die Instanz/Objekt-Referenz variable 'person' ruft die getter/setter methoden auf!
        // bzw. nur die setter um den privaten variablen einen neuen wert zuzuweisen mit der setter methode!
        person.setName("Alice"); // Setzen des Namens
        person.setAlter(30); // Setzen des Alters

        // Ausgabe über methodenaufruf in einer methode
        System.out.println("Name: " + person.getName()); // Abrufen des Namens
        System.out.println("Alter: " + person.getAlter()); // Abrufen des Alters

        // Ausgabe über parameter aufruf durch die Instanz
        System.out.println(person.test);
        System.out.println(person.name);
        System.out.println(person.alter);
    }
}
