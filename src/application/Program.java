package application;

import entities.Bank;

import java.util.Scanner;
import java.util.Locale;

public class Program {

void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Bank bank = new Bank();

    System.out.print("Enter account number: ");
    int number = sc.nextInt();
    bank.setAccountNumber(number);
    sc.nextLine();

    System.out.print("\nEnter account holder: ");
    System.out.println();
    String holder = sc.nextLine();
    bank.setAccountHolder(holder);


    System.out.println("\nIs there na initial deposit(y/n)? ");
    char initialDeposit = sc.next().charAt(0);

    if(initialDeposit == 'y' || initialDeposit == 'Y'){
        System.out.println("Enter initial deposit value: ");
        double value = sc.nextDouble();
        bank.setDepositValue(value);
    }

    System.out.println(bank);



    sc.close();
}
}