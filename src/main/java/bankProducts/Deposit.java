package bankProducts;

import interfaces.IAddBalance;
import interfaces.ICloseDeposit;
import interfaces.IGetBalance;

public class Deposit extends BankProduct implements ICloseDeposit, IAddBalance, IGetBalance {

    public Deposit(String cardName, double balance, String currency) {
        super(cardName, balance, currency);
    }

    @Override
    public void addToBalance(double value) {
        Deposit.this.setBalance(Deposit.this.getBalance() + value);
    }

    @Override
    public void closeDeposit() {
        Deposit.this.setBalance(0);
    }

    @Override
    public double getBankProductBalance() {
        return getBalance();
    }
}
