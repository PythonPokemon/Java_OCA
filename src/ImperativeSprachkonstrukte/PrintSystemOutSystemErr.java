package ImperativeSprachkonstrukte;

/**
 * Quiz: Warum heißt es System.out.println( ... ),nicht println( ...))
 * Lernziel:
 * - Zwei Ausgabekanäle kennenlernen, für normale und Ausgaben und Fehlerausgaben
 */

public class PrintSystemOutSystemErr {
    public static void main(String[] args) {
        System.out.println("hallo welt"); // normale konsolenausgabe
        System.err.println("hallo welt"); // Fehler konsolenausgabe farblich  sichtbar
    }
}
