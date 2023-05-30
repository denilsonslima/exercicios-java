import entities.BankAccount;

import java.util.Scanner;

public class bankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount bankAccount;
        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        String option = sc.nextLine();
        double value;
        if(option.equals("y")){
            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();
            bankAccount = new BankAccount(accountNumber, name, value);
        } else {
            bankAccount = new BankAccount(accountNumber, name);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(bankAccount);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        value = sc.nextDouble();
        bankAccount.addBalance(value);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        bankAccount.deductBalance(value);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        sc.close();
    }
}
