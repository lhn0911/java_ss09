package ss09;

import java.util.Scanner;

enum Gender {
    MALE, FEMALE, OTHER;
}

class Student {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public Student() {}

    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhap ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ten: ");
        this.name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap gioi tinh (MALE/FEMALE/OTHER): ");
        this.gender = Gender.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Nhap dia chi: ");
        this.address = scanner.nextLine();
        System.out.print("Nhap so dien thoai: ");
        this.phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("ID: " + id + ", Ten: " + name + ", Tuoi: " + age + ", Gioi tinh: " + gender + ", Dia chi: " + address + ", SDT: " + phoneNumber);
    }

    public int getId() {
        return id;
    }
}

public class Bai10 {
    private static Student[] students = new Student[10];
    private static int studentCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Hien thi danh sach sinh vien");
            System.out.println("2. Them moi sinh vien");
            System.out.println("3. Sua thong tin sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: displayStudents(); break;
                case 2: addStudent(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: return;
                default: System.out.println("Lua chon khong hop le.");
            }
        }
    }

    private static void displayStudents() {
        if (studentCount == 0) {
            System.out.println("Danh sach rong.");
        } else {
            for (int i = 0; i < studentCount; i++) {
                students[i].displayData();
            }
        }
    }

    private static void addStudent() {
        if (studentCount == students.length) {
            System.out.println("Danh sach day, khong the them.");
            return;
        }
        Student newStudent = new Student();
        newStudent.inputData(scanner);
        students[studentCount++] = newStudent;
    }

    private static void updateStudent() {
        System.out.print("Nhap ID sinh vien can sua: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                System.out.println("Nhap thong tin moi:");
                students[i].inputData(scanner);
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien.");
    }

    private static void deleteStudent() {
        System.out.print("Nhap ID sinh vien can xoa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null;
                System.out.println("Xoa thanh cong.");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien.");
    }
}
