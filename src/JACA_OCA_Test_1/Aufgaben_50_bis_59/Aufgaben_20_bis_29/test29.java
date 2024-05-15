/*
* In diesem Code wird eine Klasse mit dem Namen test29 definiert.
* Innerhalb dieser Klasse werden drei Instanzvariablen deklariert, aber nicht initialisiert:
*
* var1 vom Typ char.
* var2 vom Typ double.
* var3 vom Typ float.
*
* In Java werden Instanzvariablen automatisch mit einem Standardwert initialisiert, wenn sie nicht explizit initialisiert werden.
* Die Standardinitialisierung erfolgt wie folgt:
*
* Für numerische Datentypen (wie char, double, float, etc.) ist der Standardwert 0. | <---- WICHTIG
* Für Objektreferenzen (wie String, ArrayList, usw.) ist der Standardwert null.     | <---- WICHTIG
*
* Daher werden in der main-Methode des test29-Objekts erstellt (obj),
* aber da keine expliziten Werte für die Instanzvariablen zugewiesen wurden, behalten sie ihre Standardwerte bei:
*
* var1 wird als '\u0000' initialisiert, was das Unicode-Nullzeichen darstellt.
* var2 wird als 0.0 initialisiert.
* var3 wird als 0.0f initialisiert.
*
* Der Code gibt dann die Werte dieser Instanzvariablen aus.
* Da sie nicht explizit initialisiert wurden, werden die Standardwerte für diese Datentypen angezeigt:
* */

package JACA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_20_bis_29;


public class test29 {

    // Variante 1
    char var1;
    double var2;
    float var3;
    float var4;

//----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        // variante 1   | <-- was, kommt raus?
        test29 obj = new test29();
        System.out.println("> " + obj.var1);
        System.out.println("> " + obj.var2);
        System.out.println("> " + obj.var3);
        System.out.println("> " + obj.var4 + "f");

    }
}
