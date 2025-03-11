package ss09;

import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("Chiều dài: " + length);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle hcn = new Rectangle();
        System.out.println("hcn:");
        hcn.display();

        System.out.println("Nhập chiều dài: ");
        double length = sc.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        double width = sc.nextDouble();

        Rectangle hcn2 = new Rectangle(length, width);
        System.out.println("hcn:");
        hcn2.display();

        sc.close();
    }
}
