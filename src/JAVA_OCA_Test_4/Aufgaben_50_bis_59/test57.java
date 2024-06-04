/*


 * */
package JAVA_OCA_Test_4.Aufgaben_50_bis_59;
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

public class test57 {
    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1();
        } catch (FileNotFoundException e) {
            System.out.print("X");  // X
        } catch (IOException e) {
            System.out.print("Y");
        } finally {
            System.out.print("Z");  // Z
        }
    }
}
