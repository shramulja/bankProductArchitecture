package bankProducts;

public abstract class BankProduct {

    protected double balance;
    protected String productName;
    protected String currency;

    public BankProduct(String productName, double balance, String currency) {
        this.balance = balance;
        this.productName = productName;
        this.currency = currency;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
