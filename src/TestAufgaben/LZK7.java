package TestAufgaben;
/*
* In diesem Code überprüfen wir mit der Bedingung if (number % 2 == 0) für jede Zahl in num, ob sie durch 2 teilbar ist
* (was bedeutet, dass sie gerade ist).
* Wenn die Bedingung erfüllt ist, wird die Zahl zur Summe sum hinzugefügt.
* Am Ende wird die Summe der geraden Zahlen ausgegeben.
* */
public class LZK7 {
    public static void main(String[] args) {
        int num[] = {10, 15, 2, 17};
        int sum = 0;

        for (int number : num) {
            if (number % 2 == 0) { // Überprüfung, ob die Zahl gerade ist | mit der modulo % 2 methode
                sum += number;
            }
        }

        System.out.println("Die Summe der geraden Zahlen ist: " + sum); // = 10 + 2 = 12
    }
}
