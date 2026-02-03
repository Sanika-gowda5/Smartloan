import java.util.Scanner;

public class Main{

    // ATM class (Encapsulation)
    static class ATM {
        private double balance;
        private int pin;

        // Constructor
        ATM(double balance, int pin) {
            this.balance = balance;
            this.pin = pin;
        }

        // Validate PIN
        boolean validatePin(int enteredPin) {
            return pin == enteredPin;
        }

        // Deposit
        void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited successfully.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Withdraw
        void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount.");
            } else if (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful.");
            }
        }

        // Check balance
        void checkBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }

    // Main execution
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM(5000, 1234);

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (!atm.validatePin(enteredPin)) {
            System.out.println("Incorrect PIN. Access Denied.");
            sc.close();
            return;
        }

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    atm.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    atm.withdraw(sc.nextDouble());
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
