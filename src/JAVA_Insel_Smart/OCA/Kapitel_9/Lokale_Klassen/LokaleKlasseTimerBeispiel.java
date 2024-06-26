/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Definition der lokalen Klasse:

Die Klasse MyTimerTask wird innerhalb der Methode startTimer definiert.
MyTimerTask ist eine Unterklasse von TimerTask und überschreibt die run-Methode.
Sie kann auf die lokale Variable message zugreifen, da diese als final deklariert ist.
Instanziierung und Verwendung der lokalen Klasse:

Ein Timer-Objekt wird erstellt und die schedule-Methode wird verwendet, um die Aufgabe nach 2 Sekunden auszuführen.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_9.Lokale_Klassen;

import java.util.Timer;
import java.util.TimerTask;

public class LokaleKlasseTimerBeispiel {
    public static void main(String[] args) {
        LokaleKlasseTimerBeispiel example = new LokaleKlasseTimerBeispiel();
        example.startTimer();
    }

    void startTimer() {
        final String message = "Zeit abgelaufen!";

        class MyTimerTask extends TimerTask {
            @Override
            public void run() {
                System.out.println(message);
            }
        }

        Timer timer = new Timer();
        timer.schedule(new MyTimerTask(), 2000); // Aufgabe nach 2 Sekunden ausführen
    }
}
