package JAVA_Insel_Smart.OCA.Kapitel_7.Kovarianz_und_RückgabeTypen;

class Oberklasse1a {
    public void print() {
        System.out.println("Ich bin die Oberklasse");
    }
}

class Unterklasse1a extends Oberklasse1a {
    @Override
    public void print() {
        System.out.println("Ich bin die Unterklasse");
    }
}

public class ArrayKovarianz {
    public static void main(String[] args) {
        Unterklasse1a[] unterArray = new Unterklasse1a[10];
        Oberklasse1a[] oberArray = unterArray;

        // Initialisierung der Elemente des Arrays
        for (int i = 0; i < unterArray.length; i++) {
            unterArray[i] = new Unterklasse1a();
        }

        // Zugriff auf das Array über das Oberklasse-Array
        for (Oberklasse1a element : oberArray) {
            element.print();
        }

        // Dies verursacht einen Laufzeitfehler (ArrayStoreException)
        try {
            oberArray[0] = new Oberklasse1a(); // Einfügen eines Oberklasse-Objekts in das Unterklasse-Array
        } catch (ArrayStoreException e) {
            System.out.println("Laufzeitfehler: " + e.getMessage());
        }
    }
}
