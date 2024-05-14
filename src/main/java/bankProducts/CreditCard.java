package org.example.data;

public class CreditCard extends CreditCardBakProduct implements CardMethods{

    @Override
    void debtInquiries() {
        //запрос задолженности
    }

    @Override
    public void requestBalance() {
        //запрос баланса
    }


    @Override
    public void writeOffs() {
        //списание средств
    }

    @Override
    public void replenishBalance() {
        //пополнение баланса
    }
}
