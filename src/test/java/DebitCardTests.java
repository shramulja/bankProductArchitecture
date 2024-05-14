import bankProducts.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTests {

    CreditCard creditCard;

    @BeforeEach
    public void beforeEach() {
        creditCard = new CreditCard("Maestro", "EUR", 1000.0, 5.5);
    }

    @Test
    public void checkDebtRequestCreditCard() {
        double debtRequest = 100;
        double actualDebtRequest = creditCard.debtRequest();
        assertEquals(debtRequest, actualDebtRequest, "Expected debt request " + debtRequest +
                " not Equals actual debtRequest " + actualDebtRequest);
    }

    @Test
    public void checkInterestRateCreditCard() {
        double interestRate = 5.5;
        double actualInterestRate = creditCard.getInterestRate();
        assertEquals(interestRate, actualInterestRate, "Expected interest rate " + interestRate +
                " not Equals with actual interest rate " + actualInterestRate);
    }

    @Test
    public void checkCreditCardBalance() {
        double balance = 1000.0;
        double actualBalance = creditCard.getBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }
}
