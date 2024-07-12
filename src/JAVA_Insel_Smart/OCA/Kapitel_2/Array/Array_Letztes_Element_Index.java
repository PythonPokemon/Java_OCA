package JAVA_Insel_Smart.OCA.Kapitel_2.Array;
import java.util.List;
import java.util.ArrayList;

public class Array_Letztes_Element_Index {
    public static void main(String[] args)  {
        List al = new ArrayList(); // Array größe 2 | ArrayList, die nur Objekte speichern können.
        al.add(111); //index 0
        al.add(222);// index 1
        System.out.println("Array länge ist: " + al.size()); // gibt die größe des arrays an, also alle indexe, in dem fall 2
        System.out.println("Array Index: " + al.get(0)); // gibt das Element aus index 0 aus
        System.out.println("Array Index: " + al.get(1));// gibt das Element aus dem Index 1 aus

        //  Alternativ, um das letzte Element sicher zu erhalten
        // Zugriff auf das letzte Element
        // Um auf das letzte Element zuzugreifen, verwenden Sie get(size() - 1).
        // Beispiel: Wenn size() 2 zurückgibt, dann ist der höchste gültige Index 1 (2 - 1).
        System.out.println("Gibt das Element, aus dem letzten Index aus: " + al.get(al.size() -1)); // methode geht


    }
}
