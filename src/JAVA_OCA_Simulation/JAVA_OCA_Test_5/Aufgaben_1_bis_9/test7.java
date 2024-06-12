/*
And below options:

1.
Add below import statement in Creator.java file:
import com.udayankhattry.galaxy.Planet;
------------------------------------------------------------------------------------------------------------------------
2.
Add below import statement in Creator.java file:
import com.udayankhattry.oca.test.TestCreator;
------------------------------------------------------------------------------------------------------------------------
3.
Add below import statement in TestCreator.java file:
import com.udayankhattry.oca.Creator;
------------------------------------------------------------------------------------------------------------------------
4.
Add below import statement in TestCreator.java file:
import com.udayankhattry.galaxy.Planet;
------------------------------------------------------------------------------------------------------------------------
Which of the above options needs to be done so that on executing TestCreator class,
"Planet: Earth" is printed on to the console?
Please note: Unnecessary imports are not allowed.
------------------------------------------------------------------------------------------------------------------------
Correct answer
1 & 3 only
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_1_bis_9;
// Dateien: Creator | Planet
public class test7 {
    public static void main(String[] args) {
        System.out.println(Creator.create());
    }
}
