package ss09;

class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point2D p) {
        return Math.sqrt((this.x - p.x)*(this.x - p.x) + ((this.y - p.y)*(this.y - p.y)));
    }

    public void displayPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
public class Bai6 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3, 4);
        Point2D p2 = new Point2D(6, 8);

        p1.displayPoint();
        p2.displayPoint();

        System.out.println("Distance: " + p1.distanceTo(p2));

        p1.setX(10);
        p1.setY(12);
        System.out.println("Updated p1:");
        p1.displayPoint();
    }
}