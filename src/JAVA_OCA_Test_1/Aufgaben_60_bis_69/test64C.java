/*
* Gesamterklärung
Class A and B are declared public and inside same package com.udayan.oca. Method print() of class A has correctly been overridden by B.

print() method is public so no issues in accessing it anywhere.

Let's check the code inside main method.

A obj1 = new A(); => obj1 refers to an instance of class A.

B obj2 = (B)obj1; => obj1 is of type A and it is assigned to obj2 (B type), hence explicit casting is necessary.
* obj1 refers to an instance of class A, so at runtime obj2 will also refer to an instance of class A.
* sub type can't refer to an object of super type so at runtime B obj2 = (B)obj1; will throw ClassCastException.
* */

package JAVA_OCA_Test_1.Aufgaben_60_bis_69;


public class test64C {
    public static void main(String[] args) {

//        // Variante 1 | ClassCastException
//        test64A obj1 = new test64A();
//        test64B obj2 = (test64B) obj1;
//        obj2.print();
//    }

//        // Variante 2 | korrekt
        test64A obj1 = new test64B(); // Objekt als test64B instanziieren
        if (obj1 instanceof test64B) {
            test64B obj2 = (test64B) obj1;
            obj2.print();
        }
    }
}