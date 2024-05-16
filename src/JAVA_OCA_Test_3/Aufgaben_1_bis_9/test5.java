/*
NullPointerException is thrown at runtime

Gesamterklärung
Alle Elemente des Arrays werden mit den jeweiligen Nullen (im Falle des primitiven Typs) oder null (im Falle des Referenztyps) initialisiert.

arr[0] bezieht sich also auf null.

Die Methode 'isEmpty()' wird bei der Nullreferenz aufgerufen und daher NullPointerException zur Laufzeit ausgelöst.
 * */
package JAVA_OCA_Test_3.Aufgaben_1_bis_9;

public class test5 {
    public static void main(String[] args) {
        String [] arr = new String[1];
        System.out.println(arr[0].isEmpty());
    }
}
