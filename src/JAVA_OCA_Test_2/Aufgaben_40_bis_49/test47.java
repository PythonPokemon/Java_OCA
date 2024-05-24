/*
Grund des Fehlers
Keine Vererbung oder Implementierung: In dem gegebenen Code erbt die Klasse Car nicht von der Klasse Vehicle.
Dies bedeutet, dass Car und Vehicle zwei völlig separate und unabhängige Klassen sind.
Da es keine Beziehung zwischen diesen beiden Klassen gibt,
kann ein Objekt der Klasse Car nicht einem Referenztyp der Klasse Vehicle zugewiesen werden.
Daher ist Vehicle obj = new Car(); Verursacht Kompilierungsfehler.
 * */
package JAVA_OCA_Test_2.Aufgaben_40_bis_49;

//class Vehicle {
//    public int getRegistrationNumber() {
//        return 1;
//    }
//}
//
//class Car {
//    public int getRegistrationNumber() {
//        return 2;
//    }
//}
//
//public class test47 {
//    public static void main(String[] args) {
//        Vehicle obj = new Car();                              //<-- fehler da keine Vererbung
//        System.out.println(obj.getRegistrationNumber());
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
/*
Korrektur des Codes
Um den Code zu korrigieren und das gewünschte Verhalten zu erreichen, musst du sicherstellen,
dass die Klasse Car von der Klasse Vehicle erbt.

Hier ist die korrigierte Version des Codes:
* */
class Vehicle {
    public int getRegistrationNumber() {
        return 1;
    }
}

class Car extends Vehicle {
    @Override
    public int getRegistrationNumber() {
        return 2;
    }
}

public class test47 {
    public static void main(String[] args) {
        Vehicle obj = new Car();
        System.out.println(obj.getRegistrationNumber());
    }
}
/*
Ergebnis
In diesem korrigierten Code:
Vererbung: Die Klasse Car erbt von der Klasse Vehicle durch extends Vehicle.
Methodenüberschreibung: Die Methode getRegistrationNumber wird in der Klasse Car überschrieben.

Ausführung
Polymorphismus: Da Car von Vehicle erbt, kann ein Objekt der Klasse Car einer Referenz vom Typ Vehicle zugewiesen werden.
Methodenaufruf: Wenn obj.getRegistrationNumber() aufgerufen wird,
wird die überschreibende Methode in der Klasse Car ausgeführt, da das tatsächliche Objekt vom Typ Car ist.

Ergebnis des korrigierten Codes
Der korrigierte Code wird 2 ausgeben, da die Methode getRegistrationNumber in der Klasse Car überschrieben wird
und die Methode der abgeleiteten Klasse (also Car) aufgerufen wird.

2
Zusammenfassung
Ursprünglicher Fehler: Keine Beziehung zwischen Vehicle und Car, daher ein Kompilierungsfehler.
Korrektur: Die Klasse Car erbt von der Klasse Vehicle und überschreibt die Methode getRegistrationNumber.
Ergebnis: Der Code kompiliert und gibt die erwartete Ausgabe 2 aus.
* */