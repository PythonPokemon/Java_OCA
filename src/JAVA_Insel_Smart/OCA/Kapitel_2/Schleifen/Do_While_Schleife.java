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

        do {
            System.out.println(i);
            i++;
        } while (i < 5);

    }
}
