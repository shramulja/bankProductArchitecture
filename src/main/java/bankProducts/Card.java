package bankProducts;

import interfaces.IAddBalance;
import interfaces.IGetBalance;
import interfaces.IWriteOff;

public class Card extends BankProduct implements IWriteOff, IAddBalance, IGetBalance {

    public Card(String cardName, double balance, String currency) {
        super(cardName, balance, currency);
    }

    @Override
    public void addToBalance(double value) {
        Card.this.setBalance(Card.this.getBalance() + value);
    }

    @Override
    public double getBankProductBalance() {
        return getBalance();
    }

    @Override
    public void writeOff(double value) {
        Card.this.setBalance(Card.this.getBalance() - value);
    }
}
