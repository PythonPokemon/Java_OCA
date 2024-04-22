package TestAufgaben;

public class LZK4 {
    public static void main(String[] args) {
        String[] cartoons = {"Tom", "Jerry", "Micky", "Tom"};
        int counter = 0;

        if ("Tom".equals(cartoons[0])) {
            counter++;
        } else if ("Tom".equals(cartoons[1])){
            counter++;
        } else if ("Tom".equals(cartoons[2])){
            counter++;
        } else if ("Tom".equals(cartoons[3])){
            counter++;
        }
        System.out.println(counter);
    }
}
