import bankProducts.DebitCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebitCardTests {

    DebitCard debitCard;

    @BeforeEach
    public void beforeEach() {
        debitCard = new DebitCard("Belkart", 2000.0, "BYN");
    }

    @Test()
    public void checkCardNameDebitCard() {
        String cardName = "Belkart";
        String actualCardName = debitCard.getCardName();
        assertEquals(cardName, actualCardName, "Expected card name " + cardName +
                " not Equals with actual card name " + actualCardName);
    }

    @Test
    public void checkBalanceDebitCard() {
        double balance = 2000.0;
        double actualBalance = debitCard.getBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }

    @Test
    public void checkWriteOffDebitCard() {
        double value = 500.0;
        debitCard.writeOff(value);

        double balance = 2000.0 - value;
        double actualBalance = debitCard.getBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }

    @Test
    public void checkAddDebitCard() {
        double value = 500.0;
        debitCard.addToBalance(value);

        double balance = 2000.0 + value;
        double actualBalance = debitCard.getBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }

    @Test
    public void checkGetBankProductBalanceDebitCard() {
        double balance = 2000.0;
        double actualBalance = debitCard.getBankProductBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }
}
