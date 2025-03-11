package ss09;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Da gui: " + amount);
        } else {
            System.out.println("So tien gui khong hop le.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Da rut: " + amount);
        } else {
            System.out.println("So du khong du hoac so tien khong hop le.");
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recipient.deposit(amount);
            System.out.println("Da chuyen: " + amount + " den " + recipient.accountHolder);
        } else {
            System.out.println("Chuyen khoan that bai: So du khong du hoac so tien khong hop le.");
        }
    }

    public void display() {
        System.out.println("So tai khoan: " + accountNumber + ", Chu tai khoan: " + accountHolder + ", So du: " + balance);
    }
}

public class Bai8 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456", "Nguyen Van A", 5000);
        BankAccount acc2 = new BankAccount("789012", "Tran Thi B", 3000);

        acc1.display();
        acc2.display();

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.transfer(acc2, 1500);

        acc1.display();
        acc2.display();
    }
}
