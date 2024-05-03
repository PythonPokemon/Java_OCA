package JACA_OCA_Test1.Aufgaben1bis9;


class Point {
    int x;
    int y;

    void assign(int x, int y) {
        x = this.x;
        this.y = y;
    }

    public String tostring() {
        return "Point(" + x + ", " + y + ")";
    }
}

public class test9 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;
        Point p2 = new Point();
        p2.assign(p1.x, p1.y);
        System.out.println(p1.tostring() + ":" + p2.tostring());    // Point(10, 20):Point(0, 20)
    }
}

