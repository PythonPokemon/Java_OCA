/*

* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Statische_Klassen_Methoden_Konstanten;
// Eine Klassenvariable, deren Wert von allen Instanzen geteilt wird und geändert werden kann.

class KlassenDummy {
    static int Klassenvariable = 10; // Klassenvariable

}

public class Static_ohne_Final {
    public static void main(String[] args) {
        // bei Static braucht man keinen ObjektInstanz Dummy
        System.out.println(KlassenDummy.Klassenvariable); // 10

        KlassenDummy.Klassenvariable = 20;
        System.out.println(KlassenDummy.Klassenvariable); // 20
    }
}
