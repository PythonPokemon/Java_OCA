import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Test {
    public static void main(String[] args) throws Exception {
        List al = new ArrayList(); // Array größe 2
        al.add(111); //index 0
        al.add(222);// index 1
//        System.out.println(al.size()); // gibt die größe des arrays an, also alle indexe, in dem fall 2
//        System.out.println(al.get(0)); // gib das Element aus index 0 aus

        //  Alternativ, um das letzte Element sicher zu erhalten
        // Zugriff auf das letzte Element
        // Um auf das letzte Element zuzugreifen, verwenden Sie get(size() - 1).
        // Beispiel: Wenn size() 2 zurückgibt, dann ist der höchste gültige Index 1 (2 - 1).
        System.out.println(al.get(al.size() -1)); // methode geht
    }
}