package Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        // Schleifenzähler |
        // Vorteil startpunkt bsp. 1 oder 3 usw. oder Endpunkt bestimmbar
        // oder jedes zweite element soll betrachtet werden und nicht jedes (Schrittweite)
        // kann mehrere indexe gleichzeitig ablaufen
        // kann auch rückwärts ablaufen, vom endpunkt zum startpunkt
        String[] names = {"Cora", "Chris"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);       // gibt in der konsole die einträge aus dem arrays aus = Cora Chris
        }

        // erweiterte for-schleife Variante wie oben, nur vereinfacht
        // Reihenfolge ist immer star, von vorne nach hinten
        for (String name : names)
            System.out.println(name);

        // modifiziert, erweiterte for schleif
        int count = 1;
        for (String name : new String[]{"lilo", "lola", null, "Max"}) {
            if ( name == null)
                continue;   // break = würde bei null, abbrechenS
            System.out.println(count + ". " + name);
            count++;
        }


    }
}
