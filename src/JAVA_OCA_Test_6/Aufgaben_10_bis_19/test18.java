/*
Which of the following options can replace
Select 4 options.
------------------------------------------------------------------------------------------------------------------------
p -> !!!!true                       <--- Correct selection
p -> true                           <--- Correct selection
p -> p.length() >= 1                <--- Correct selection
(String p) -> p.length() < 100      <--- Correct selection

p -> p.length() < 7
p -> !!false
String p -> p.length() > 0

 * */
package JAVA_OCA_Test_6.Aufgaben_10_bis_19;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class test18 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("an");
        words.add("the");
        words.add("when");
        words.add("what");
        words.add("Where");
        words.add("whether");

        processStringArray(words, p -> true/*INSERT*/);
    }

    private static void processStringArray(List<String> list, Predicate<String> predicate) {
        for(String str : list) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
