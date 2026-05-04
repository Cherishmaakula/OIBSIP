import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

    static int balance = 1000;
    static int pin = 1234;
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ATM SYSTEM =====");

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            System.out.println("Login Successful!");

            int choice;

            do {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transaction History");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Balance: " + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        int deposit = sc.nextInt();
                        balance += deposit;
                        history.add("Deposited: " + deposit);
                        System.out.println("Amount Deposited!");
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        int withdraw = sc.nextInt();

                        if (withdraw <= balance) {
                            balance -= withdraw;
                            history.add("Withdrawn: " + withdraw);
                            System.out.println("Amount Withdrawn!");
                        } else {
                            System.out.println("Insufficient Balance!");
                        }
                        break;

                    case 4:
                        System.out.println("Transaction History:");
                        for (String h : history) {
                            System.out.println(h);
                        }
                        break;

                    case 5:
                        System.out.println("Thank you for using ATM!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 5);

        } else {
            System.out.println("Wrong PIN!");
        }

        sc.close();
    }
}