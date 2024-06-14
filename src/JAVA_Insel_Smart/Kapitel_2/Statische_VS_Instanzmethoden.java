/*
In Java müssen Methoden, die keine statischen Methoden sind, über ein Objekt der Klasse aufgerufen werden.
Dies liegt daran, dass nicht-statische Methoden (Instanzmethoden) an Instanzen der Klasse gebunden sind
und auf die Instanzvariablen und andere Instanzmethoden zugreifen können.
Um eine Instanzmethode aufzurufen, musst du daher ein Objekt der Klasse erstellen.
------------------------------------------------------------------------------------------------------------------------
Statische vs. Instanzmethoden
------------------------------------------------------------------------------------------------------------------------
1.Instanzmethoden (Nicht-statische Methoden):

Sind an eine spezifische Instanz einer Klasse gebunden.
Können auf Instanzvariablen und andere Instanzmethoden zugreifen.
Müssen über ein Objekt der Klasse aufgerufen werden.
------------------------------------------------------------------------------------------------------------------------
2.Statische Methoden:

Sind nicht an eine spezifische Instanz gebunden.
Können nur auf statische Variablen und andere statische Methoden zugreifen.
Können über den Klassennamen aufgerufen werden.
* */
package JAVA_Insel_Smart.Kapitel_2;

public class Statische_VS_Instanzmethoden {
    int instanzVariable = 42;    // Instanzvariable

    // Statische Methode | Können nur auf statische Variablen und andere statische Methoden zugreifen.
    public static void statischeMethode() {
        System.out.println("Dies ist eine statische Methode.");
        // System.out.println(instanzVariable); // Fehler: Statische Methoden können nicht auf Instanzvariablen zugreifen
    }

    // Instanzmethode | Können auf Instanzvariablen und andere Instanzmethoden zugreifen.
    public void instanzMethode() {
        System.out.println("Dies ist eine Instanzmethode.");
        System.out.println("Instanzvariable: " + instanzVariable); // Zugriff auf Instanzvariable
    }

    public static void main(String[] args) {
        // Aufruf der statischen Methode
        Statische_VS_Instanzmethoden.statischeMethode();    // ohne dummy möglich
        // Aufruf der Instanz methode
        Statische_VS_Instanzmethoden obj = new Statische_VS_Instanzmethoden(); // Dummy Objekt, voraussetzung

        // Aufruf der Instanzmethode
        obj.instanzMethode();
    }
}
