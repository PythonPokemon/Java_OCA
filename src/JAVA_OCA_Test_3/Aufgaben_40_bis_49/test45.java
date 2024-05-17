/*
List<Integer>

Gesamterklärung
Der generische Typ kann nur ein Verweistyp und kein primitiver Typ sein, daher ist List<int> keine gültige Syntax.
Wenn Sie den Rohtyp List oder List<Object> verwenden, gibt Zeile 3 einen Kompilierungsfehler aus, da list.get(0) den Objekttyp zurückgibt.
Der Objekttyp kann nicht in den primitiven Typ int konvertiert werden, daher führen List und List<Object> zu einem Kompilierungsfehler von Zeile 3.
 * */
package JAVA_OCA_Test_3.Aufgaben_40_bis_49;

//public class test45 {
//    public static void process(/*INSERT*/ list) {
//        list.add(100); //Line 2
//        int x = list.get(0); //Line 3
//        System.out.println(list.size() + ":" + x);
//    }
//}
