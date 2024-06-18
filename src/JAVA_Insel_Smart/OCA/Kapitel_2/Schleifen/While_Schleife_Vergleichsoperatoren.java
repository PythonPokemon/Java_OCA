/*
Schleifenbedingungen und Vergleiche mit ==

Es ist wichtig, die Schleifenbedingungen und die Vergleichsoperatoren korrekt zu verwenden,
um endlose Schleifen und logische Fehler zu vermeiden:
* */
package JAVA_Insel_Smart.OCA.Kapitel_2.Schleifen;

public class While_Schleife_Vergleichsoperatoren {
    public static void main(String[] args) {
        int i = 0;

        while (i != 5) {
            System.out.println(i);
            i++;
        }

    }
}
