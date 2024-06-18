/*
Arrays mit nichtprimitiven Elementen
Arrays können auch nichtprimitive Elemente enthalten, z.B. Objekte:
* */

package JAVA_Insel_Smart.OCA.Kapitel_4;

public class Array_mit_StringElement {
    public static void main(String[] args) {
        String[] words = {"Hello", "World"};

        for (String word : words) { // word iteriert durch words elemente
            System.out.println(word);   // jedes element, durch das iteriert wird, wird in der Konsole ausgegeben
        }
    }
}
