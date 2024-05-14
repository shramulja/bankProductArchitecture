import bankProducts.CurrencyCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyCardTests {

    CurrencyCard currencyCard;

    @BeforeEach
    public void beforeEach() {
        currencyCard = new CurrencyCard("MasterCard", 700.0, "USD");
    }

    @Test()
    public void checkCardNameCurrencyCard() {
        String cardName = "MasterCard";
        String actualCardName = currencyCard.getProductName();
        assertEquals(cardName, actualCardName, "Expected card name " + cardName +
                " not Equals with actual card name " + actualCardName);
    }

    @Test
    public void checkBalanceCurrencyCard() {
        double balance = 700.0;
        double actualBalance = currencyCard.getBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }

    @Test
    public void checkWriteOffCurrencyCard() {
        double value = 300.0;
        currencyCard.writeOff(value);

        double balance = 700.0 - value;
        double actualBalance = currencyCard.getBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }

    @Test
    public void checkAddCurrencyCard() {
        double value = 200.0;
        currencyCard.addToBalance(value);

        double balance = 700.0 + value;
        double actualBalance = currencyCard.getBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }

    @Test
    public void checkGetBankProductBalanceCurrencyCard() {
        double balance = 700.0;
        double actualBalance = currencyCard.getBankProductBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }
}
