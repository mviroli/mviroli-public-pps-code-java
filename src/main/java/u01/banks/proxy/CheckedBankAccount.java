package u01.banks.proxy;


class CheckedBankAccount implements BankAccount{

    private final BankAccount baseBankAccount = new SimpleBankAccount();

    public int balance() {
        return baseBankAccount.balance();
    }

    public void deposit(int amount) {
        baseBankAccount.deposit(amount);
    }

    public void withdraw(int amount) {
        if (amount > this.balance()){
            throw new IllegalStateException();
        }
        baseBankAccount.withdraw(amount);
    }

    

}
