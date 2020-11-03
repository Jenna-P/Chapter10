package Exercise;

import java.util.Scanner;

public class ATMmachine {

    public static void main(String[] args) {
        Account[] acc = new Account[10];
        acc[0] = new Account(0, 100);
        acc[1] = new Account(1, 100);
        acc[2] = new Account(2, 100);
        acc[3] = new Account(3, 100);
        acc[4] = new Account(4, 100);
        acc[5] = new Account(5, 100);
        acc[6] = new Account(6, 100);
        acc[7] = new Account(7, 100);
        acc[8] = new Account(8, 100);
        acc[9] = new Account(9, 100);

        Scanner input = new Scanner(System.in);
        ATMClass atm = new ATMClass();

        while (true) {
            System.out.print("Enter an id : ");
            int id = input.nextInt();

            while (id >= 10) {
                System.out.println("Invalid Id, Try again");
                System.out.print("Enter an id : ");
                id = input.nextInt();
            }
            int choice = 0;
            while (choice != 4) {
                atm.printMenu();
                System.out.print("Enter a choice : ");
                choice = input.nextInt();

                if (choice == 1) {
                    acc[id].getBalance();

                } else if (choice == 2) {
                    System.out.print("Enter an amount to withdraw : ");
                    double amountW = input.nextDouble();
                    acc[id].withdraw(amountW);

                } else if (choice == 3) {
                    System.out.print("Enter an amount to deposit : ");
                    double amountD = input.nextDouble();
                    acc[id].deposit(amountD);
                }

            }

        }

}

















}