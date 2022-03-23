package com.payment.api.paymentapi.Bank;


import com.payment.api.paymentapi.user.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bank {
    @Id
    @GeneratedValue
    private Integer AccountNumber;
    private Integer Balance;
    private String AccountHolderName;
    private String BankName;

    public Bank() {
    }

    public Bank(Integer accountNumber, String userName, Integer balance, String bankName) {
        AccountNumber = accountNumber;
        Balance = balance;
        BankName = bankName;
        AccountHolderName = userName;
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

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }
}
