/*
Ablauf und Erklärung:

Definition der Klasse Message:
Die Klasse Message hat ein Feld msg, das initial auf "Happy New Year!" gesetzt ist.
Die Methode print() gibt den Wert des Feldes msg aus.
------------------------------------------------------------------------------------------------------------------------
Methode change:
Die statische Methode change(Message m) ändert den Wert des Feldes msg des übergebenen Message-Objekts auf "Happy Holidays!".
------------------------------------------------------------------------------------------------------------------------
main-Methode:
Zeile n1: Message obj = new Message();
Ein neues Message-Objekt wird erstellt. Das Feld msg wird auf "Happy New Year!" gesetzt.

Zeile n2: obj.print();
Die print()-Methode des Objekts obj wird aufgerufen, wodurch "Happy New Year!" ausgegeben wird.

Zeile n3: change(obj);
Die statische Methode change wird mit dem Objekt obj als Argument aufgerufen.
Innerhalb dieser Methode wird das Feld msg des Objekts obj auf "Happy Holidays!" geändert.

Zeile n4: obj.print();
Die print()-Methode des Objekts obj wird erneut aufgerufen, wodurch nun "Happy Holidays!" ausgegeben wird.
------------------------------------------------------------------------------------------------------------------------
Detaillierte Erklärung der Objektreferenzen:
In Java werden Objekte über Referenzen manipuliert. Wenn obj an die Methode change übergeben wird,
wird eine Kopie der Referenz übergeben.
Beide, die ursprüngliche Referenz obj und die Referenz m in der Methode change, zeigen auf dasselbe Message-Objekt im Speicher.

Änderungen, die innerhalb der Methode change am Objekt m vorgenommen werden,
wirken sich auf dasselbe Objekt aus, auf das obj zeigt.
Daher wird der Wert von msg innerhalb der Methode change tatsächlich geändert.
------------------------------------------------------------------------------------------------------------------------
Zusammengefasster Ablauf:
Ein Message-Objekt wird erstellt, und sein msg-Feld wird auf "Happy New Year!" gesetzt.
Das erste print() gibt "Happy New Year!" aus.
Die Methode change ändert das msg-Feld des Objekts auf "Happy Holidays!".
Das zweite print() gibt nun "Happy Holidays!" aus.
 * */

package JAVA_OCA_Test_2.Aufgaben_20_bis_29;

class Message {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class test23 {
    public static void change(Message m) { //Line n5
        m.msg = "Happy Holidays!"; //Line n6
    }   // explizite beschwörung

    public static void main(String[] args) {
        Message obj = new Message(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
    }
}
