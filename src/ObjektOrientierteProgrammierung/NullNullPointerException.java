package ObjektOrientierteProgrammierung;

import javax.swing.*;
import java.sql.SQLOutput;

/**
 * Prüfung auf null und ungleich null
 * statistisch häufigste programm fehler
 */
public class NullNullPointerException {
    public static void main(String[] args) {
        java.awt.Point p = null;    // java.awt.Point wird mit p deklariert | p wird mit null initialisiert
        String s = null;
        int i = 12;
        if (s != null)  // wenn s string ungleich 0 ist, gib aus dr konsole == null aus
            System.out.println(s.length());
        else
            System.out.println(" == null");
        String input = JOptionPane.showInputDialog("Eingabe");  // eingabefeld Java
        if (input != null)  // damit kein fehler angezeigt wird beim Abbrechen oder schließen des Dialogfensters
            System.out.println(input.length());  // eingabefeld soll in der Konsole aufgerufen werden
    }
}
