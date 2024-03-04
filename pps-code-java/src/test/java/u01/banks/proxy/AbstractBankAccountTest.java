package u01.banks.proxy;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class AbstractBankAccountTest {

    protected BankAccount bankAccount;

    @BeforeEach
    void init(){
        this.bankAccount = createBankAccountToTest();
    }

    protected abstract BankAccount createBankAccountToTest();

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
        assertEquals(initialAmount - withdrawAmount - 1, this.bankAccount.balance());
    }

    @Test
    void cannotDepositNegativeAmounts(){
        int initialAmount = 100;
        this.bankAccount.deposit(initialAmount);
        int negativeAmount = -20;
        assertAll(
            () -> assertThrows(IllegalArgumentException.class, () -> this.bankAccount.deposit(negativeAmount)),
            () -> assertEquals(initialAmount, this.bankAccount.balance())
        );
    }

}
