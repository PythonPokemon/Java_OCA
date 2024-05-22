/*
 * Welche der folgenden Änderungen, die unabhängig voneinander vorgenommen werden, ermöglicht das Kompilieren des Codes und gibt bei der Ausführung LogHelper-help aus?

Wählen Sie 3 Optionen.

Entfernen Sie den protected-Modifizierer aus der Operationsvariablen der LogHelper-Klasse

Richtige Auswahl
Fügen Sie den öffentlichen Modifikator zur Methode help() der LogHelper-Klasse hinzu

Richtige Auswahl
Fügen Sie den protected-Modifikator zur help()-Methode der LogHelper-Klasse hinzu

Fügen Sie den öffentlichen Modifikator zur log()-Methode der LogHelper-Klasse hinzu

Fügen Sie den protected-Modifikator zur log()-Methode der Helper-Klasse hinzu

Entfernen des privaten Modifizierers aus der num-Variablen der LogHelper-Klasse

Richtige Auswahl
Entfernen Sie den geschützten Modifikator aus der help()-Methode der Helper-Klasse

Fügen Sie den protected-Modifikator zur log()-Methode der LogHelper-Klasse hinzu
* ----------------------------------------------------------------------------------------------------------------------
* Gesamterklärung
Lassen Sie uns zunächst das Problem herausfinden:

Da Instanzvariablen durch Unterklassen ausgeblendet und nicht überschrieben werden,
gelten überschreibende Regeln nicht für die Instanzvariablen.
Es gibt keine Probleme mit den Variablen 'num' und 'operation'.

Die log()-Methode wird in beiden Klassen mit dem Standardmodifikator deklariert, daher gibt es auch kein Problem mit der log()-Methode.

Die abstrakte Methode help() wird mit dem geschützten Modifikator in der Helper-Klasse und in der LogHelper-Klasse deklariert,
sie wird mit dem Standardmodifikator überschrieben, was zu einem Kompilierungsfehler führt.
Daher finden Sie folgende Lösungen, um dieses Problem zu beheben:

1. Entfernen Sie den geschützten Modifikator aus der help()-Methode der Helper-Klasse:
Sowohl die überschriebene als auch die überschreibende Methode haben denselben Standardmodifikator, der zulässig ist

ODER

2. Fügen Sie den geschützten Modifikator zur help()-Methode der LogHelper-Klasse hinzu:
Sowohl die überschriebene als auch die überschreibende Methode haben denselben geschützten Modifikator, der zulässig ist

ODER

3. Fügen Sie den öffentlichen Modifikator zur help()-Methode der LogHelper-Klasse hinzu:
Die überschriebene Methode hat einen geschützten Modifikator und die überschreibende Methode hat einen öffentlichen Modifikator, der zulässig ist
 * */

package JAVA_OCA_Test_2.Aufgaben_10_bis_19;

public class test17 {

}
//----------------------------------------------------------------------------------------------------------------------
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