import java.awt.Point;

public class A5_1 {
    public static void printPoint(Point point)    {
        System.out.println("(" + point.x + ", " + point.y + ")");
    }
    public static double getDistance(Point p1, Point p2) {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt((dx * dx) + (dy *dy));
    }
    static Point updatePoint(Point p1,int x,int y)     {
        p1.x=p1.x+x;
        p1.y=p1.y+y;
        return p1;
    }
    public static void main(String[] args) {
        Point p = new Point(10, 4);
        Point q = new Point(5, 4);

        System.out.println("First point:");
        printPoint(p);
        System.out.println("Second point:");
        printPoint(q);
        double distance = p.distance(q);
        System.out.println("Distance between two points:"+distance);

        Point a = updatePoint(p, 2, 2);
        System.out.println("Point after Update:");
        printPoint(a);
    }
}