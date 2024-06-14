/*
Verzweigung mit der if-Anweisung

Die einfachste Form der bedingten Anweisung ist die if-Anweisung, die einen Block von Anweisungen nur dann ausführt,
wenn eine Bedingung wahr ist:
* */
package JAVA_Insel_Smart.Kapitel_2;

public class IF_Anweisung_Vermehrt_Statisch {
    int zahlNormal = 10;
   static int zahlStatisch = 20;

    public static void main(String[] args) {
        int zahl = 10;

// es gehen auch mehrere if Anweisungen in der main methode, die auf die gleiche variable zugreifen
        if (zahl > 5) { // zugriff auf die lokale variable, innerhalb der methode
            System.out.println("Zahl ist größer als 5");
        }


        if (zahlStatisch > 4) {
            System.out.println("die Zahl " + zahlStatisch + " ist größer als 4");
        }


    }
}
