/**
bei verschachtelten schleifen, wird zuerst immer die innere zuerst ausgewertet.
es startet also mit j = 0 und erhöht j in jeder iteration solange j kleiner 3 ist,
wenn j jedoch == 1 entspricht, wechselt sie zur äußeren schleife und i wird in jeder iteration um 1 erhöht, solange
i kleiner 3 ist.
das geht, solange bis j = 2 ist und i = 2 ist den sie sind ja kleiner 3!
 ps.
 am Ende jeder iteration werden wie durch die methode: System.out.println("i: " + i + ", j: " + j);
 aus der Konsole ausgegeben
 * */
package JAVA_Insel_Smart.OCA.Kapitel_2.Schleifen;

public class For_Schleife_Verschachtelt {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {   // äußere Schleife
            for (int j = 0; j < 3; j++) {   // innere Schleife
                if (j == 1) {
                    continue; // Springt zur nächsten Iteration der äußeren Schleife
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }

    }
}
