/*
Was wird das Ergebnis des Kompilierens und Ausführens der Testklasse sein?
[Array, List]

Correct answer
[List]

[Array]

[List, Array]

An exception is thrown at runtime

------------------------------------------------------------------------------------------------------------------------
Gesamterklärung
list.add(0, "Array"); bedeutet list --> [Array],

list.set(0, "Liste"); bedeutet, dass das aktuelle Element bei Index 0 durch das übergebene Element "List" ersetzt wird.
Nach diesem Vorgang listen Sie --> [Liste]. In der Konsole wird [Liste] gedruckt.
 * */
package JAVA_OCA_Test_3.Aufgaben_20_bis_29;
import java.util.ArrayList;
import java.util.List;

public class test24 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.set(0, "List");

        System.out.println(list);
    }
}
