/*
Analyse des Codes
------------------------------------------------------------------------------------------------------------------------
Klasse Helper:

abstract class Helper {
    int num = 100;
    String operation = null;

    protected abstract void help();

    void log() {
        System.out.println("Helper-log");
    }
}

num und operation sind Instanzvariablen.
Die help-Methode ist protected und abstrakt.
Die log-Methode ist package-private.
------------------------------------------------------------------------------------------------------------------------
Klasse LogHelper:

public class LogHelper extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";

    void help() {
        System.out.println("LogHelper-help");
    }

    void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String [] args) {
        new LogHelper().help();
    }
}

num ist private.
operation ist protected.

Die help-Methode ist package-private und überschreibt die abstrakte Methode aus Helper.
Die log-Methode ist package-private und überschreibt die Methode aus Helper.
Im main-Methodenaufruf wird help() aufgerufen.
------------------------------------------------------------------------------------------------------------------------
Optionen zur Lösung:
------------------------------------------------------------------------------------------------------------------------
1.Add the protected modifier to the log() method of Helper class:
Dies würde die log-Methode der Helper-Klasse protected machen, hat aber keine Auswirkung auf die help-Methode.
------------------------------------------------------------------------------------------------------------------------
2.Correct selection: Add the protected modifier to the help() method of LogHelper class:
Die help-Methode in LogHelper ist bereits package-private. Durch Hinzufügen des protected Modifiers
würde sich der Zugriff nicht ändern, da protected innerhalb des gleichen Pakets und von Unterklassen zugänglich ist.
Dies ist jedoch nicht notwendig für die gewünschte Ausgabe.
------------------------------------------------------------------------------------------------------------------------
3.Remove the private modifier from the num variable of LogHelper class:
Dies betrifft die num-Variable und hat keinen Einfluss auf die help-Methode oder die Ausgabe.
------------------------------------------------------------------------------------------------------------------------
4.Add the public modifier to the log() method of LogHelper class:
Dies betrifft die log-Methode und hat keinen Einfluss auf die help-Methode oder die Ausgabe.
------------------------------------------------------------------------------------------------------------------------
5.Correct selection: Add the public modifier to the help() method of LogHelper class:
Wenn die help-Methode in LogHelper public gemacht wird, wird die Sichtbarkeit der Methode erhöht.
Die Methode wird dann öffentlich zugänglich sein. Da help() bereits innerhalb der LogHelper-Klasse aufgerufen wird,
ist diese Änderung jedoch nicht zwingend notwendig.
------------------------------------------------------------------------------------------------------------------------
6.Correct selection: Remove the protected modifier from the help() method of Helper class:
Dies würde die help-Methode in Helper package-private machen.
Da LogHelper sich im selben Paket befindet, ändert sich nichts an der Sichtbarkeit.
Dies hat jedoch keine Auswirkung auf die Ausgabe.
------------------------------------------------------------------------------------------------------------------------
7.Add the protected modifier to the log() method of LogHelper class:
Dies betrifft die log-Methode und hat keinen Einfluss auf die help-Methode oder die Ausgabe.
------------------------------------------------------------------------------------------------------------------------
8.Remove the protected modifier from the operation variable of LogHelper class:
Dies betrifft die operation-Variable und hat keinen Einfluss auf die help-Methode oder die Ausgabe.
------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------
 * */
//--------------------------------------------------Falsch--------------------------------------------------------------
//abstract class Helper {
//    int num = 100;
//    String operation = null;
//
//    protected abstract void help();
//
//    void log() {
//        System.out.println("Helper-log");
//    }
//}
//
//public class LogHelper extends Helper {
//    private int num = 200;
//    protected String operation = "LOGGING";
//
//    void help() {
//        System.out.println("LogHelper-help");
//    }
//
//    void log() {
//        System.out.println("LogHelper-log");
//    }
//
//    public static void main(String [] args) {
//        new LogHelper().help();
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
// Korrektur
package JAVA_OCA_Test_2.Aufgaben_10_bis_19;

abstract class Helper {
    int num = 100; // package-private
    String operation = null; // package-private

    protected abstract void help(); // protected

    void log() { // package-private
        System.out.println("Helper-log");
    }
}

public class test17 extends Helper { // public class LogHelper
    private int num = 200; // private
    protected String operation = "LOGGING"; // protected

    public void help() { // package-private
        System.out.println("LogHelper-help");
    }

    void log() { // package-private
        System.out.println("LogHelper-log");
    }

    public static void main(String[] args) {
        new test17().help();
    }
}

//----------------------------------------------------------------------------------------------------------------------
// Korrektur
