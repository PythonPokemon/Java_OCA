/*
Speicherort Exam.java Datei:
------------------------------------------------------------------------------------------------------------------------
D:.
└───WORK
    └───QUIZ
        └───SEC07
            ├───classes
            └───src
                └───com
                    └───udayan
                        └───test
                                Exam.java
Sie befinden sich derzeit im Ordner Sec07.
D:\ARBEIT\Quiz\Sek07>
------------------------------------------------------------------------------------------------------------------------
Welcher der folgenden javac-Befehle, der von oben eingegeben wurde,
generiert die Dateistruktur von Exam.class im Klassenverzeichnis?

D:.
└───WORK
    └───QUIZ
        └───SEC07
            ├───classes
            │   └───com
            │       └───udayan
            │           └───test
            │                   Exam.class
            │
            └───src
                └───com
                    └───udayan
                        └───test
                                Exam.java
------------------------------------------------------------------------------------------------------------------------
Antwortmöglichkeiten?
javac classes\ src\com\yan\test\Exam.java

Not possible by javac command

* Correct answer
javac -d classes\ src\com\ udayan\test\Exam.java

javac -d classes\ Exam.java
------------------------------------------------------------------------------------------------------------------------
Gesamterklärung
Verwenden Sie die Option -d mit dem Befehl javac.
Wenn Sie den Befehl javac aus dem Verzeichnis Sec07 eingeben,
muss der Pfad der Java-Datei relativ zum Verzeichnis Sec07 angegeben werden.

Der richtige Befehl lautet also: javac -d classes\ src\com\ udayan\test\Exam.java

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_40_bis_49;

public class test40 {
    public static void main(String [] args) {
        System.out.println("All the best!");
    }
}
