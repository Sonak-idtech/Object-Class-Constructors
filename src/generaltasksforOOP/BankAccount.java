package generaltasksforOOP;

import java.math.BigDecimal;

public abstract class BankAccount {

     protected BigDecimal  balance;
     public abstract void withdraw();
     public abstract void deposit();

    public BankAccount(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
