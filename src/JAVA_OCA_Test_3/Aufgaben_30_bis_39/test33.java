/*
Space Station

Gesamterklärung
jdn - > "Raumstation"
sb.delete(5, 6) -> "Spacetation"
sb.insert(5, " S") -> "Raumstation"
sb.toString() -> Erstellt ein neues String-Objekt "Raumstation"
"Space Station".toUpperCase() -> Erstellt ein weiteres String-Objekt "SPACE STATION", aber das String-Objekt wird nicht referenziert und verwendet.
Der Methodenaufruf auf sb modifiziert dasselbe Objekt, so dass nach insert(5, " S") der Methodenaufruf sb auf "Raumstation" verweist und dies auf der Konsole ausgegeben wird
 * */
package JAVA_OCA_Test_3.Aufgaben_30_bis_39;

public class test33 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("SpaceStation");
        sb.delete(5, 6).insert(5, " S").toString().toUpperCase();
        System.out.println(sb);
    }
}
