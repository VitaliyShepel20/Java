import java.awt.Point;

public class A5 {
    public static void main(String[] args) {

        Point p1 = new Point(1, 1); //point 1 at (1,1)
        Point p2 = new Point(4, 5); //point 2 at (4,5)
        System.out.println("Point P1: ");
        printPoint(p1);
        System.out.println("Point P2: ");
        printPoint(p2);
        Point answer = updatePoint(p1, 3, 3);
        double dist = getDistance(p1, p2);
        System.out.print("Updated point -> ");
        printPoint(answer);

        System.out.println("Distance = " + dist);
    }
    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    public static double getDistance(Point p1, Point p2) {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public static Point updatePoint(Point p, int x, int y) {
        p.x = x;
        p.y = y;
        return p;
    }


}