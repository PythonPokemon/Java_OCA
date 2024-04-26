package TestAufgaben;

/* Code Beschreibung.
 * Dieses Java-Programm berechnet die Summe aller geraden Zahlen in einem Array von ganzen Zahlen.
 * Ein Array namens "num" wird erstellt und mit den Werten {10, 15, 2, 17} initialisiert.
 * Eine Variable "sum" wird initialisiert, um die Summe der geraden Zahlen zu halten.
 * Eine for-each-Schleife wird verwendet, um jedes Element des Arrays "num" zu durchlaufen.
 * Innerhalb der Schleife wird überprüft, ob die aktuelle Zahl durch 2 teilbar ist (dh, ob sie gerade ist), indem der Modulo-Operator (%) verwendet wird.
 * Wenn die Zahl gerade ist, wird sie zur Summe hinzugefügt.
 * Schließlich wird die Summe der geraden Zahlen mit "System.out.println" ausgegeben.
 * Die Ausgabe dieses Programms wird sein: 10 + 2 = 12
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
