/*
Beim Casting in Java gibt es einige Regeln und Best Practices, die man beachten muss. Hier sind die wichtigsten Punkte:
------------------------------------------------------------------------------------------------------------------------
1. Typumwandlung (Casting) in Java
Casting ist der Prozess der Umwandlung eines Datentyps in einen anderen.
Es gibt zwei Arten von Casting:

Implizites (widening) Casting: Automatisch durchgeführt,
wenn man von einem kleineren Typ zu einem größeren Typ konvertiert (z.B. von int zu double).

Explizites (narrowing) Casting: Muss vom Programmierer manuell durchgeführt werden,
wenn man von einem größeren Typ zu einem kleineren Typ konvertiert (z.B. von double zu int).
------------------------------------------------------------------------------------------------------------------------
2. Implizites Casting (Widening)
Bei der Typumwandlung von einem kleineren zu einem größeren Typ erfolgt das Casting automatisch.
Hierbei gehen keine Informationen verloren.


int myInt = 100;
long myLong = myInt; // implizites Casting von int zu long
float myFloat = myLong; // implizites Casting von long zu float
------------------------------------------------------------------------------------------------------------------------
3. Explizites Casting (Narrowing)
Beim expliziten Casting von einem größeren zu einem kleineren Typ muss man das Casting explizit angeben,
da hierbei Informationen verloren gehen können.

double myDouble = 9.78;
int myInt = (int) myDouble; // explizites Casting von double zu int
------------------------------------------------------------------------------------------------------------------------
4. Casting von Objekten
Beim Casting von Objekten muss man sicherstellen, dass das Objekt tatsächlich in den Zieltyp konvertiert werden kann.
Andernfalls wird eine ClassCastException zur Laufzeit ausgelöst.

Animal animal = new Dog();
Dog dog = (Dog) animal; // funktioniert, weil animal tatsächlich ein Dog ist

Animal anotherAnimal = new Animal();
Dog anotherDog = (Dog) anotherAnimal; // wirft ClassCastException zur Laufzeit
------------------------------------------------------------------------------------------------------------------------
5. Die instanceof-Überprüfung
Bevor man ein Objekt castet, sollte man mit instanceof prüfen, ob das Objekt tatsächlich vom gewünschten Typ ist.

if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
} else {
    // handle the case where animal is not a Dog
}
------------------------------------------------------------------------------------------------------------------------
6. Casting von Wrapper-Klassen
Wrapper-Klassen in Java (wie Integer, Double, Float, etc.) können auch explizit gecastet werden.
Dabei gelten die gleichen Regeln wie bei primitiven Datentypen.

Integer myInteger = 10;
Double myDouble = (double) myInteger; // explizites Casting notwendig
------------------------------------------------------------------------------------------------------------------------
7. Autoboxing und Unboxing
Java unterstützt Autoboxing und Unboxing,
was das automatische Konvertieren zwischen primitiven Datentypen und ihren Wrapper-Klassen ermöglicht.

int myInt = 10;
Integer myInteger = myInt; // Autoboxing
int anotherInt = myInteger; // Unboxing
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
Implizites Casting: Von kleineren zu größeren Datentypen, erfolgt automatisch.
Explizites Casting: Von größeren zu kleineren Datentypen, muss manuell durchgeführt werden.
Objekte nur casten, wenn sicher ist, dass das Objekt tatsächlich dem Zieltyp entspricht (mithilfe von instanceof).
Beim Casting von Wrapper-Klassen die gleichen Regeln wie bei primitiven Datentypen beachten.
Autoboxing und Unboxing vereinfachen die Arbeit mit Wrapper-Klassen.

Durch die Beachtung dieser Regeln kann man sicherstellen,
dass das Casting in Java korrekt und ohne Laufzeitfehler erfolgt.
* */
package JAVA_Insel_Smart.OCA.Kapitel_2.Casting;

public class Typumwandlung_Casting {
    public static void main(String[] args) {
//  Implizites Casting (Widening) | kleineren zu einem größeren Typ | Information gehen nicht verloren
        int myInt = 100;
        long myLong = myInt; // implizites Casting von int zu long
        float myFloat = myLong; // implizites Casting von long zu float

        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);

//  Überprüfungsmethode, ob der Datentyp sich nach dem Casting verändert hat
//        System.out.println("myInt: " + myInt + " (Type: " + ((Object) myInt).getClass().getSimpleName() + ")");
//
//        long myLong = myInt; // implizites Casting von int zu long
//        System.out.println("myLong: " + myLong + " (Type: " + ((Object) myLong).getClass().getSimpleName() + ")");
//
//        float myFloat = myLong; // implizites Casting von long zu float
//        System.out.println("myFloat: " + myFloat + " (Type: " + ((Object) myFloat).getClass().getSimpleName() + ")");
//----------------------------------------------------------------------------------------------------------------------
//  Explizites Casting (Narrowing) | größeren zu einem kleineren Typ | Informationen können verloren gehen
        double myDouble = 9.78;

        int myInt2 = (int) myDouble; // explizites Casting von double zu int | Variante 1 | über den bezeichner
        int myInt3 = (int) 9.78;     //                                      | Variante 2 | über den wert
        System.out.println(myInt2);
        System.out.println(myInt3);
//----------------------------------------------------------------------------------------------------------------------
//  Casting von Wrapper-Klassen |  Integer, Double, Float, etc.) können auch explizit gecastet werden.
        Integer myInteger2 = 10;

        Double myDouble2 = (double) myInteger2; // explizites Casting notwendig
        Double myDouble3 = (double) 10;
        System.out.println(myDouble2);
        System.out.println(myDouble3);
//----------------------------------------------------------------------------------------------------------------------
//  Autoboxing und Unboxing | automatische Konvertieren zwischen primitiven Datentypen und ihren Wrapper-Klassen
        int myInt4 = 14;

        Integer myInteger4 = myInt4; // Autoboxing
        int anotherInt = myInteger4; // Unboxing

        System.out.println(myInt4);
        System.out.println(myInteger4);
        System.out.println(anotherInt);
//----------------------------------------------------------------------------------------------------------------------
//  Trainingsbereich

        System.out.println();
    }
}
