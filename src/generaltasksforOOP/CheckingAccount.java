package generaltasksforOOP;

import java.math.BigDecimal;
import java.util.Scanner;

public class CheckingAccount extends  BankAccount {
    Scanner sc = new Scanner(System.in);

    public CheckingAccount(BigDecimal balance) {
        super(balance);
    }

    @Override
    public void withdraw() {
        System.out.println("Enter amount to withdraw");
        BigDecimal amount = sc.nextBigDecimal();

        if (amount.compareTo(balance) > 0) {
            System.out.println("Amount to withdraw is greater than balance");
            return;
        }
        balance=balance.subtract(amount);
        System.out.println("Withdraw Successful balance: "+balance +" Checking Account");
    }

    @Override
    public void deposit() {
        System.out.println("Enter amount to deposit");
        BigDecimal amount = sc.nextBigDecimal();
        balance=balance.add(amount);
        System.out.println("Deposit Successful balance : "+balance +" Checking Account");


    }

}
