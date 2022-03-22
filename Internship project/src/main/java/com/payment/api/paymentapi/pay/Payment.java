package com.payment.api.paymentapi.pay;

import javax.persistence.criteria.CriteriaBuilder;

public class Payment {
    private Integer AccountNumber;
    private Integer Amount;
    private boolean success;
    private String BankName;

    public Payment(Integer accountNumber, Integer amount, String bankName) {
        AccountNumber = accountNumber;
        Amount = amount;
        BankName = bankName;
    }

    public Integer getAccountNumber() {
        return AccountNumber;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public boolean isSuccess() {
        return success;
    }



    public String getBankName() {
        return BankName;
    }


}
