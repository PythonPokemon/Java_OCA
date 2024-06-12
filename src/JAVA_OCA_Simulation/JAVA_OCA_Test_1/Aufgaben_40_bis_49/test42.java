/*
* Der gegebene Code demonstriert vier Varianten, wie eine Schleife implementiert werden kann, um bestimmte Elemente eines String-Java_Anfänger_zum_Profi.Arrays auszugeben.
* Das Ziel besteht darin, die Buchstaben "NET" in der Konsole auszugeben.
*
* Die möglichen Varianten sind:
*
* Variante 1:
* Diese Variante verwendet eine for-Schleife mit einer Zählervariable a, die von 0 bis zur Länge des Java_Anfänger_zum_Profi.Arrays läuft.
* Die Schleife gibt jedes Element des Java_Anfänger_zum_Profi.Arrays aus, wenn der Index ungerade ist.
*
* Variante 2:
* Diese Variante ist eine Methode variante2, die in der main-Methode aufgerufen wird.
* In dieser Methode wird eine for-Schleife verwendet, um jedes Element des Java_Anfänger_zum_Profi.Arrays auszugeben, wenn der Index ungerade ist.
*
* Variante 3:
* Ähnlich wie Variante 2, jedoch wird hier die Zählervariable c initialisiert, um mit 1 zu starten und in jedem Schritt um 2 zu erhöhen.
* Dies stellt sicher, dass nur die Elemente mit ungeradem Index ausgegeben werden.
*
* Variante 4:
* Diese Variante ist ähnlich wie Variante 3, jedoch wird die Schleifenbedingung so angepasst,
* dass die Schleife bis zur Länge des Java_Anfänger_zum_Profi.Arrays läuft, und nicht bis zu einer Länge, die um 2 größer ist als die Länge des Java_Anfänger_zum_Profi.Arrays.
* Dadurch wird ein Indexfehler vermieden.
*
* Die main-Methode ruft jede Variante nacheinander auf und gibt das Ergebnis aus.
* Am Ende werden die Buchstaben "NET" in der Konsole ausgegeben, da jede Variante so implementiert ist,
* dass nur die entsprechenden Buchstaben ausgegeben werden, und zwar in der richtigen Reihenfolge.
* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_40_bis_49;

// How many above options can be used to replace /*INSERT*/, such that on execution, code will print 'NET' on the console?
public class test42 {

    // Variante 1
    public static void main(String[] args) {
        String[] arr = {"I", "N", "S", "E", "R", "T"};
        for (int a = 0; a < arr.length; a += 1) {  // <-- /*INSERT*/ --> (int a = 0; a < arr.length; a += 1)
            if (a % 2 == 0) {
                continue;
            }
            System.out.println(arr[a]);
        }

    // Methoden Aufruf | Beschwörungszauber XD
        test42 obj = new test42();
        obj.variante2(args);        // <--. Aufruf der Methode, in der Variante 2
        obj.variante3(args);        // <--. Aufruf der Methode, in der Variante 3
        obj.variante4(args);        // <--. Aufruf der Methode, in der Variante 4

    }
//----------------------------------------------------------------------------------------------------------------------
    // Variante 2 | wird in der main Methode aufgerufen
    public void variante2(String[] args) {
        String[] arr2 = {"I", "N", "S", "E", "R", "T"};
        for(int b = 0; b < arr2.length; b += 1){
            if (b % 2 == 0) {
                continue;
            }
            System.out.println(arr2[b]);
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    // Variante 3 | wird in der main Methode aufgerufen
    public void variante3(String[] args) {
        String[] arr3 = {"I", "N", "S", "E", "R", "T"};
        for(int c = 1; c < arr3.length; c += 2){
            if (c % 2 == 0) {
                continue;
            }
            System.out.println(arr3[c]);
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    // Variante 4 | wird in der main Methode aufgerufen
    public void variante4(String[] args) {
        String[] arr4 = {"I", "N", "S", "E", "R", "T"};
        for(int d = 1; d <= arr4.length; d += 2){
            if (d % 2 == 0) {
                continue;
            }
            System.out.println(arr4[d]);
        }
    }
}