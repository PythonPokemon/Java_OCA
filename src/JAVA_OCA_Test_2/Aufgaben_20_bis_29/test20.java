/*
* Welche Optionen für den Klassentest, wenn sie zum Ersetzen von INSERT verwendet werden, drucken "Apfel Mango Orange Traube " auf die Konsole?

Wählen Sie 2 Optionen.
*
* */
package JAVA_OCA_Test_2.Aufgaben_20_bis_29;

public class test20 {
    public static void main(String[] args) {
        String[][] fruits = {{"apple", "mango"}, {"orange", "grape"}};
        /*INSERT*/


//----------------------------------------------------------------------------------------------------------------------
//Richtige Auswahl
        for (String[] arr : fruits)
            for (String fruit : arr)
                System.out.print(fruit + " ");                      // apple mango orange grape


////Richtige Auswahl
//        for (int i = 0; i < fruits.length; i++)
//            for (int j = 0; j < fruits[i].length; j++)
//                System.out.print(fruits[i][j] + " ");           // apple mango orange grape
//
//----------------------------------------------------------------------------------------------------------------------
//        for (int i = 1; i < fruits.length; i++)
//            for (int j = 1; j < fruits[i].length; j++)
//                System.out.print(fruits[i][j] + " ");         //<-- grape


//        for (int i = 1; i <= fruits.length; i++)
//            for (int j = 1; j <= fruits[i].length; j++)
//                System.out.print(fruits[i][j] + " ");         //<--  java.lang.ArrayIndexOutOfBoundsException:

    }
}