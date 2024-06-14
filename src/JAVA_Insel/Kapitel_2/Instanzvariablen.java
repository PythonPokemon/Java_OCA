/*
Lokale Variablen
Werden innerhalb von Methoden oder Blöcken deklariert.
Sind nur innerhalb ihres Gültigkeitsbereichs sichtbar.
Müssen vor der ersten Verwendung initialisiert werden.
------------------------------------------------------------------------------------------------------------------------
Instanzvariablen
Werden außerhalb von Methoden, aber innerhalb einer Klasse deklariert.
Gehören zu einer Instanz der Klasse.
Werden automatisch mit Standardwerten initialisiert (z.B. 0 für int, null für Objektreferenzen).
------------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------
* */
package JAVA_Insel.Kapitel_2;

public class Instanzvariablen {
    int instanzVariable = 20;   // Instanzvariable | in der Klasse, aber außerhalb der methode

    public void methode(){
        int lokaleVariable = 10;
        System.out.println(lokaleVariable);
        System.out.println(instanzVariable);
    }

    public static void main(String[] args){
        Instanzvariablen beispiel = new Instanzvariablen();
        beispiel.methode(); // Aufruf der Methode
    }
}
