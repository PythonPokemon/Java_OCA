/*
Above code causes compilation error, which modifications, done independently, enable the code to compile and on execution print 200 on to the console?

Select 4 options.

Replace INSERT with boolean NUM;

Remove final modifier from Line n1      //<--- Correct selection
with Object NUM;                        //<--- Correct selection
with short NUM;                         //<--- Correct selection
with int NUM;                           //<--- Correct selection

with byte NUM;
with double NUM;
with float NUM;

 * */
package JAVA_OCA_Test_6.Aufgaben_60_bis_69;

class Super {
    //    final int NUM = -1; //Line n1
    int NUM = -1; //Line n1 | Remove final modifier     //<--- Correct selection
}

class Sub extends Super {
    /*INSERT*/
    Object NUM;                        //<--- Correct selection
//    short NUM;                         //<--- Correct selection
//    int NUM;                           //<--- Correct selection
}

public class test68 {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.NUM = 200; //Line n2
        System.out.println(obj.NUM); //Line n3  | 200
    }
}
