/**

 * */
package JAVA_Insel_Smart.Kapitel_2.Schleifen;

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
