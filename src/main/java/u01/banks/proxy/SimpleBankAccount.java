package u01.banks.proxy;

class SimpleBankAccount implements BankAccount {

    private int balance;

    @Override
    public int balance() {
        return this.balance;
    }

    private void checkNegativeAmount(int amount) {
        if (amount < 0){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void deposit(int amount) {
        checkNegativeAmount(amount);
        this.balance = this.balance + amount;
    }

    @Override
    public void withdraw(int amount) {
        checkNegativeAmount(amount);
        this.balance = this.balance - amount - 1;
    }

}
