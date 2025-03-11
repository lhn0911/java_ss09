package ss09;

import java.util.Scanner;

class Circle {
    private double ra;
    public Circle() {
        this.ra = 1.0;
    }
    public Circle(double ra) {
        this.ra = ra;
    }
    public double getArea() {
        return 3.14 * ra*ra;
    }
    public double getCircumference() {
        return 2 * 3.14 * ra;
    }
    public void display() {
        System.out.println("bkinh: " + ra);
        System.out.println("dien tich: " + getArea());
        System.out.println("Chu vi: " + getCircumference());
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("htron ban dau:");
        circle1.display();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap bkinh htron: ");
        double radius = scanner.nextDouble();
        Circle circle2 = new Circle(radius);

        System.out.println("htron:");
        circle2.display();

        scanner.close();
    }
}
