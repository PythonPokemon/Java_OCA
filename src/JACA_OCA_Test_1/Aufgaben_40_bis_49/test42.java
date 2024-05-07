package JACA_OCA_Test_1.Aufgaben_40_bis_49;

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
        obj.variante3(args);
        obj.variante4(args);

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