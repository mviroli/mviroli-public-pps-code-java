package u01.banks.strategy;

import java.util.function.Function;

public class BankAccountImpl implements BankAccount {

    private int balance;
    private final Function<Integer,Integer> fee;

    public BankAccountImpl(Function<Integer,Integer> fee){
        this.fee = fee;
    }

    @Override
    public int balance() {
        return this.balance;
    }

    @Override
    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public void withdraw(int amount) {
        this.balance = this.balance - amount - fee.apply(amount);
    }

}
