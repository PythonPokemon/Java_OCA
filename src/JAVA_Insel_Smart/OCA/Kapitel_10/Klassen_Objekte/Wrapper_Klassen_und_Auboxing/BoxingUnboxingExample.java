/*
In der Java-Programmierung beziehen sich die Begriffe "Autoboxing", "Boxing" und "Unboxing" auf die Konvertierung
zwischen primitiven Datentypen und ihren entsprechenden Wrapper-Klassen. Lassen Sie uns diese Begriffe einzeln erklären:
------------------------------------------------------------------------------------------------------------------------
Autoboxing

Autoboxing ist der automatische Prozess, bei dem der Compiler primitive Datentypen in ihre
entsprechenden Wrapper-Klassen umwandelt. Das heißt, wenn ein primitiver Datentyp (z. B. int) dort verwendet wird,
wo ein Objekt seiner Wrapper-Klasse (z. B. Integer) erwartet wird, übernimmt der Compiler automatisch die Konvertierung.

Beispiel:

int primitiveInt = 5;
Integer wrappedInt = primitiveInt;  // Autoboxing von int zu Integer
------------------------------------------------------------------------------------------------------------------------
Boxing

Boxing ist der explizite Prozess der Umwandlung eines primitiven Datentyps in eine Instanz
der entsprechenden Wrapper-Klasse.
Dies kann manuell durch den Entwickler erfolgen.

Beispiel:

int primitiveInt = 5;
Integer wrappedInt = Integer.valueOf(primitiveInt);  // Boxing von int zu In
------------------------------------------------------------------------------------------------------------------------
Unboxing

Unboxing ist der automatische Prozess, bei dem der Compiler ein Objekt einer Wrapper-Klasse in seinen entsprechenden
primitiven Datentyp umwandelt.
Das heißt, wenn ein Objekt einer Wrapper-Klasse dort verwendet wird, wo ein primitiver Datentyp erwartet wird,
übernimmt der Compiler automatisch die Konvertierung.

Beispiel:

Integer wrappedInt = 5;
int primitiveInt = wrappedInt;  // Unboxing von Integer zu int
------------------------------------------------------------------------------------------------------------------------
In diesem Beispiel werden alle Begriffe demonstriert: Autoboxing (wrappedInt), Unboxing (anotherPrimitiveInt)
und explizites Boxing (manuallyBoxedInt).
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Wrapper_Klassen_und_Auboxing;

public class BoxingUnboxingExample {
    public static void main(String[] args) {
        // Autoboxing
        int primitiveInt = 10;
        Integer wrappedInt = primitiveInt;  // Autoboxing

        // Unboxing
        int anotherPrimitiveInt = wrappedInt;  // Unboxing

        // Boxing (manuell)
        Integer manuallyBoxedInt = Integer.valueOf(primitiveInt);  // Boxing

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer (autoboxed): " + wrappedInt);
        System.out.println("Unboxed int: " + anotherPrimitiveInt);
        System.out.println("Manually Boxed Integer: " + manuallyBoxedInt);
    }
}
