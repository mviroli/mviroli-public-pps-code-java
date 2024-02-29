package u01banks;

public class BankAccountFactoryImpl implements BankAccountFactory {
    @Override
    public BankAccount rigid() {
        return new Rigid(new StandardBankAccount());
    }

    @Override
    public BankAccount standard() {
        return new StandardBankAccount();
    }

    @Override
    public BankAccount withFee() {
        return new WithFee(new StandardBankAccount());
    }

    @Override
    public BankAccount rigidWithFee() {
        return new Rigid(new WithFee(new StandardBankAccount()));
    }
}
