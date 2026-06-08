
import java.util.Scanner;

class Account
 {

    double balance = 5000;

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    void deposit(double amt) {

        if (amt <= 0) {
            System.out.println("Invalid Amount");
        }

        else {
            balance = balance + amt;
            System.out.println("Money Deposited");
        }
    }

    void withdraw(double amt) {

        if (amt > balance) {
            System.out.println("Not Enough Balance");
        }

        else if (amt <= 0) {
            System.out.println("Invalid Amount");
        }

        else {
            balance = balance - amt;
            System.out.println("Please collect cash");
        }
    }
}

public class task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account a = new Account();

        int choice;

        while (true) {

            System.out.println("ATM MENU");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                a.showBalance();
            }

            else if (choice == 2) {

                System.out.print("Enter amount: ");
                double d = sc.nextDouble();

                a.deposit(d);
            }

            else if (choice == 3) {

                System.out.print("Enter amount: ");
                double w = sc.nextDouble();

                a.withdraw(w);
            }
  
            else if (choice == 4) {

                System.out.println("Thank You");
                break;
            }

            else {
                System.out.println("Wrong Choice");
            }
        }

        sc.close();
    }
}

