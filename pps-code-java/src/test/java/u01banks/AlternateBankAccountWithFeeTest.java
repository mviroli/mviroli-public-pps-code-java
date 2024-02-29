package u01banks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlternateBankAccountWithFeeTest extends AbstractBankAccountTest {

    private static final int FEE = 1;

    @BeforeEach
    void setUp() {
        var coreAccount = new StandardBankAccount();
        this.account = new WithFee(coreAccount);
    }

    @Test
    public void testCanWithdrawWithFee(){
        this.account.deposit(1000);
        this.account.withdraw(900);
        assertEquals(100 - FEE, this.account.getBalance());
    }
}
