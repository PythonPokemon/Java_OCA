public class Test {
    public static void main(String[] args) {
        int ganzZahl1 = 1;
        long langeZahl = 9_999_999;
        float gleitKomma1 = 2.123f;


        int komma_zu_ganzZahl = (int) gleitKomma1;
        float ganzzahlZuKomma = (float) ganzZahl1;
        double großeKommaZahl = (double) langeZahl;

        System.out.println(komma_zu_ganzZahl);
        System.out.println(ganzzahlZuKomma);
        System.out.println(großeKommaZahl);
    }
}