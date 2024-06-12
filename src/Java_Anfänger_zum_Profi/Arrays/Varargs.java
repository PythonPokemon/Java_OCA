package Java_Anfänger_zum_Profi.Arrays;

/*
 *   Das erste muss ein string sein
 *  Varargs bedeutet eins zwei oder beliebig viele element
 *
 * */
public class Varargs {

    // Methode
    public static void main(String[] args) {

//        System.out.printf("%s %d%n", "Hello", 12);
//        System.out.printf("%s %d %d%n", "Hello", 12, 12);
//        System.out.printf("%s %d%n", "Hello", 12, 12, 31415);
//        System.out.printf("%s %d%n", "Hello", 12, 12, "welt", 12.232);

        printInts(1, 2, 3);                // in der klamme sind Argumente 1, 2, 3
        printInts(new int[]{1, 2, 3, 4,});          // aufbauansicht vom compiler
        printInts();

        // variante wie oben
        int[] numbers = {1, 2, 3, 4, 5,};
        printInts(numbers);
        numbers [ 0 ] = 6;  // modifizierter die erste zahl mit 6 statt 1 | ps. der Index beginnt bei 0 == 1 also 0 == 6
        printInts( numbers );
    }

    // Methode
    static void printInts(int... numbers) {         // => int[] numbers ist also ein array
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
