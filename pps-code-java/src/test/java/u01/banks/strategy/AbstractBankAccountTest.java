package u01.banks.strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public abstract class AbstractBankAccountTest {

    protected BankAccount bankAccount;    
    
    @Test
    void initiallyEmpty(){
        assertEquals(0, this.bankAccount.balance());
    }

    @Test
    void canDeposit(){
        int amount = 100;
        this.bankAccount.deposit(amount);
        assertEquals(amount, this.bankAccount.balance());
    }

    @Test
    void canWithdraw(){
        int initialAmount = 100;
        this.bankAccount.deposit(initialAmount);
        int withdrawAmount = 80;
        this.bankAccount.withdraw(withdrawAmount);
        assertEquals(initialAmount - withdrawAmount, this.bankAccount.balance());
    }
}
