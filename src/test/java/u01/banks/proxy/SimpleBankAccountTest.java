package u01.banks.proxy;

public class SimpleBankAccountTest extends AbstractBankAccountTest {

    @Override
    protected BankAccount createBankAccountToTest() {
        return new SimpleBankAccount();
    }

}
