/*
 * class Test gives compilation error
 * */
package JACA_OCA_Test_2.Aufgaben_30_bis_39;
import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}

//public class test37 {
//    public static void main(String[] args) {
//        Super s = new Sub();
//        try {
//            s.m1();
//        } catch (IOException e) {
//            System.out.print("A");
//        } catch(FileNotFoundException e) {
//            System.out.print("B");
//        } finally {
//            System.out.print("C");
//        }
//    }
//}
