package JACA_OCA_Test_1.Aufgaben_1_bis_9;

public class test6 {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        int c = 100;
        int d = 100;
        int e = 100;
        int f = 100;


        System.out.println(-a++);   // - 100 das ++ hinter dem bezeichner hat keine bedeutung da der bezeichner, bereits negiert wird

        System.out.println(-b);     // - 100
        System.out.println(+c);     // 100, gibt einfach nur den wer der zwischen gespeichert wurde aus.

        System.out.println(++d);    // 101 | addiert  1 + 100
//        System.out.println(e+);     // error
        System.out.println(e++);    // 100 | ++ hinter dem bezeichner 100 wird der wert um 1 erhört aber vorerst zwischengespeichert und nicht ausgegeben
        System.out.println(a + e);  // 202 | weil das ++ hinter dem bezeichner zwischengespeichert wird für die addition, also 100 + 1 + 100 + 1

        // Überladen, bedeutet das der ursprüngliche wert nach jeder weiteren operation die letzte Summe zwischenspeichert, um damit weiter zu rechnen
        System.out.println(++b + ++c);  // 202
        System.out.println(++b + ++c);  // 204
        System.out.println(++b + ++c);  // 206
        System.out.println(c);          // 103
    }
}
