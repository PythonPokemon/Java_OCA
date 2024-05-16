/*
* Die Methode remove() in der List-Schnittstelle wird verwendet, um ein Element aus der Liste basierend auf seinem Index oder Objekt zu entfernen.
* Wenn Sie list.remove(100) aufrufen, interpretiert Java dies als Versuch, das Element an Index 100 aus der Liste zu entfernen, nicht das Element mit dem Wert 100.
*
* Da die Liste in Ihrem Beispiel weniger als 100 Elemente enthält, wird eine IndexOutOfBoundsException ausgelöst,
* da Java versucht, ein Element zu entfernen, das außerhalb des gültigen Indexbereichs liegt.
*
* */

package JAVA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_30_bis_39;
import java.util.ArrayList;
import java.util.List;

public class test32 {
    public static void main(String[] args) {

//        // Variante 1 | IndexOutOfBoundsException | zum Testen auskommentieren.
//        List<Integer> list = new ArrayList<>();
//        list.add(100);
//        list.add(200);
//        list.add(100);
//        list.add(200);
//        list.remove(100);   // <-- versuch auf index 100 zuzugreifen! statt auf das Element 100
//        System.out.println(list);

//----------------------------------------------------------------------------------------------------------------------
/*
*  Wenn Sie das Element mit dem Wert 100 entfernen möchten, können Sie entweder den Index des Elements kennen und ihn explizit angeben,
*  oder Sie können die remove(Object o) Methode verwenden, um das Element anhand seines Werts zu entfernen.
*
*  Dies wird das erste Vorkommen des Werts 100 in der Liste entfernen.
 * */

        // Variante 2 | list.remove(Integer.valueOf(100)) Methode
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(Integer.valueOf(100));   // <-- was kommt raus?
        System.out.println(list);
    }
}
