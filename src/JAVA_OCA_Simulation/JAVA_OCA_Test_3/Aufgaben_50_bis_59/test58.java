/*
[Walnut, Apricot, Almond, Date]

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_50_bis_59;
import java.util.ArrayList;
import java.util.List;

public class test58 {
    public static void main(String[] args) {
        List<StringBuilder> dryFruits = new ArrayList<>();
        dryFruits.add(new StringBuilder("Walnut"));
        dryFruits.add(new StringBuilder("Apricot"));
        dryFruits.add(new StringBuilder("Almond"));
        dryFruits.add(new StringBuilder("Date"));

        for(int i = 0; i < dryFruits.size(); i++)
        {
            if(i == 0) {
                dryFruits.remove(new StringBuilder("Almond"));
            }
        }

        System.out.println(dryFruits);
    }
}
