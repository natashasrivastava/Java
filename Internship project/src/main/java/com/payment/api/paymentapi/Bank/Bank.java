package com.payment.api.paymentapi.Bank;

public class Bank {
    private Integer AccountNumber;
    private Integer Balance;
    private String BankName;

    public Bank(Integer accountNumber, Integer balance, String bankName) {
        AccountNumber = accountNumber;
        Balance = balance;
        BankName = bankName;
    }

    public Integer getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        AccountNumber = accountNumber;
    }

    public Integer getBalance() {
        return Balance;
    }

    public void setBalance(Integer balance) {
        Balance = balance;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }
}
