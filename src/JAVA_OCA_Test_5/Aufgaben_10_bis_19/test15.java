/*

HAKUNAMATATA
 * */
package JAVA_OCA_Test_5.Aufgaben_10_bis_19;
import java.io.IOException;

class Parent {
    Parent() throws IOException {
        System.out.print("HAKUNA");
    }
}

class Child extends Parent {
    Child() throws Exception {
        System.out.println("MATATA");
    }
}

public class test15 {
    public static void main(String[] args) throws Exception {
        new Child();
    }
}
