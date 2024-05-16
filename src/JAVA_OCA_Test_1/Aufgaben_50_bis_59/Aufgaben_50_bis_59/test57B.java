/*
* Der vorliegende Code definiert zwei Klassen: test57A und test57B.
* Die Klasse test57B erweitert die Klasse test57A. Beide Klassen haben Mitgliedsvariablen namens i1 und i2.
*
* In der Methode print() der Klasse test57B wird ein Objekt der Klasse test57A erstellt.
* Da test57B von test57A erbt, kann test57B auf die öffentlichen und geschützten Mitglieder von test57A zugreifen.
*
* Die Zeile 8 (System.out.println(obj.i1);) druckt den Wert der Variable i1 des test57A-Objekts obj aus, was funktioniert, da i1 öffentlich ist.
* Die Zeile 9 (System.out.println(obj.i2);) verursacht einen Compilerfehler, da i2 in test57A als geschützt deklariert ist.
* Geschützte Variablen sind nur für Klassen im selben Paket oder für abgeleitete Klassen sichtbar.
* Obwohl test57B eine abgeleitete Klasse von test57A ist, kann sie i2 nicht direkt über ein Objekt von test57A zugreifen, da i2 in test57A geschützt ist.
*
* Die Zeile 10 (System.out.println(this.i2);) druckt den Wert von i2 der aktuellen Instanz von test57B aus, da i2 direkt von test57B geerbt wird.
* Die Zeile 11 (System.out.println(super.i2);) druckt den Wert von i2 der übergeordneten Klasse test57A aus, da test57B von test57A erbt und daher super verwendet wird, um auf die Mitglieder von test57A zuzugreifen.
*
*---------------------------------------------ACHTUNG-------------------------------------------------------------------
* Allerdings haben sie keinen direkten Zugriff auf private Instanzvariablen oder Methoden der übergeordneten Klasse.
* Private Elemente sind nur innerhalb der Klasse, in der sie deklariert sind,
* sichtbar und können nicht von abgeleiteten Klassen aufgerufen werden.
*------------------------------------------ZUSATZ WISSEN----------------------------------------------------------------
* Nein, normalerweise kann man nicht direkt auf private oder geschützte Daten einer Klasse zugreifen, weder über this noch über super.
* Private Variablen und Methoden sind nur innerhalb der Klasse, in der sie deklariert sind, sichtbar
* und können nicht von anderen Klassen direkt zugegriffen werden.
* Geschützte (protected) Variablen und Methoden sind zwar für abgeleitete Klassen sichtbar, aber auch nur innerhalb derselben Pakets.
*
* Jedoch gibt es eine Möglichkeit, auf private Variablen und Methoden zuzugreifen,
* und zwar durch öffentliche oder geschützte Zugriffsmethoden (Getter- und Setter-Methoden).
* Diese Methoden können den Wert einer privaten Variablen setzen oder zurückgeben, und dadurch ermöglichen sie den indirekten Zugriff auf private Daten.
*   */

package JAVA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_50_bis_59;

public class test57B extends test57A {
    public void print(){
        test57A obj = new test57A();
        System.out.println(obj.i1); //Line 8
//        System.out.println(obj.i2); //Line 9      //<-- verursacht compiler fehler
        System.out.println(this.i2); //Line 10
        System.out.println(super.i2); //Line 11
    }

    public static void main(String [] args) {
        new test57B().print();
    }
}
