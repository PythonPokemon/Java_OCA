package JAVA_OCA_Test_5.Aufgaben_1_bis_9;

public interface Sellable {
    double getPrice();

    default String symbol() {
        return "$";
    }
}