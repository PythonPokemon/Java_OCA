/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Effektiv finale Variable:

Die Variable message ist effektiv final, weil sie nach ihrer Initialisierung nicht verändert wird.
Lokale Klassen können auf solche Variablen zugreifen.
------------------------------------------------------------------------------------------------------------------------
Definition und Instanziierung der lokalen Klasse:

Die Klasse MyTimerTask wird innerhalb der Methode startTimer definiert.
Eine Instanz von MyTimerTask wird innerhalb der Methode startTimer erstellt und die schedule-Methode
des Timer-Objekts wird aufgerufen, um die Aufgabe nach der angegebenen Verzögerung auszuführen.
------------------------------------------------------------------------------------------------------------------------
* */


package JAVA_Insel_Smart.OCA.Kapitel_9.Lokale_Klassen;

import java.util.Timer;
import java.util.TimerTask;

public class LokaleKlasseTimerRichtig {
    public static void main(String[] args) {
        LokaleKlasseTimerRichtig objInstanz1 = new LokaleKlasseTimerRichtig();
        objInstanz1.startTimer(2000, "Zeit abgelaufen!");
    }

    void startTimer(int delay, String message) {
        // message ist effektiv final, da sie nach der Initialisierung nicht verändert wird

        class MyTimerTask extends TimerTask {
            @Override
            public void run() {
                System.out.println(message);
            }
        }

        Timer objektInstanzImportKlasse = new Timer();
        objektInstanzImportKlasse.schedule(new MyTimerTask(), delay); // Aufgabe nach der angegebenen Verzögerung ausführen
    }
}
