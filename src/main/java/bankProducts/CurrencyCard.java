package bankProducts;

import interfaces.IWriteOff;

public class CurrencyCard extends Card {

    public CurrencyCard(String cardName, double balance, String currency) {
        super(cardName, balance, currency);
    }
}
