/*
Die do-while-Schleife

Die do-while-Schleife ähnelt der while-Schleife, mit dem Unterschied,
dass die Bedingung am Ende der Schleife geprüft wird.
Dadurch wird der Schleifenblock mindestens einmal ausgeführt:
* */
package JAVA_Insel_Smart.OCA.Kapitel_2.Schleifen;

public class Do_While_Schleife {
    public static void main(String[] args) {
        int i = 0;

        // führt erst aus und prüft dann die bedingung!
        do {
            System.out.println(i);// gibt die variable i in der Konsole aus, bei jedem durchlauf der Iteration
            i++;                  // erhöht den Wert, auf den 'i' vereist um +1 | bedeutet von 0 auf 1
        } while (i < 5);          // solange der Wert den 'i' referenziert kleiner 5 ist!

    }
}
