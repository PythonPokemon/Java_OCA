package JAVA_Insel_Smart.OCA.Kapitel_10.Objekt_Kopieren;

// Tiefe_Kopie

class Tiefe_Kopie implements Cloneable {
    int x, y;

    Tiefe_Kopie(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected Tiefe_Kopie clone() {
        try {
            return (Tiefe_Kopie) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Klonen nicht unterstützt", e);
        }
    }

    @Override
    public String toString() {
        return "Punkt [x=" + x + ", y=" + y + "]";
    }
}

class RechteckMitPunkt implements Cloneable {
    private Tiefe_Kopie tiefeKopie;
    private int breite, hoehe;

    RechteckMitPunkt(Tiefe_Kopie tiefeKopie, int breite, int hoehe) {
        this.tiefeKopie = tiefeKopie;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    @Override
    protected RechteckMitPunkt clone() {
        try {
            RechteckMitPunkt cloned = (RechteckMitPunkt) super.clone();
            cloned.tiefeKopie = this.tiefeKopie.clone(); // Tiefe Kopie des Punkt-Objekts
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Klonen nicht unterstützt", e);
        }
    }

    @Override
    public String toString() {
        return "RechteckMitPunkt [punkt=" + tiefeKopie + ", breite=" + breite + ", hoehe=" + hoehe + "]";
    }

    public static void main(String[] args) {
        Tiefe_Kopie p1 = new Tiefe_Kopie(0, 0);
        RechteckMitPunkt r1 = new RechteckMitPunkt(p1, 5, 10);
        RechteckMitPunkt r2 = r1.clone();

        System.out.println(r1);  // RechteckMitPunkt [punkt=Punkt [x=0, y=0], breite=5, hoehe=10]
        System.out.println(r2);  // RechteckMitPunkt [punkt=Punkt [x=0, y=0], breite=5, hoehe=10]
        System.out.println(r1 == r2);  // false
        System.out.println(r1.tiefeKopie == r2.tiefeKopie);  // false
    }
}
