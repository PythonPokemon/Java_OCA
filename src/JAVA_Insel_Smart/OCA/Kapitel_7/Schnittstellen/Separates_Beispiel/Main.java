package JAVA_Insel_Smart.OCA.Kapitel_7.Schnittstellen.Separates_Beispiel;


// Verwenden der Klasse Car
public class Main {
    public static void main(String[] args) {
        Car1 myCar = new Car1("Tesla Model 3");
        myCar.drive();  // Ausgabe: Tesla Model 3 is driving.
        myCar.charge(); // Ausgabe: Tesla Model 3 is charging.
    }
}
