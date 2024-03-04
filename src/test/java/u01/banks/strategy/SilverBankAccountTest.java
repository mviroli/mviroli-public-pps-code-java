package u01.banks.strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SilverBankAccountTest extends AbstractBankAccountTest {

    private BankAccountFactory factory;

    @BeforeEach
    void init(){
        this.factory  = new BankAccountFactoryImpl();
        this.bankAccount = this.factory.createSilverBankAccount();
    }

    @Test
    void canWithdrawWithoutFee(){
        int initialAmount = 100;
        this.bankAccount.deposit(initialAmount);
        int withdrawAmount = 80;
        this.bankAccount.withdraw(withdrawAmount);
        assertEquals(initialAmount - withdrawAmount, this.bankAccount.balance());
    }

    @Test
    void canWithdrawWithFee(){
        int expectedFee = 1;
        int initialAmount = 200;
        this.bankAccount.deposit(initialAmount);
        int withdrawAmount = 120;
        this.bankAccount.withdraw(withdrawAmount);
        assertEquals(initialAmount - withdrawAmount - expectedFee, this.bankAccount.balance());
    }
}
