package u01run;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StandardBankAccountTest extends AbstractBankAccountTest<StandardBankAccount> {

    @Override
    @BeforeEach
    public void setUp() {
        bankAccount = new StandardBankAccount();
    }

    @Test
    public void testCanWithdraw(){
        final int depositedAmount = 100;
        final int withdrawnAmount = 80;
        this.bankAccount.deposit(depositedAmount);
        this.bankAccount.withdraw(withdrawnAmount);
        assertEquals(depositedAmount - withdrawnAmount, this.bankAccount.balance());
    }

}
