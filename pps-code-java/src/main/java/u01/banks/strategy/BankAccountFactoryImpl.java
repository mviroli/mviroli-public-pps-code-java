package u01.banks.strategy;

public class BankAccountFactoryImpl implements BankAccountFactory {

    @Override
    public BankAccount createGoldBankAccount() {
        return new BankAccountImpl(amount -> 0);
    }

    @Override
    public BankAccount createSilverBankAccount() {
        return new BankAccountImpl(amount -> amount > 100 ? 1 : 0);
    }


}
