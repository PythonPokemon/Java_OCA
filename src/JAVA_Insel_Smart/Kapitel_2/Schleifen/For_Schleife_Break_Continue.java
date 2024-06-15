/*
Die Anweisung break beendet die Schleife sofort,
während continue die aktuelle Iteration überspringt und zur nächsten Iteration übergeht:
* */
package JAVA_Insel_Smart.Kapitel_2.Schleifen;

public class For_Schleife_Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Schleife wird beendet
            }
            if (i % 2 == 0) {
                continue; // Nächste Iteration wird fortgesetzt
            }
            System.out.println(i);
        }

    }
}
