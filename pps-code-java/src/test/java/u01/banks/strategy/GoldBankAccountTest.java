package u01.banks.strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GoldBankAccountTest extends AbstractBankAccountTest {

    private BankAccountFactory factory;

    @BeforeEach
    void init(){
        this.factory  = new BankAccountFactoryImpl();
        this.bankAccount = this.factory.createGoldBankAccount();
    }

    @Test
    void canWithdraw(){
        int initialAmount = 100;
        this.bankAccount.deposit(initialAmount);
        int withdrawAmount = 80;
        this.bankAccount.withdraw(withdrawAmount);
        assertEquals(initialAmount - withdrawAmount, this.bankAccount.balance());
    }
}
