/*
* Es wird eine Klasse Message definiert, die eine Instanzvariable msg hat, die auf "Happy New Year" initialisiert ist.
* Die Methode print() gibt den Wert von msg aus.
*
* In der test41-Klasse wird eine Methode change(Message m) definiert. Diese Methode erhält ein Message-Objekt als Parameter.
* Innerhalb der Methode wird ein neues Message-Objekt erstellt und der Instanzvariable msg der Wert "Happy Holidays!" zugewiesen.
* Beachten Sie jedoch, dass diese Änderung nur das lokale Message-Objekt m betrifft und nicht das ursprüngliche Message-Objekt, das an die Methode übergeben wurde.
*
* Im main()-Methode wird ein neues Message-Objekt obj erstellt und die Methode print() aufgerufen, was zur Ausgabe von "Happy New Year" führt.
*-----------------------------------------------------------------------------------------------------------------------
* Dann wird die Methode change(obj) aufgerufen.
* Hier wird obj, das an die Methode übergeben wird, an die lokale Variable m gebunden.
* Innerhalb der Methode wird m auf ein neues Message-Objekt gesetzt und der Wert von msg auf "Happy Holidays!" geändert.
* Da jedoch nur die lokale Variable m geändert wird, hat dies keine Auswirkungen auf das ursprüngliche obj.
*-----------------------------------------------------------------------------------------------------------------------
* Schließlich wird die Methode print() erneut aufgerufen, und da obj unverändert bleibt, wird "Happy New Year" erneut ausgegeben.
* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_40_bis_49;

class Message {
    String msg = "Happy New Year";

    public void print() {
        System.out.println(msg);        // <-- hier kann nichts ausgegeben werden, weil es nicht die main methode ist!
    }
}

public class test41 {
    public static void change(Message m) {
        m = new Message();              // erstellt eine neue Message Methode
        m.msg = "Happy Holidays!";      // ändert die lokale variable innerhalb dieser Message Methode
    }


    public static void main(String[] args) {
        Message obj = new Message();
        obj.print();                    // gibt tatsächlich
        change(obj);                    // change hat hier keine änderung auf die ausgabe!
        obj.print();
    }
}
//------------------------------------------------ACHTUNG WICHTIG-------------------------------------------------------
/*
* In Java bezieht sich der Begriff "Instanzvariable" oder "Attribut" tatsächlich auf die Variablen,
* die innerhalb einer Klasse deklariert sind und den Zustand der Objekte dieser Klasse beschreiben.
*
* Diese Variablen werden auch als Instanzvariablen bezeichnet,
* weil sie jedem einzelnen Objekt (oder jeder Instanz) einer Klasse zugeordnet sind.
*
* In dem von mir genannten Beispiel wird die Instanzvariable msg in der Klasse Message definiert, und ja,
* msg ist ein Bezeichner, der frei wählbar ist. Diese Instanzvariable beschreibt den Zustand eines einzelnen Message-Objekts.
*
* Wenn also von einer "Instanzvariable" oder einem "Attribut" gesprochen wird,
* bezieht sich dies auf solche Variablen in einer Klasse, die den Zustand der Objekte dieser Klasse beschreiben.
*  */
