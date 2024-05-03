package JACA_OCA_Test1.Aufgaben1bis9;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class test5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.println(formatter.format(date.minus(period)));   // 11-11-11
    }
}
