/*
* switch kann primitive Typen akzeptieren: byte, short, int, char; Wrapper-Typen: Byte, Short, Integer, Character; String und Enumerationen.
* In diesem Fall sind alle gültige Werte, aber nur 3 führt "case 7:" aus. case vergleicht den ganzzahligen Wert 7.
*
* HINWEIS: Zeichen sieben, '7' unterscheidet sich vom ganzzahligen Wert sieben, 7.
* "char var = '7';" und "Zeichen var = '7';" drucken also DEFAULT auf die Konsole.
* */

package JAVA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_50_bis_59;
/*
* In der main-Methode wird eine Variable var deklariert und initialisiert. Diese Variable kann entweder vom Typ int oder char sein.
*
* Es gibt zwei Varianten, um var zu initialisieren:
* entweder als int oder als char. Eine von ihnen ist auskommentiert, während die andere aktiviert ist.
*
* In der Switch-Anweisung wird überprüft, welcher Fall auf var zutrifft.
* Wenn var den Wert 7 hat, wird "Glück Nr. 7" ausgegeben. Andernfalls wird "STANDART" ausgegeben.
* */
public class test51 {
    public static void main(String[] args) {

        //Variante 1 | Richtig | zum Testen auskommentieren
        // Character var = 7;
         char var = 7;
        // Integer var = 7;
//----------------------------------------------------------------------------------------------------------------------
        // Variante 2 | Falsch | zum Testen auskommentieren
        // Character var = '7';
        // char var = '7';

        switch(var) {
            case  7:
                System.out.println("Glück Nr. 7");
                break;
            default:
                System.out.println("STANDART");
        }
    }
}
