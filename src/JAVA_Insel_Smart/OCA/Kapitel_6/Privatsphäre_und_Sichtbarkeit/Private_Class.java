/*
 Wieso nicht freie Methoden und Variablen für alle?
Es ist eine gute Praxis, Attribute private zu machen und den Zugriff über Methoden zu steuern (Encapsulation):
------------------------------------------------------------------------------------------------------------------------
Kein Public Viewing – Passwörter sind privat
Ein private-Attribut oder eine private-Methode ist nur innerhalb der Klasse sichtbar:
* */
package JAVA_Insel_Smart.OCA.Kapitel_6.Privatsphäre_und_Sichtbarkeit;

// Möglichkeit 1: Initialisierung direkt bei der Deklaration
// Ein private-Attribut oder eine private-Methode ist nur innerhalb der Klasse sichtbar:-------------Von Hier-----------
class Player2 {
    // wenn nicht initialisiert, wird vom konstruktor automatisch 'null' zugewiesen
    private String password = "1234 ";        //<--- Das Ist der Unterschied


    public void displayPassword() {

        System.out.println("Das Password lautet: " + password);
    }
}
// Ein private-Attribut oder eine private-Methode ist nur innerhalb der Klasse sichtbar:--------------Bis Hier----------
//----------------------------------------------------------------------------------------------------------------------

public class Private_Class {
    public static void main(String[] args) {
        Player2 objektInstanz = new Player2();

        objektInstanz.displayPassword();

    }
}
//----------------------------------------------------------------------------------------------------------------------
// Möglichkeit 2: Initialisierung durch einen Konstruktor
//class Player2 {
//    private String password;
//
//    // Konstruktor zum Setzen des Passworts   <--- Das Ist der Unterschied
//    public Player2(String password) {
//        this.password = password;
//    }
//
//    public void displayPassword() {
//        System.out.println("Password: " + password);
//    }
//}
//
//public class Private_Class {
//    public static void main(String[] args) {
//        Player2 objektInstanz = new Player2("meinGeheimesPasswort");// Objekt/Instanz mit String Elementen
//        objektInstanz.displayPassword(); // Gibt "Password: meinGeheimesPasswort" aus
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
// Möglichkeit 3: Initialisierung durch eine Setter-Methode
//class Player2 {
//    private String password;
//
//    // Setter-Methode zum Setzen des Passworts  |<--- Das ist der Unterschied
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void displayPassword() {
//        System.out.println("Password: " + password);
//    }
//}
//
//public class Private_Class {
//    public static void main(String[] args) {
//        Player2 objektInstanz = new Player2();
//        objektInstanz.setPassword("meinGeheimesPasswort");
//        objektInstanz.displayPassword(); // Gibt "Password: meinGeheimesPasswort" aus
//    }
//}