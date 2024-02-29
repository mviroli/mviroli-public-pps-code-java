package u01run;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public abstract class AbstractBankAccountTest<B extends BankAccount> {
    protected B bankAccount;

    @BeforeEach
    public abstract void setUp();

    @Test
    public void testInitiallyEmpty() {
        assertEquals(0, this.bankAccount.balance());
    }

    @Test
    public void testCanDeposit() {
        this.bankAccount.deposit(100);
        assertEquals(100, this.bankAccount.balance());
    }

    @Test
    public void testNegativeDeposit() {
        assertThrows(IllegalArgumentException.class, () -> this.bankAccount.deposit(-100));
    }

    @Test
    public void testNegativeWithdraw() {
        assertThrows(IllegalArgumentException.class, () -> this.bankAccount.withdraw(-100));
    }
}
