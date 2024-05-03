package JACA_OCA_Test_1.Aufgaben_10_bis_19;

import java.time.LocalDate;

public class test14 {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);    // false:true
    }
}
