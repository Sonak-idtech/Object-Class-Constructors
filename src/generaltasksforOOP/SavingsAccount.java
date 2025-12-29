package generaltasksforOOP;

import java.math.BigDecimal;
import java.util.Scanner;

public class SavingsAccount extends BankAccount{
    Scanner sc = new Scanner(System.in);
    BigDecimal limit = BigDecimal.valueOf(5000.0);

    public SavingsAccount(BigDecimal balance) {
       super(balance);
    }

    @Override
    public void withdraw() {//BigDecimal amount
        System.out.println("Enter amount to withdraw");
        BigDecimal amount = sc.nextBigDecimal();


        if (amount.compareTo(limit) > 0 ) {
            System.out.println("Amount to withdraw is greater than limit");
            return;
        }

        if (amount.compareTo(balance) > 0) {
            System.out.println("Amount to withdraw is greater than balance");
            return;
        }
        balance=balance.subtract(amount);
        System.out.println("Withdraw Successful  balance : " + balance + " Savings Account");
    }

    @Override
    public void deposit() {//BigDecimal amount
        System.out.println("Enter amount to deposit");
        BigDecimal amount = sc.nextBigDecimal();
        balance =balance.add(amount);
        System.out.println("Deposit Successful balance: " + balance + " Savings Account");

    }

}
