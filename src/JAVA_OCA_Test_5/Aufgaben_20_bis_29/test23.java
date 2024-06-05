/*


 * */
package JAVA_OCA_Test_5.Aufgaben_20_bis_29;

public class test23 {
    public static void main(String[] args) {
        P p = new R(); //Line n1
        System.out.println(p.compute("Go")); //Line n2 | gogogo
    }
}

class P {
    String compute(String str) {
        return str + str + str;
    }
}

class Q extends P {
    String compute(String str) {
        return super.compute(str.toLowerCase());
    }
}

class R extends Q {
    String compute(String str) {
        return super.compute(str.replace('o', 'O')); //2nd argument is uppercase O
    }
}
