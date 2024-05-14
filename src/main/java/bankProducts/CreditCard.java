package bankProducts;

import interfaces.IDebtRequest;

public class CreditCard extends Card implements IDebtRequest {

    private double interestRate;

    public CreditCard(String cardName, String currency, double balance, double interestRate) {
        super(cardName, balance, currency);
        this.interestRate = interestRate;
    }

    public CreditCard(String cardName, double balance, String currency) {
        super(cardName, balance, currency);
    }

    @Override
    public double debtRequest() {
        return 100;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
