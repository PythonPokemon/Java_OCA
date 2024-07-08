public class Test {

    static void statischeMethode(){
        System.out.println("Ich bin eine statische Methode" +
                " mich kann man aufrufen wenn man meine methode statisch macht" +
                " genial oder" +
                "+++");
    }

    void nichtStatischeMethode(){
        System.out.println("Ich bin nicht statisch, für mich braucht man ein Objekt dummy in der main" +
                " damit man mich verwenden kann" +
                " cool oder" +
                " :-)");
    }

    public static void main(String[] args) {
        Test instanzObjekt = new Test(); // InstanzObjekt der Klasse Test
        var instanzdummy2 = new Test(); // weiteres objekt mit verkürzter schreibweise anlegen?
        instanzObjekt.nichtStatischeMethode();

        Test.statischeMethode();
    }
}