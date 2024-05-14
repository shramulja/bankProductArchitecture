package org.example.data;

public abstract class BankProduct {
    float balance;
    String name;
    String currency;

    //пополнение баланса
    public abstract void replenishBalance();

    //запрос баланса
    public abstract void requestBalance();
}
