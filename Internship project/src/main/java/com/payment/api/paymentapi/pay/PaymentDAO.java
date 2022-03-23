package com.payment.api.paymentapi.pay;

import com.payment.api.paymentapi.Bank.Bank;
import com.payment.api.paymentapi.Bank.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PaymentDAO {
    @Autowired
    private BankRepository account;

    public boolean pay(Payment pay) {

        Optional<Bank> user = account.findById(pay.getAccountNumber());
        if(!user.isPresent())
            return false;
        int amount = user.get().getBalance();
        if(amount>pay.getAmount())
            return false;
        return true;

    }
}
