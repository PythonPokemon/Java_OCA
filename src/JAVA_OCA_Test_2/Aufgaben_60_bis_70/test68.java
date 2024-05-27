/*
Import Statement:

import java.util.function.Predicate; importiert das Predicate Interface aus dem java.util.function Paket.
Main Methode:

String[] arr = {"*", "**", "***", "****", "*****"}; definiert ein Array von Strings.
Predicate<String> pr1 = s -> s.length() < 4; erstellt ein Predicate mit dem generischen Typ String, das überprüft,
ob die Länge des Strings kleiner als 4 ist. Dies ist die korrekte generische Syntax.

print Methode:
Die print Methode nimmt ein Array von Strings und ein Predicate<String> entgegen.
Innerhalb der for-Schleife wird jedes Element des Arrays auf das Predicate getestet.
Wenn das Predicate für ein bestimmtes Element true zurückgibt (d.h. wenn die Länge des Strings kleiner als 4 ist),
wird dieser String ausgegeben.

Warum tritt der Compilerfehler auf?
Der Compilerfehler tritt auf, weil die Verwendung von Predicate ohne generischen Typ
in der Zeile Predicate pr1 = s -> s.length() < 4; nicht den Anforderungen entspricht.
Der Compiler kann ohne den generischen Typ nicht sicherstellen, dass der Typ des Lambda-Ausdrucks (s -> s.length() < 4;)
mit dem erwarteten Typ in der print Methode (Predicate<String>) übereinstimmt.
 * */
package JAVA_OCA_Test_2.Aufgaben_60_bis_70;
import java.util.function.Predicate;                        // <-- import hat gefehlt

//public class test68 {
//    public static void main(String[] args) {
//        String [] arr = {"*", "**", "***", "****", "*****"};
//        Predicate pr1 = s -> s.length() < 4;              //<-- Syntax | Predicate<String> pr1 = s -> s.length() < 4;
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
//----------------------------------------------------------------------------------------------------------------------
public class test68 {
    public static void main(String[] args) {
        String [] arr = {"*", "**", "***", "****", "*****"};
        Predicate<String> pr1 = s -> s.length() < 4;
        print(arr, pr1);
    }

    private static void print(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}