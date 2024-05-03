package JACA_OCA_Test_1.Aufgaben_10_bis_19;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class test11 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time));  // 1947-08-14T23:59:59.999999999
    }
}
