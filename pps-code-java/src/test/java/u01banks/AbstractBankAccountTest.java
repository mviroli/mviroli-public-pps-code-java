package u01banks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public abstract class AbstractBankAccountTest {
    protected BankAccount account;

    @Test
    public void testInitiallyEmpty() {
        assertEquals(0, this.account.getBalance());
    }

    @Test
    public void testCanDeposit() {
        this.account.deposit(1000);
        assertEquals(1000, this.account.getBalance());
    }

    @Test
    public void testNegativeDepositRaisesException() {
        final int negativeAmount = -100;
        assertThrows(IllegalArgumentException.class, () -> this.account.deposit(negativeAmount));
    }

    @Test
    public void testNegativeWithdrawRaisesException() {
        final int negativeAmount = -100;
        assertThrows(IllegalArgumentException.class, () -> this.account.withdraw(negativeAmount));
    }
}
