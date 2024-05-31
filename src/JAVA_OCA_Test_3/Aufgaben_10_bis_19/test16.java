/*
Erklärung des Fehlers
------------------------------------------------------------------------------------------------------------------------
Verwendung des final Schlüsselworts:

Die Variable flag wird als final deklariert und initialisiert.
 Das bedeutet, dass flag nach der Initialisierung nicht mehr verändert werden kann und für die gesamte Lebensdauer
 des Programms false bleibt.
------------------------------------------------------------------------------------------------------------------------
Kompilierungszeitliche Konstantenauswertung:

Da flag als final deklariert ist und zur Kompilierungszeit auf false gesetzt wird, weiß der Compiler,
dass der Ausdruck while(flag) immer false sein wird.
------------------------------------------------------------------------------------------------------------------------
Unreachable Code:

Der Compiler erkennt, dass der Block innerhalb der while-Schleife niemals ausgeführt wird,
da die Bedingung while(flag) immer false ist.
Dies führt dazu, dass der Code innerhalb der Schleife als "unreachable code" (nicht erreichbarer Code) markiert wird.
 * */
package JAVA_OCA_Test_3.Aufgaben_10_bis_19;

//public class test16 {
//    public static void main(String[] args) {
//        final boolean flag = false; // final ist fehlerhaft, bedeutet das es für immer false bleibt
//        while (flag) {
//            System.out.println("Good Morning!");
//        }
//    }
//}

//----------------------------------------------------------------------------------------------------------------------
public class test16 {
    public static void main(String[] args) {
        boolean flag = false; // <-- ohne final
        while (flag) {
            System.out.println("Good Morning!");
        }
    }
}