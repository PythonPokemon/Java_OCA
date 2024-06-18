/*
Methode mit variabler Argumentanzahl (Varargs)
Methoden können so definiert werden, dass sie eine variable Anzahl von Argumenten akzeptieren.
Diese werden intern als Array behandelt:
* */
package JAVA_Insel_Smart.OCA.Kapitel_4;

public class Methode_mit_Variabler_Argumentanzahl_Varargs {

    //Methode, die intern als Array behandelt wird.
    public static void printNumbers(int... numbers) { // drei punkte syntax zwingend erforderlich

        for (int number : numbers) {
            System.out.println(number); // deswegen werden die ersten 3 elemente übersprungen und 4, 5 ausgegeben
        }
    }

    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5); // Methoden, werte initialisierung
    }
}
