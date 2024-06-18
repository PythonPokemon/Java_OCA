/*
Der Einstiegspunkt für das Laufzeitsystem: main(…)
Die main-Methode ist der Einstiegspunkt eines Java-Programms.
Diese Methode muss eine ganz bestimmte Signatur haben, damit das Laufzeitsystem sie aufrufen kann:
------------------------------------------------------------------------------------------------------------------------
Korrekte Deklaration der Startmethode
Die main-Methode muss öffentlich (public), statisch (static) und vom Typ void sein.
Sie nimmt ein Array von Strings als Parameter, das die Kommandozeilenargumente enthält.
------------------------------------------------------------------------------------------------------------------------
Kommandozeilenargumente verarbeiten
Kommandozeilenargumente werden beim Programmstart übergeben und können innerhalb der main-Methode genutzt werden:
* */
package JAVA_Insel_Smart.OCA.Kapitel_1;

public class Einstiegspunkt_main {
    //Korrekte Deklaration der Startmethode
    //Die main-Methode muss öffentlich (public), statisch (static) und vom Typ void sein.
    //Sie nimmt ein Array von Strings als Parameter, das die Kommandozeilenargumente enthält.
//----------------------------------------------------------------------------------------------------------------------
    //Kommandozeilenargumente verarbeiten
    //Kommandozeilenargumente werden beim Programmstart übergeben und können innerhalb der main-Methode genutzt werden:
    public static void main(String[] args) {
        // Programmcode
        for (String arg : args) {
            System.out.println(arg);
        }

        //Der Rückgabetyp von main(…) und System.exit(int)
        //Die main-Methode hat keinen Rückgabewert.
        // Um das Programm mit einem bestimmten Statuscode zu beenden, kann System.exit(int) verwendet werden:
        System.exit(0); // normales Beenden
        System.exit(1); // Beenden mit Fehler

    }
}
