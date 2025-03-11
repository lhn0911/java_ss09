package ss09;

class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(this.x + v.x, this.y + v.y);
    }

    public Vector2D sub(Vector2D v) {
        return new Vector2D(this.x - v.x, this.y - v.y);
    }

    public double dot(Vector2D v) {
        return this.x * v.x + this.y * v.y;
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(1, 2);

        System.out.print("Vector 1: ");
        v1.display();
        System.out.print("Vector 2: ");
        v2.display();

        System.out.println("Do dai Vector 1: " + v1.magnitude());
        System.out.println("Do dai Vector 2: " + v2.magnitude());

        Vector2D sum = v1.add(v2);
        System.out.print("Tong hai vector: ");
        sum.display();

        Vector2D dif = v1.sub(v2);
        System.out.print("Hieu hai vector: ");
        dif.display();

        System.out.println("Tich vo huong: " + v1.dot(v2));
    }
}
