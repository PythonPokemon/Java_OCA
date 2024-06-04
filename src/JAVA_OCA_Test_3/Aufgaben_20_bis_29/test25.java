/*
Hello

Gesamterklärung
Die Variable msg bezieht sich auf das String-Objekt "Hello".

Es gibt nur ein Element im booleschen Array-Objekt, das mit dem Standardwert boolean initialisiert wird, der false ist.

flag[0] ist false, if-check schlägt fehl und control tritt nicht in den if-Block ein.

System.out.println(msg) gibt den ursprünglichen Wert von msg aus, der "Hello" ist.
 * */
package JAVA_OCA_Test_3.Aufgaben_20_bis_29;

public class test25 {
    public static void main(String[] args) {
        String msg = "Hello";
        boolean [] flag = new boolean[1];   // zahl spielt keine rolle, von 1 ... bis

        if(flag[0]) {   // [] Index compiler fehler | Index [1] wäre .ArrayIndexOutOfBoundsException
            msg = "Welcome";
        }
        System.out.println(msg);
    }
}
