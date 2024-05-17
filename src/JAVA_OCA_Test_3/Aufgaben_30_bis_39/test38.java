/*
Welche der folgenden Aussagen ist wahr?

Drei Initialisierungsblöcke verursachen einen Kompilierungsfehler.

Vier Initialisierungsblöcke verursachen Kompilierungsfehler.

Zwei Initialisierungsblöcke verursachen einen Kompilierungsfehler.

Richtige Antwort
Nur ein Initialisierungsblock verursacht einen Kompilierungsfehler.

Fünf Initialisierungsblöcke verursachen Kompilierungsfehler.
------------------------------------------------------------------------------------------------------------------------
Gesamterklärung
Obwohl der Code das Wissen von ArrayList zu überprüfen scheint, überprüft er tatsächlich das Wissen über Polymorphismus.
List<Sellable> list = new ArrayList<>(); ist eine gültige Anweisung und Liste kann jedes Objekt akzeptieren,
das instanceof check für den Typ Sellable übergibt.
Rabbit implementiert Sellable, daher kann neues Rabbit() zur Liste hinzugefügt werden.
Da Mammal Sellable jedoch nicht implementiert, kann neues Mammal() nicht zur Liste hinzugefügt werden.
Andere Initialisierungsblöcke können auf ähnlichen Linien überprüft werden.
Es gibt also nur einen Initialisierungsblock, der einen Kompilierungsfehler verursacht.
 * */
package JAVA_OCA_Test_3.Aufgaben_30_bis_39;

import java.util.ArrayList;
import java.util.List;

interface Sellable {}
abstract class Animal {}
class Mammal extends Animal{}
class Rabbit extends Mammal implements Sellable{}

public class test38 {
    public static void main(String[] args) {
        {
            List<Animal> list = new ArrayList<>();
            list.add(new Rabbit());
        }
        {
            List<Animal> list = new ArrayList<>();
            list.add(new Mammal());
        }
        {
            List<Mammal> list = new ArrayList<>();
            list.add(new Rabbit());
        }
        {
            List<Mammal> list = new ArrayList<>();
            list.add(new Mammal());
        }

//        {
//            List<Sellable> list = new ArrayList<>();
//            list.add(new Mammal());
//        }
        {
            List<Sellable> list = new ArrayList<>();
            list.add(new Rabbit()); // das geht weil Rabbit in Mammal hinzugefügt wurde
        }
    }
}
