/*
Verzweigung mit der if-Anweisung

Die einfachste Form der bedingten Anweisung ist die if-Anweisung, die einen Block von Anweisungen nur dann ausführt,
wenn eine Bedingung wahr ist:
* */
package JAVA_Insel_Smart.OCA.Kapitel_2.IF_Else;

public class IF_Anweisung_Vermehrt_Statisch {
    // Fields
    int zahlNormal = 10; // 'nicht-Statische' Klassen variablen können nicht in methoden Blöcken aufgerufen werden!
   static int zahlStatisch = 20; // 'Statische' Klassen variablen können in methodenblöcken aufgerufen werden.


//----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) { // Methodenkörper von hier --->
        int zahl = 10;

    // es gehen auch mehrere if Anweisungen in der main methode, die auf die gleiche variable zugreifen
        if (zahl > 5) { // zugriff auf die lokale variable, nur innerhalb der methode
            System.out.println("Zahl ist größer als 5");
        }


        if (zahlStatisch > 4) {
            System.out.println("die Zahl " + zahlStatisch + " ist größer als 4");
        }


    }// Methodenkörper bis hier <---
//----------------------------------------------------------------------------------------------------------------------
}
