package JACA_OCA_Test1.Aufgaben10bis19;

import java.util.ArrayList;
import java.util.List;
/*
* In deinem Code hast du versucht, ein Element mit dem Wert 'O' aus der Liste zu entfernen, aber die Methode remove() erwartet einen Index als Argument, nicht den Wert selbst.
* Da 'O' nicht als Index in der Liste vorhanden ist, wird eine IndexOutOfBoundsException ausgelöst.
* */
public class test10 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        //---Zum Testen auskommentieren!---
//        // löst eine 'IndexOutOfBoundsException' aus, wie oben beschrieben!
//        if(list.contains('O')){
//            list.remove('O');
//        }
        //---Zum Testen auskommentieren!---
//        // korrekt wäre das!
//        if(list.contains('O')){
//            int index = list.indexOf('O');
//            list.remove(index);
//        }

        for(char ch : list) {
            System.out.println(ch);
        }
    }
}
