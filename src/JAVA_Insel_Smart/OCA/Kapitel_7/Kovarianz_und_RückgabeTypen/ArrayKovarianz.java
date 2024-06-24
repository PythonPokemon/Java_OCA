package JAVA_Insel_Smart.OCA.Kapitel_7.Kovarianz_und_RückgabeTypen;

class Oberklasse {
    public void print() {
        System.out.println("Ich bin die Oberklasse");
    }
}

class Unterklasse extends Oberklasse {
    @Override
    public void print() {
        System.out.println("Ich bin die Unterklasse");
    }
}

public class ArrayKovarianz {
    public static void main(String[] args) {
        Unterklasse[] unterArray = new Unterklasse[10];
        Oberklasse[] oberArray = unterArray;

        // Initialisierung der Elemente des Arrays
        for (int i = 0; i < unterArray.length; i++) {
            unterArray[i] = new Unterklasse();
        }

        // Zugriff auf das Array über das Oberklasse-Array
        for (Oberklasse element : oberArray) {
            element.print();
        }

        // Dies verursacht einen Laufzeitfehler (ArrayStoreException)
        try {
            oberArray[0] = new Oberklasse(); // Einfügen eines Oberklasse-Objekts in das Unterklasse-Array
        } catch (ArrayStoreException e) {
            System.out.println("Laufzeitfehler: " + e.getMessage());
        }
    }
}
