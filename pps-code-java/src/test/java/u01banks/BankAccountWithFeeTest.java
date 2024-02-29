package u01banks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountWithFeeTest extends AbstractBankAccountTest {

    private static final int FEE = 1;

    @BeforeEach
    void setUp() {
        this.account = new BankAccountWithFee();
    }

    @Test
    public void testCanWithdrawWithFee(){
        this.account.deposit(1000);
        this.account.withdraw(900);
        assertEquals(100 - FEE, this.account.getBalance());
    }
}
