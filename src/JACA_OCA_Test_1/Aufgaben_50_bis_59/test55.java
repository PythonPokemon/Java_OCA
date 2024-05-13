/*
* In diesem Code haben wir zwei Klassen: PenDrive und OTG. Die Klasse OTG erweitert die Klasse PenDrive.
*
* Die Klasse PenDrive hat eine Instanzvariable capacity, die die Speicherkapazität des Pen-Drives speichert.
* Der Konstruktor der Klasse PenDrive initialisiert diese Kapazität.
*
* Die Klasse OTG erweitert PenDrive und hat zusätzlich zwei Instanzvariablen: type und make, die den Typ und den Hersteller des OTG-Sticks speichern.
* Sie hat zwei Konstruktoren: Einen, der die Kapazität und den Typ initialisiert, und einen anderen, der nur den Hersteller initialisiert.
*
* In der main-Methode wird ein Objekt obj der Klasse OTG erstellt und mit einer Kapazität von 128 und dem Typ "TYPE-C" initialisiert.

Die Ausgabe wird sein: 128:TYPE-C, da wir in der main-Methode die Kapazität und den Typ des OTG-Objekts ausgeben.
* */

package JACA_OCA_Test_1.Aufgaben_50_bis_59;
class PenDrive {
    int capacity;
    PenDrive(int capacity) {
        this.capacity = capacity;
    }
}
//----------------------------------------------------------------------------------------------------------------------
class OTG extends PenDrive {
    String type;
    String make;

    OTG(int capacity, String type) {
        super(capacity);
        this.type = type;
    }

    OTG(String make) {
        super(0);
        this.make = make;
    }
}
//----------------------------------------------------------------------------------------------------------------------
public class test55 {
    public static void main(String[] args) {
        OTG obj = new OTG(128, "TYPE-C");
        System.out.println(obj.capacity + ":" + obj.type);      // <-- was kommt raus?
    }
}
