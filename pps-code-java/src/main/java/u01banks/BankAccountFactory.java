package u01banks;

public interface BankAccountFactory {

    BankAccount rigid();

    BankAccount standard();

    BankAccount withFee();

    BankAccount rigidWithFee();
}
