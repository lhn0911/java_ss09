package ss09;

public class Bai7 {
    public static void main(String[] args) {
        QuadraticEquation eq1 = new QuadraticEquation(1, -3, 2);
        eq1.display();

        QuadraticEquation eq2 = new QuadraticEquation(1, -2, 1);
        eq2.display();

        QuadraticEquation eq3 = new QuadraticEquation(1, 2, 5);
        eq3.display();
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public boolean hasRealRoots() {
        return getDiscriminant() >= 0;
    }

    public double getRoot1() {
        if (!hasRealRoots()) {
            return Double.NaN;
        }
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        if (!hasRealRoots()) {
            return Double.NaN;
        }
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public void display() {
        double delta = getDiscriminant();
        System.out.println("Phuong trinh: " + a + "x^2 + " + b + "x + " + c + " = 0");
        if (delta > 0) {
            System.out.println("Hai nghiem phan biet: x1 = " + getRoot1() + ", x2 = " + getRoot2());
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep: x = " + getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
