package JAVA_Insel_Smart.OCA.Kapitel_7.Schnittstellen;

// Klasse Car, die sowohl Vehicle als auch Electric implementiert
class Car1 implements Vehicle, Electric {
    private String model;

    public Car1(String model) {
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
