/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Integer Klasse:

Integer num = 42;
Class<?> intClass = num.getClass();
Ausgabe: java.lang.Integer
------------------------------------------------------------------------------------------------------------------------
2.Double Klasse:

Double decimal = 3.14;
Class<?> doubleClass = decimal.getClass();
Ausgabe: java.lang.Double
------------------------------------------------------------------------------------------------------------------------
3.String Klasse:

String text = "Hallo Welt";
Class<?> stringClass = text.getClass();
Ausgabe: java.lang.String
------------------------------------------------------------------------------------------------------------------------
4.Boolean Klasse:

Boolean bool = true;
Class<?> booleanClass = bool.getClass();
Ausgabe: java.lang.Boolean
------------------------------------------------------------------------------------------------------------------------
5.Benutzerdefinierte Klasse:

MyClass myObject = new MyClass();
Class<?> myClass = myObject.getClass();
Ausgabe: JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.MyClass
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
Dieser einfache Code zeigt, wie Sie den Namen der Klasse zur Laufzeit herausfinden können,
indem Sie die Methode getClass() verwenden.
Dies ist nützlich für die Reflexion und das Verständnis der Typen der Objekte, mit denen Sie arbeiten.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10;

public class KlassenBeispiel_Einfach {
    public static void main(String[] args) {
        // Beispiele für grundlegende Klassen

        // Integer Klasse
        Integer num = 42;
        Class<?> intClass = num.getClass();
        System.out.println(intClass.getName()); // Ausgabe: java.lang.Integer

        // Double Klasse
        Double decimal = 3.14;
        Class<?> doubleClass = decimal.getClass();
        System.out.println(doubleClass.getName()); // Ausgabe: java.lang.Double

        // String Klasse
        String text = "Hallo Welt";
        Class<?> bezeichner1 = text.getClass();
        System.out.println(bezeichner1.getName()); // Ausgabe: java.lang.String

        // Boolean Klasse
        Boolean bool = true;
        Class<?> booleanClass = bool.getClass();
        System.out.println(booleanClass.getName()); // Ausgabe: java.lang.Boolean

        // Benutzerdefinierte Klasse
        MyClass1 myObject = new MyClass1();
        Class<?> myClass = myObject.getClass();
        System.out.println(myClass.getName()); // Ausgabe: JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.MyClass
    }
}

// Benutzerdefinierte Klasse
class MyClass1 {
}
