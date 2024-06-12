/*
Im vorliegenden Codebeispiel tritt das Ergebnis null auf, weil der Konstruktor nicht korrekt definiert wurde.
Stattdessen ist eine Methode mit dem gleichen Namen wie die Klasse vorhanden, aber ohne den Konstruktorcharakter.
------------------------------------------------------------------------------------------------------------------------
Erklärung
Felddeklaration:

public String name;
Das Feld name wird als öffentliches Instanzfeld der Klasse test21 deklariert.
------------------------------------------------------------------------------------------------------------------------
Methodendeklaration:

public void test21() {
    name = "James";
}
Diese Methode sieht aus wie ein Konstruktor, ist aber keiner.
Ein Konstruktor hat keinen Rückgabewert, nicht einmal void.
Da hier void angegeben ist, wird diese Methode als normale Methode behandelt, die nur aufgerufen wird,
wenn sie explizit im Code aufgerufen wird.
------------------------------------------------------------------------------------------------------------------------
Main-Methode:

public static void main(String [] args) {
    test21 obj = new test21();
    System.out.println(obj.name);
}

Hier wird ein neues Objekt obj der Klasse test21 erstellt.
Der Standardkonstruktor (der automatisch generiert wird, wenn kein Konstruktor definiert ist) wird aufgerufen,
jedoch nicht die Methode test21(), die den Namen setzen würde.
Da das Feld name nie initialisiert wird, bleibt es beim Standardwert für Strings, der null ist.
------------------------------------------------------------------------------------------------------------------------
Ergebnis
Die Ausgabe null entsteht, weil die Methode test21() nicht automatisch aufgerufen wird.
Stattdessen wird der automatisch generierte Standardkonstruktor verwendet, der das Feld name nicht initialisiert.
------------------------------------------------------------------------------------------------------------------------
System.out.println(obj.name); gibt null aus.
* */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_20_bis_29;

public class test21 {
    public String name;

    // Dies ist keine Konstruktor-Methode, sondern eine normale Methode
    public void test21() {
        name = "James";
    }

    public static void main(String [] args) {
        test21 obj = new test21();
        System.out.println(obj.name);
    }
}
//----------------------------------------------------------------------------------------------------------------------
/*
Korrektur des Codes
Um das gewünschte Verhalten zu erreichen und den Namen auf "James" zu setzen,
müssen wir den Konstruktor korrekt definieren.
Hier ist der korrigierte Code:
* */

//public class test21 {
//    public String name;
//
//    // Richtiger Konstruktor ohne Rückgabewert
//    public test21() {
//        name = "James";
//    }
//
//    public static void main(String [] args) {
//        test21 obj = new test21();
//        System.out.println(obj.name);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
/*
Erklärung der Korrektur
Konstruktor:

public test21() {
    name = "James";
}

Der Konstruktor hat keinen Rückgabewert und wird automatisch aufgerufen,
wenn ein neues Objekt der Klasse test21 erstellt wird.

Mit dieser Änderung wird beim Erstellen des Objekts obj der Konstruktor aufgerufen, der das Feld name auf "James" setzt.
Daher wird die Ausgabe "James" sein.
* */