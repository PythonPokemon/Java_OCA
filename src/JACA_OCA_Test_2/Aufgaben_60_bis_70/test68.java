/*
Kompilierungsfehler

Gesamterklärung
Obwohl Predicate eine generische Schnittstelle ist, ist auch der Rohtyp zulässig.
Der Typ der Variablen im Lambda-Ausdruck wird durch den generischen Typ der Predicate<T>Schnittstelle abgeleitet.

In diesem Fall ist Prädikat pr1 = s -> s.length() < 4; Das Prädikat wird als Objekttyp betrachtet,
daher ist die Variable "s" vom Objekttyp und die Objektklasse hat keine length()-Methode. s.length() verursacht also einen Kompilierungsfehler.
 * */
package JACA_OCA_Test_2.Aufgaben_60_bis_70;
import java.util.function.Predicate;

//public class test68 {
//    public static void main(String[] args) {
//        String [] arr = {"*", "**", "***", "****", "*****"};
//        Predicate pr1 = s -> s.length() < 4;
//        print(arr, pr1);
//    }
//
//    private static void print(String [] arr, Predicate<String> predicate) {
//        for(String str : arr) {
//            if(predicate.test(str)) {
//                System.out.println(str);
//            }
//        }
//    }
//}
