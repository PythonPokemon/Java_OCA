/*
Zusammenfassung der Ausgabe:
Der erste Wert (2) kommt aus der Methode change, wo die Kopie des Werts (num) um 1 erhöht und dann ausgegeben wurde.
Der zweite Wert (1) kommt aus der main-Methode, wo der ursprüngliche Wert von i1 ausgegeben wird,
der nicht verändert wurde.

Schrittweise Ausführung:
1.int i1 = 1; initialisiert i1 mit 1.

2.test20.change(i1); ruft die Methode change auf und übergibt i1 als Argument:
num wird zu 1.
num++ erhöht num auf 2.
System.out.println(num); gibt 2 aus.

3.Zurück in der main-Methode:
System.out.println(i1); gibt 1 aus.
Daher ist die vollständige Ausgabe des Programms "2 1".
 * */
package JAVA_OCA_Test_3.Aufgaben_20_bis_29;

public class test20 {
    public static void change(int num) {    //num wird zu 1.
        num++;                              //erhöht num auf 2.
        System.out.println(num);            //gibt 2 aus.
    }

    public static void main(String[] args) {
        int i1 = 1;                 // initialisiert i1 mit 1.
        test20.change(i1);          // ruft die Methode .change() auf und übergibt i1 als Argument:
        System.out.println(i1);     // gibt 1 aus.
    }
}
