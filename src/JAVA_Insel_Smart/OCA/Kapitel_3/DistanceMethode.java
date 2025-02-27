package JAVA_Insel_Smart.OCA.Kapitel_3;

public class DistanceMethode {
    public static void main(String[] args) {
        java.awt.Point player = new java.awt.Point();
        player.setLocation( 10, 10 );

        java.awt.Point door = new java.awt.Point();
        door.setLocation( 10, 10 );

        java.awt.Point snake = new java.awt.Point();
        snake.setLocation( 20, 10 );

        System.out.println( player.distance( door ) ); // abstand zwischen player & door, beträgt: 0.0
        System.out.println( player.distance( snake ) ); // abstand zwischen player & snake, beträgt: 10.0
        System.out.println( player.distance( snake.x, snake.y ) ); //abstand zwischen player & snake, beträgt: 10.0

    }
}
