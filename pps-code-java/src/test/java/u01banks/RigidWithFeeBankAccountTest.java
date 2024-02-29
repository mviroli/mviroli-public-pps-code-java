package u01banks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RigidWithFeeBankAccountTest extends AbstractBankAccountTest {
    private static final int FEE = 1;
    private final BankAccountFactory factory = new BankAccountFactoryImpl();

    @BeforeEach
    void setUp() {
        this.account = this.factory.rigidWithFee();
    }

    @Test
    public void testCanWithdrawWithFee(){
        this.account.deposit(1000);
        this.account.withdraw(900);
        assertEquals(100 - FEE, this.account.getBalance());
    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        this.account.deposit(1000);
        assertThrows(IllegalStateException.class,()->this.account.withdraw(1100));
    }
}
