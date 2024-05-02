package ImperativeSprachkonstrukte;

/**
 * Java erlaubt Methoden, die gleich heißen, aber eine unterschiedliche Parameterliste haben.
 * Diese Methoden nennen wir *überladen*.
 *
 * Lernziel:
 * - Überladene Methoden
 * print(...)
 * println(
 * printf( •
 * kennenlernen
 */
public class OverloadedMethods {

    // Überladene Methoden print | println die unterschiedliche dinge ausgeben können
    public static void main(String[] args) {
        System.out.print("Hallo"); // einfach nur print heißt ausgabe in der gleichen zeile ohne zeilenumbruch
        System.out.print(" ");
        System.out.print("Welt");
        System.out.println(" <nach mir kommt der zeilenumbruch>");
        System.out.println("<nach mir kommt der zeilenumbruch>");
        System.out.printf("Hallo%nWelt%n"); // formatiervorlage für einen zeilenumbruch %n
        System.out.println("1+1=2");

        // Formatspezifizierer
        System.out.printf("%d+%d=%d%n", 1, 1, 2); // %d d= dezimal %d %d %d entspricht der deklaration 1, 1, 2
        System.out.printf("%s %s %d", "Hallo", "Welt", 2030); // %s s = string =  wird durch die strings initiiert Hallo Welt
    }
}
