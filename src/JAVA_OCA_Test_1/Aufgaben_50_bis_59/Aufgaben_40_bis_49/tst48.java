/*
* Dieser Code erstellt ein Array vom Typ Object mit einer Größe von 4 Elementen.
* Dann wird eine Schleife durchlaufen, die drei Mal durchgeführt wird.
* In jeder Iteration wird ein Objekt erstellt und in das Array an der entsprechenden Position eingefügt.
*
* Iteration (i = 1):
* Ein neues String-Objekt mit dem Wert "Java" wird erstellt und an der Position 1 im Array gespeichert.
*
* Iteration (i = 2):
* Ein neues StringBuilder-Objekt mit dem Wert "Java" wird erstellt und an der Position 2 im Array gespeichert.
*
* Iteration (i = 3):
* Ein neues SpecialString-Objekt mit dem Wert "Java" wird erstellt und an der Position 3 im Array gespeichert.
Danach wird eine Schleife durch das Array durchlaufen, und jedes Element wird mit System.out.println() ausgegeben.
* */

package JAVA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_40_bis_49;

class SpecialString {
    String str;

    SpecialString(String str) {
        this.str = str;
    }
}

public class tst48 {
    public static void main(String[] args) {
        Object[] arr = new Object[4];
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    arr[i] = new String("Java");
                    break;
                case 2:
                    arr[i] = new StringBuilder("Java");
                    break;
                case 3:
                    arr[i] = new SpecialString("Java");
                    break;
            }
        }
        for (Object obj : arr) {
            System.out.println(obj);    // <-- was kommt raus?
        }
    }
}
