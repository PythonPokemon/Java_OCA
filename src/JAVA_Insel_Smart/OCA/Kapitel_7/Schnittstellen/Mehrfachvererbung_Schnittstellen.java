package JAVA_Insel_Smart.OCA.Kapitel_7.Schnittstellen;
// muss importiert werden, weil die im verzeichnis daneben liegen
import JAVA_Insel_Smart.OCA.Kapitel_7.Schnittstellen.Separates_Beispiel.Electric;
import JAVA_Insel_Smart.OCA.Kapitel_7.Schnittstellen.Separates_Beispiel.Vehicle;

class SuperVehicle {
    public void startEngine() {
        System.out.println("Engine started.");
    }
}

class Car extends SuperVehicle implements Vehicle, Electric {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println(model + " is driving.");
    }

    @Override
    public void charge() {
        System.out.println(model + " is charging.");
    }
}

public class Mehrfachvererbung_Schnittstellen {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model 3");
        myCar.startEngine(); // Ausgabe: Engine started.
        myCar.drive();       // Ausgabe: Tesla Model 3 is driving.
        myCar.charge();      // Ausgabe: Tesla Model 3 is charging.
    }
}
