/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Klassenobjekt der Integer-Zahl 1:

Class<?> intClass = Integer.valueOf(1).getClass();
Dies gibt das Klassenobjekt der Integer-Klasse zurück.
Ausgabe: java.lang.Integer
------------------------------------------------------------------------------------------------------------------------
2.Klassenobjekt der Zeichenkette "foo":

Class<?> stringClass = "foo".getClass();
Dies gibt das Klassenobjekt der String-Klasse zurück.
Ausgabe: java.lang.String
------------------------------------------------------------------------------------------------------------------------
3.Klassenobjekt des Double-Werts 1.0:

Class<?> doubleClass = Double.valueOf(1.0).getClass();
Dies gibt das Klassenobjekt der Double-Klasse zurück.
Ausgabe: java.lang.Double
------------------------------------------------------------------------------------------------------------------------
4.Klassenobjekt des Boolean-Werts true:

Class<?> booleanClass = Boolean.valueOf(true).getClass();
Dies gibt das Klassenobjekt der Boolean-Klasse zurück.
Ausgabe: java.lang.Boolean
------------------------------------------------------------------------------------------------------------------------
5.Klassenobjekt eines benutzerdefinierten Objekts:

MyClass myObject = new MyClass();
Class<?> myClass = myObject.getClass();
Dies gibt das Klassenobjekt der benutzerdefinierten MyClass-Klasse zurück.
Ausgabe: JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.MyClass
------------------------------------------------------------------------------------------------------------------------
6.Beispiel für eine Array-Klasse:

int[] intArray = new int[10];
Class<?> arrayClass = intArray.getClass();
Dies gibt das Klassenobjekt des Arrays zurück.
Ausgabe: [I
------------------------------------------------------------------------------------------------------------------------
7.Beispiel für eine benutzerdefinierte Klasse mit Generics:

MyGenericClass<String> myGenericObject = new MyGenericClass<>();
Class<?> genericClass = myGenericObject.getClass();
Dies gibt das Klassenobjekt der generischen MyGenericClass-Klasse zurück.
Ausgabe: JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.MyGenericClass
------------------------------------------------------------------------------------------------------------------------
Beispiel für eine innere Klasse:

OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
Class<?> innerClass = innerObject.getClass();
Dies gibt das Klassenobjekt der inneren InnerClass-Klasse zurück.
Ausgabe: JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.OuterClass$InnerClass
------------------------------------------------------------------------------------------------------------------------
Fazit
Das Beispiel zeigt, wie Sie zur Laufzeit den Namen der Klasse eines Objekts in Java herausfinden können.
Dieses Wissen ist besonders nützlich für die Reflexion, Fehlerbehebung und das Verständnis der Struktur
und Organisation von Java-Klassen und -Objekten.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10;

public class KlassenobjektBeispiel {
    public static void main(String[] args) {
        // Klassenobjekt der Integer-Zahl 1 erhalten
        Class<?> intClass = Integer.valueOf(1).getClass();
        System.out.println("Integer Klasse: " + intClass.getName()); // Ausgabe: java.lang.Integer

        // Klassenobjekt der Zeichenkette "foo" erhalten
        Class<?> stringClass = "foo".getClass();
        System.out.println("String Klasse: " + stringClass.getName()); // Ausgabe: java.lang.String

        // Klassenobjekt des Double-Werts 1.0 erhalten
        Class<?> doubleClass = Double.valueOf(1.0).getClass();
        System.out.println("Double Klasse: " + doubleClass.getName()); // Ausgabe: java.lang.Double

        // Klassenobjekt des Boolean-Werts true erhalten
        Class<?> booleanClass = Boolean.valueOf(true).getClass();
        System.out.println("Boolean Klasse: " + booleanClass.getName()); // Ausgabe: java.lang.Boolean

        // Klassenobjekt eines benutzerdefinierten Objekts erhalten
        MyClass myObject = new MyClass();
        Class<?> myClass = myObject.getClass();
        System.out.println("MyClass Klasse: " + myClass.getName()); // Ausgabe: JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.MyClass

        // Beispiel für eine Array-Klasse
        int[] intArray = new int[10];
        Class<?> arrayClass = intArray.getClass();
        System.out.println("Array Klasse: " + arrayClass.getName()); // Ausgabe: [I

        // Beispiel für eine benutzerdefinierte Klasse mit Generics
        MyGenericClass<String> myGenericObject = new MyGenericClass<>();
        Class<?> genericClass = myGenericObject.getClass();
        System.out.println("MyGenericClass Klasse: " + genericClass.getName()); // Ausgabe: JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.MyGenericClass

        // Beispiel für eine innere Klasse
        OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
        Class<?> innerClass = innerObject.getClass();
        System.out.println("InnerClass Klasse: " + innerClass.getName()); // Ausgabe: JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.OuterClass$InnerClass
    }
}

// Benutzerdefinierte Klasse
class MyClass {
}

// Benutzerdefinierte generische Klasse
class MyGenericClass<T> {
}

// Beispiel für eine äußere und innere Klasse
class OuterClass {
    class InnerClass {
    }
}
