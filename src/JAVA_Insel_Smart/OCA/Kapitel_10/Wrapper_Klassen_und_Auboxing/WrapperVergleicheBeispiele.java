/*
Wrapper-Klassen bieten verschiedene Methoden zur Durchführung von Vergleichen
------------------------------------------------------------------------------------------------------------------------
Wrapper-Klassen in Java bieten mehrere Methoden zur Durchführung von Vergleichen,
einschließlich compareTo(), equals(), und hashCode(). Diese Methoden sind nützlich,
um Werte zu vergleichen und für die Verwendung in Datenstrukturen wie HashMaps und HashSets.
------------------------------------------------------------------------------------------------------------------------
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Erzeugen von Integer-Wrapper-Objekten: Wir erstellen mehrere Integer-Wrapper-Objekte.

Integer i1 = 42;
Integer i2 = 42;
Integer i3 = 100;
------------------------------------------------------------------------------------------------------------------------
2.Verwendung der compareTo-Methode: Diese Methode vergleicht das aktuelle Objekt mit dem angegebenen Objekt.

int result1 = i1.compareTo(i2); ergibt 0, da beide Werte gleich sind.
int result2 = i1.compareTo(i3); ergibt -1, da 42 < 100.
------------------------------------------------------------------------------------------------------------------------
3.Verwendung der equals-Methode: Diese Methode überprüft, ob das aktuelle Objekt gleich dem angegebenen Objekt ist.

boolean isEqual1 = i1.equals(i2); ergibt true, da beide Werte gleich sind.
boolean isEqual2 = i1.equals(i3); ergibt false, da 42 ungleich 100 ist.
------------------------------------------------------------------------------------------------------------------------
4.Verwendung der hashCode-Methode: Diese Methode gibt den Hashcode des Werts zurück.

int hash = i1.hashCode(); ergibt den Hashcode des Integer-Werts 42.
------------------------------------------------------------------------------------------------------------------------
5.Ausgabe der Ergebnisse: Wir geben die Ergebnisse der Vergleiche und den Hashcode aus.

System.out.println("Vergleich von i1 und i2 mit compareTo: " + result1); gibt 0 aus.
System.out.println("Vergleich von i1 und i3 mit compareTo: " + result2); gibt -1 aus.
System.out.println("i1 gleich i2 mit equals: " + isEqual1); gibt true aus.
System.out.println("i1 gleich i3 mit equals: " + isEqual2); gibt false aus.
System.out.println("Hashcode von i1: " + hash); gibt 42 aus.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Wrapper_Klassen_und_Auboxing;

public class WrapperVergleicheBeispiele {
    public static void main(String[] args) {
        // Erzeugen von Integer-Wrapper-Objekten
        Integer i1 = 42;
        Integer i2 = 42;
        Integer i3 = 100;

        // Verwendung der compareTo-Methode
        int result1 = i1.compareTo(i2);  // 0, da beide Werte gleich sind
        int result2 = i1.compareTo(i3);  // -1, da 42 < 100

        // Verwendung der equals-Methode
        boolean isEqual1 = i1.equals(i2);  // true
        boolean isEqual2 = i1.equals(i3);  // false

        // Verwendung der hashCode-Methode
        int hash = i1.hashCode();  // Hashcode des Werts

        // Ausgabe der Ergebnisse
        System.out.println("Vergleich von i1 und i2 mit compareTo: " + result1);  // 0
        System.out.println("Vergleich von i1 und i3 mit compareTo: " + result2);  // -1
        System.out.println("i1 gleich i2 mit equals: " + isEqual1);  // true
        System.out.println("i1 gleich i3 mit equals: " + isEqual2);  // false
        System.out.println("Hashcode von i1: " + hash);  // 42 (Hashcode von Integer 42)
    }
}
