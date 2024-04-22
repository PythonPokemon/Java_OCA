package TestAufgaben;

public class LZK9 {
    public static void main(String[] args) {
        float f3 = 100;
        double d1 = 203.22;
//        float f1 = d1;  // compilerfehler | da d1 schon bei double deklariert und ein zugewiesen wurde!
        int i5 = 100;
        float f5 = (float) i5;
        float f2 = (float) 1_11.00;
        float f4 = 100F;

        System.out.println(f3);
        System.out.println(d1);
//        System.out.println(f1);
        System.out.println(i5);
        System.out.println(f5);
        System.out.println(f2);
        System.out.println(f4);

    }
}
