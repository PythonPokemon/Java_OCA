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
In Java müssen Methoden, die keine statischen Methoden sind, über ein Objekt der Klasse aufgerufen werden.
Dies liegt daran, dass nicht-statische Methoden (Instanzmethoden) an Instanzen der Klasse gebunden sind
und auf die Instanzvariablen und andere Instanzmethoden zugreifen können.
Um eine Instanzmethode aufzurufen, musst du daher ein Objekt der Klasse erstellen.
//----------------------------------------------------------------------------------------------------------------------
* */
package JAVA_Insel_Smart.Kapitel_2;

// class | sind Instanzen | die darin enthaltenen variablen = sind Instanzvariablen
public class Instanzvariablen { // Das ist eine Instanz | bezeichner Instanzvariable
    int instanzVariable = 20;   // Instanzvariable | in der Klasse, aber außerhalb der methode

    public void methode(){
        int lokaleVariable = 10;    // lokale variable, innerhalb der methode
        System.out.println(lokaleVariable);
        System.out.println(instanzVariable);
    }

    public static void main(String[] args){
        Instanzvariablen beispiel = new Instanzvariablen();
        beispiel.methode(); // Aufruf der Methode

/*
Um eine Instanzvariable in einer methode aufzurufen braucht man eine dummy objekt.
Syntax: Instanzname der klasse, in der sich die Instanzvariable befindet | dummy frei namensgebung | = new Instanzname();
        dummy.methode();
* */
    }
}
