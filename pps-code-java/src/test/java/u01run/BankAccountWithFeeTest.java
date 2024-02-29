package u01run;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountWithFeeTest extends AbstractBankAccountTest<BankAccountWithFee> {

    private static final int FEE = 1;

    @Override
    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccountWithFee();
    }


    @Test
    public void testCanWithdrawWithFee(){
        final int depositedAmount = 100;
        final int withdrawnAmount = 80;
        this.bankAccount.deposit(depositedAmount);
        this.bankAccount.withdraw(withdrawnAmount);
        assertEquals(depositedAmount - withdrawnAmount - FEE, this.bankAccount.balance());
        assertEquals(1, bankAccount.getFee());
    }

}
