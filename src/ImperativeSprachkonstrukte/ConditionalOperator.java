package ImperativeSprachkonstrukte;

/**
 * Lernziel:
 * - Bedingungsoperator
 */
public class ConditionalOperator {
    public static void main(String[] args) {
        int a = 12;
        int b = 200;

        /** herkömmliche vorgehensweise
         * if ( a > b )
         System.out.println(a);
         else
         System.out.println(b);
         */
        // schnellere vorgehensweise | Kaskadieren
        System.out.println(a > b ? a : b);  // es wird mit ? gefragt ob a größer b ist, wenn das zutrifft = a | alternativen deklariert man mit doppelpunkt :  | indem fall b

        // smarte deklaration
        double random = Math.random();
        String color = random < 0.3 ? "rot: " : random < 0.6 ? "blau: " : "grün: ";   // es wird mit Fragezeichen ? gefragt ob, die zufallszahl kleiner 0.3 = rot oder mit doppelpunkt : kleiner 0.6 = blau oder mit doppelpunkt : größer 0.6 = grün
        System.out.println(color + random); // gibt in der Konsole die Farbe und die Zufallszahl aus
    }
}
