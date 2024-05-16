/*
6

Gesamterklärung
Anfänglich i = 5. if(i++ < 6) bedeutet if(5 < 6) und dann i = 6.

5 < 6 wahr ist, geht das Steuerelement in den if-Block und führt System.out.println(i++);
Dadurch wird der aktuelle Wert von i auf die Konsole ausgegeben, der 6 ist, und danach wird der Wert von i um 1 erhöht, sodass i zu 7 wird.
 * */
package JAVA_OCA_Test_3.Aufgaben_20_bis_29;

public class test21 {
    public static void main(String[] args) {
        int i = 5;
        if(i++ < 6) {
            System.out.println(i++);
        }
    }
}
