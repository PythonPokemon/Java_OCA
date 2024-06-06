/*


 * */
package JAVA_OCA_Test_6.Aufgaben_60_bis_69;
import java.util.ArrayList;
import java.util.List;

public class test61 {
    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        places.add("Austin");
        places.add("Okinawa");
        places.add("Giza");
        places.add("Manila");
        places.add("Batam");
        places.add("Giza");

        if(places.remove("Giza"))
            places.remove("Austin");

        System.out.println(places); // [Okinawa, Manila, Batam, Giza]
    }
}
