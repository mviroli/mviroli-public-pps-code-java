package u01banks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RigidBankAccountViaFactoryTest extends AbstractBankAccountTest {

    private final BankAccountFactory factory = new BankAccountFactoryImpl();

    @BeforeEach
    void setUp() {
        this.account = this.factory.rigid();
    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        this.account.deposit(1000);
        assertThrows(IllegalStateException.class,()->this.account.withdraw(1100));
    }
}
