package ImperativeSprachkonstrukte;

/**
 * Lernziel:
 * - Ganzzahl vom Typ int einlesen
 * - double einlesen
 * - String einlesen
 */

public class ConsoleInputs {
    public static void main(String[] args) {
        System.out.println("Bitte Produktname eingeben: ");
        String name = new java.util.Scanner(System.in ).nextLine();         // Methode .next liefert das erste Wort und nicht die ganze Zeile | .nextLine liefert die ganze Zeile

        System.out.println("Bitte kcal eingeben: ");
        double kcal = new java.util.Scanner(System.in ).nextDouble();   //  benutzer eingabe in der Konsole Gleitkommazahl = new java.util.Scanner(System.in ).nextDouble();

        System.out.println("Bitte Stückzahl vom Produkt eingeben: ");
        int number = new java.util.Scanner(System.in ).nextInt();       //  benutzer eingabe in der Konsole Ganzzahl = new java.util.Scanner(System.in ).nextInt();

        // Konsolen ausgabe
        System.out.println("Name: " + name);
        System.out.println("Gesamtanzahl kcal: " + kcal * number);      // alternativ für deutsche ausgabe laut system =  System.out.printf("Gesamtanzahl kcal: %.f%n" + kcal * number); | oder %.2f%n bedeutet max. 2 stellen hinterm komma werden angezeigt
    }
}

