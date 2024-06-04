/*


 * */
package JAVA_OCA_Test_4.Aufgaben_40_bis_49;

public class test49 {
    public static void main(String[] args) {
        String [] arr = {"A", "B", "C", "D"};
        arr[0] = arr[1];    // Index 0 wird mit 1 überschrieben und ausgegeben | also aus A wird B
        arr[1] = "E";       // Index 1 wird mit E überschrieben und ausgegeben | also aus B wird E
        for(String s : arr) {   // gibt den rest der elemenet aus | also C und D
            System.out.print(s + " "); // B E C D
        }
    }
}
