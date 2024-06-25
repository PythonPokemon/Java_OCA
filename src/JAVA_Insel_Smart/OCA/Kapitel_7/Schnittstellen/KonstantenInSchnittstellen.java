/*
Beispiel für Konstantendeklarationen bei Schnittstellen in Java
In Java können Schnittstellen Konstanten deklarieren.
Diese Konstanten sind implizit public, static, und final, was bedeutet, dass sie überall zugänglich sind,
zu einer bestimmten Schnittstelle gehören und ihren Wert nach der Initialisierung nicht ändern können.
------------------------------------------------------------------------------------------------------------------------
1.Definition der Schnittstelle mit Konstante:

Schnittstelle deklariert eine Konstante KONSTANTE mit dem Wert 42.
In Schnittstellen sind alle Felder implizit public, static, und final.
------------------------------------------------------------------------------------------------------------------------
2.Implementierung der Schnittstelle:

Implementierung ist eine Klasse, die die Schnittstelle Schnittstelle implementiert.
Die Methode printKonstante() in der Klasse Implementierung greift auf die Konstante KONSTANTE zu und gibt ihren Wert aus.
------------------------------------------------------------------------------------------------------------------------
3.Instanziierung und Zugriff auf die Konstante:

Eine Instanz der Klasse Implementierung wird erstellt.
Die Methode printKonstante() wird aufgerufen, was den Wert der Konstante KONSTANTE ausgibt.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Schnittstellen;

// Definition der Schnittstelle mit einer Konstante
interface Schnittstelle_mit_Konstante {
    // Variablen Felder/Fields
    int KONSTANTE = 42;
}

// Klasse, die die Schnittstelle implementiert
class Implementierungs_Klasse implements Schnittstelle_mit_Konstante {
    public void printKonstante() {
        // Zugriff auf die Konstante der Schnittstelle
        System.out.println("Der Wert der Konstante ist: " + KONSTANTE);
    }
}

public class KonstantenInSchnittstellen {
    public static void main(String[] args) {
        Implementierungs_Klasse obj = new Implementierungs_Klasse();
        obj.printKonstante();  // Ausgabe der Konstante
    }
}
