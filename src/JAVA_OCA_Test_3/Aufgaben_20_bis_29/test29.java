/*
Good

Gesamterklärung
Wenn die Methode change(String) aufgerufen wird, beziehen sich sowohl die Variablen s als auch str auf dasselbe String-Objekt.

Zeile 9 ändert das übergebene Objekt nicht, sondern erstellt ein neues String-Objekt "Good_Morning".

Dieses neu erstellte Objekt wird jedoch nicht referenziert und ist daher ein Kandidat für GC.

Wenn die Steuerung wieder die Methode main(String[]) aufruft, verweist str immer noch auf "Gut".

Zeile 5 druckt "Gut" auf die Konsole.

 * */
package JAVA_OCA_Test_3.Aufgaben_20_bis_29;

public class test29 {
    public static void main(String[] args) {
        String str = "Good"; //Line 3
        change(str); //Line 4
        System.out.println(str); //Line 5
    }

    private static void change(String s) {
        s.concat("_Morning"); //Line 9
    }
}
