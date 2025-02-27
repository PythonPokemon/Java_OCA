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
!!!
nichtstatische Methoden können auf statische Methoden und statische Variablen zugreifen.
------------------------------------------------------------------------------------------------------------------------
2.Statische Methoden:

Sind nicht an eine spezifische Instanz gebunden.
Können nur auf statische Variablen und andere statische Methoden zugreifen.
Können über den Klassennamen aufgerufen werden.
* */
package JAVA_Insel_Smart.OCA.Kapitel_2;

public class StatischeMethode_VS_InstanzMethoden {
    int instanzVariable = 42;    // Instanzvariable oder auch klassen variable Field genannt

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
        StatischeMethode_VS_InstanzMethoden.statischeMethode();    // ohne dummy möglich
        // Aufruf der Instanz methode
        StatischeMethode_VS_InstanzMethoden obj = new StatischeMethode_VS_InstanzMethoden(); // Dummy Objekt, voraussetzung
        // var ist ein equivalent das automatching durchführt
        var obj2 = new StatischeMethode_VS_InstanzMethoden();

        // Aufruf der Instanzmethode
        obj.instanzMethode();
        obj2.instanzMethode();
    }
}
