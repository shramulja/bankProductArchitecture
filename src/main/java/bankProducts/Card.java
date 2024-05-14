package bankProducts;

import interfaces.IAddBalance;
import interfaces.IGetBalance;
import interfaces.IWriteOff;

public class DebitCard extends BankProduct implements IWriteOff, IAddBalance, IGetBalance {

    public DebitCard(String cardName, double balance, String currency) {
        super(cardName, balance, currency);
    }

    @Override
    public double getCardBalance(String cardName) {
        return getBalance();
    }

    @Override
    public void writeOff(double value) {
        DebitCard.this.setBalance(DebitCard.this.getBalance() - value);
    }

    @Override
    public void addToBalance(double value) {
        DebitCard.this.setBalance(DebitCard.this.getBalance() + value);
    }
}
