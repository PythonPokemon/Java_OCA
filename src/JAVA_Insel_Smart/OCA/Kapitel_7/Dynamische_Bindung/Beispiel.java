package JAVA_Insel_Smart.OCA.Kapitel_7.Dynamische_Bindung;

class Oberklasse1 {
    @Override
    public String toString() {
        return "Oberklasse";
    }
}

class Unterklasse1 extends Oberklasse1 {
    @Override
    public String toString() {
        return "Unterklasse";
    }
}

class AndereUnterklasse extends Oberklasse1 {
    // Erbt die toString()-Methode von Oberklasse
}

public class Beispiel {
    public static void main(String[] args) {
        Oberklasse1 obj1 = new Oberklasse1();
        Oberklasse1 obj2 = new Unterklasse1();// tatsächliches instanzDummy von Unterklasse mit der referenz zur Oberklasse
        Oberklasse1 obj3 = new AndereUnterklasse();

        System.out.println(obj1.toString()); // Gibt "Oberklasse" aus
        System.out.println(obj2.toString()); // Gibt "Unterklasse" aus
        System.out.println(obj3.toString()); // Gibt "Oberklasse" aus
    }
}
