import bankProducts.Deposit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositTests {

    Deposit deposit;

    @BeforeEach
    public void beforeEach() {
        deposit = new Deposit("Deposit", 95300.0, "RUB");
    }

    @Test()
    public void checkNameDeposit() {
        String depositName = "Deposit";
        String actualDepositName = deposit.getProductName();
        assertEquals(depositName, actualDepositName, "Expected card name " + depositName +
                " not Equals with actual card name " + actualDepositName);
    }

    @Test
    public void checkBalanceDeposit() {
        double balance = 95300.0;
        double actualBalance = deposit.getBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }

    @Test()
    public void checkCurrencyDeposit() {
        String currency = "RUB";
        String actualCurrency = deposit.getCurrency();
        assertEquals(currency, actualCurrency, "Expected card name " + currency +
                " not Equals with actual card name " + actualCurrency);
    }

    @Test
    public void checkAddBalanceDeposit() {
        double value = 1000.0;
        deposit.addToBalance(value);

        double balance = 95300.0 + value;
        double actualBalance = deposit.getBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }

    @Test
    public void checkGetBankProductBalanceDeposit() {
        double balance = 95300.0;
        double actualBalance = deposit.getBankProductBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }

    @Test
    public void checkCloseDeposit() {
        deposit.closeDeposit();
        double balance = 0;
        double actualBalance = deposit.getBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance +
                " not Equals with actual balance " + actualBalance);
    }
}
