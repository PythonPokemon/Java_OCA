import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {

//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//        }

        // mit new wird immer ein  neues String Objekt erzeugt, im Heap
        String s1 = new String("Java"); //Line 3 | 1
        // Hier wird explizit im String pool geprüft, ob da Literal bereits vorhanden ist
        String s2 = "JaVa"; //Line 4| 2
        String s3 = "JaVa"; //Line 5| wie 2 also kein neues
        String s4 = "Java"; //Line 6 | 3
        String s5 = "Java"; //Line 7 | wie 3 also kein neues

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));
    }
}