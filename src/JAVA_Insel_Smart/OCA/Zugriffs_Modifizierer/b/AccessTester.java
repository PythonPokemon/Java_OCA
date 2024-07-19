package JAVA_Insel_Smart.OCA.Zugriffs_Modifizierer.b;
import JAVA_Insel_Smart.OCA.Zugriffs_Modifizierer.a.AccessTest;

public class AccessTester extends AccessTest {
    public static void main(String[] args) {
        AccessTest ref = new AccessTest();

        // Zugriff auf die verschiedenen Mitglieder
        // ref.a; // Nicht zugänglich, da package-private und AccessTest in einem anderen Paket ist.
        // ref.b; // Nicht zugänglich, da private.
        // ref.c(); // Nicht zugänglich, da protected und wir verwenden eine Instanz von AccessTest.
        System.out.println(ref.d()); // Zugänglich, da public.
    }
}