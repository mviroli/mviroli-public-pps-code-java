package u01banks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardBankAccountTest extends AbstractBankAccountTest {

    @BeforeEach
    void setUp() {
        this.account = new StandardBankAccount();
    }

    @Test
    public void testCanWithdraw(){
        this.account.deposit(1000);
        this.account.withdraw(900);
        assertEquals(100, this.account.getBalance());
    }
}
