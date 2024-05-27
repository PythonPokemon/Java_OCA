/*
Gesamterklärung
Die Methode 'delete' akzeptiert 2 Parameter: delete(int start, int end), wobei start inklusiv und end exklusiv ist.

Diese Methode löst StringIndexOutOfBoundsException für die folgenden Szenarien aus:

A. Start ist negativ

B. start ist größer als sb.length()

C. Anfang ist größer als Ende



Wenn end größer als die Länge des StringBuilder-Objekts ist, wird StringIndexOutOfBoundsException nicht ausgelöst und end auf sb.length() festgelegt.

In diesem Fall entspricht 'sb.delete(0, 100);' also 'sb.delete(0, sb.length());' und löscht alle Zeichen aus dem StringBuilder-Objekt.

Daher System.out.println(sb.length()); gibt 0 auf der Konsole aus.

 * */
package JAVA_OCA_Test_2.Aufgaben_30_bis_39;

public class test32 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hurrah! I Passed..."); // ist 19 zeichen lang

        //Der Aufruf sb.delete(0, 100) versucht, alle Zeichen von Index 0 bis 99 zu löschen.
        sb.delete(0, 100);  // gibt 0 aus | wenn 0, 10 wäre der tatsächliche ausgabe 9, da 10 zeichen gelöscht werden von 19
        System.out.println(sb.length());
    }
}
