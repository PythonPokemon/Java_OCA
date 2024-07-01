/*
Regeln für die Verwendung von Wrapper-Klassen und Autoboxing
Autoboxing und Unboxing: Java führt Autoboxing und Unboxing automatisch durch, wenn dies erforderlich ist.
Dies erleichtert die Verwendung von primitiven Typen in generischen Klassen wie ArrayList.

NullPointerException: Vorsicht bei Unboxing, wenn das Wrapper-Objekt null ist, wird eine NullPointerException ausgelöst.


Performance: Wrapper-Klassen sind weniger effizient als primitive Typen,
da sie mehr Speicher benötigen und zusätzliche Methodenaufrufe erfordern.
Verwende primitive Typen, wenn Performance kritisch ist.
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Wrapper_Klassen_und_Auboxing;

public class Auttoboxing_Unboxing_Exception {
    public static void main(String[] args) {
        Integer i = null;
        int intValue = i; // Wirft NullPointerException


        System.out.println(intValue);
    }
}
