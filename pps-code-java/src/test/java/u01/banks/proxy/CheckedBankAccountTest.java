package u01.banks.proxy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CheckedBankAccountTest extends AbstractBankAccountTest {

    @Test
    void cannotWithdrawMoreThanDeposited(){
        int initialAmount = 100;
        this.bankAccount.deposit(initialAmount);
        int excessiveAmount = 120;
        assertThrows(IllegalStateException.class, ()->this.bankAccount.withdraw(excessiveAmount));
    }

    @Override
    protected BankAccount createBankAccountToTest() {
        return new CheckedBankAccount();
    }
}
