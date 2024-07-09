/*
Die while-Schleife

Die while-Schleife führt einen Block von Anweisungen aus, solange eine Bedingung wahr ist:
* */
package JAVA_Insel_Smart.OCA.Kapitel_2.Schleifen;

public class While_Schleife {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        // Korrekter code
        while (i < 5) {
            System.out.println("hallo");
            i++;
        }

        // auch Korrekter code | Allerdings erkennt der Compiler das es sinnlos ist, einen unerreichbaren code
        // zu schreiben und wertet das als fehler aus!!!

        //        while (false) {
//            System.out.println("Schreib etwas in der Konsole");
//            j++;
//        }

        // Zusammenfassung
        //Der Code kompiliert und führt ohne Fehler aus, aber er hat keine sichtbare Wirkung,
        // da die Schleifenbedingung false ist und der Schleifenrumpf niemals ausgeführt wird.
        //Warum ist das ein Fehler?
        //Der Java-Compiler betrachtet dies als Fehler, um den Entwickler darauf hinzuweisen, dass es sinnlosen
        // oder fehlerhaften Code gibt, der entfernt oder korrigiert werden sollte.
        // Nicht erreichbare Anweisungen können auf logische Fehler im Programm hinweisen und sollten behoben werden,
        // um sicherzustellen, dass der Code korrekt und effizient ist.

    }
}
