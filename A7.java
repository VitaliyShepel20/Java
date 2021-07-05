public class A7 {
    public static void main(String[] args) {
        Relatable p1 = new Point(1, 2);
        Relatable p2 = new Point(2, 3);
        System.out.println(p1.isLargerThan(p2));
    }
}

interface Relatable {
    int isLargerThan(Relatable other);
}

class Point implements Relatable {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getMagnitude() {
        int sqrX = (this.x * this.x);
        int sqrY = (this.y * this.y);
        return Math.sqrt(sqrX + sqrY);
    }

    public int isLargerThan(Relatable other) {
        Point p2 = (Point) other;
        return Double.compare(this.getMagnitude(), p2.getMagnitude());

    }

}