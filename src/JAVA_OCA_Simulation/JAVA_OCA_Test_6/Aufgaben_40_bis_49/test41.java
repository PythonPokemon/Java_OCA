/*

CARPE DIEM
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_40_bis_49;
import java.io.IOException;

class Super {
    Super() throws RuntimeException {
        System.out.print("CARPE ");
    }
}

class Sub extends Super {
    Sub() throws IOException {
        System.out.print("DIEM ");
    }
}

public class test41 {
    public static void main(String[] args) throws Exception {
        new Beb();
    }
}
