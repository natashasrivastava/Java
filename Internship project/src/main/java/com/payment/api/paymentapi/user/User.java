package com.payment.api.paymentapi.user;

import com.payment.api.paymentapi.Bank.Bank;
import com.payment.api.paymentapi.SubscribedChannels.subscribedChannels;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;


@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 2)
    private String name;

    @Past
    private Date birthdate;
    private boolean subscription;
    private int previousSubscriptionAmount;
    private int WalletBalance;

    @OneToMany(mappedBy = "user")
    private List<subscribedChannels> channelsList;

    public List<subscribedChannels> getChannelsList() {
        return channelsList;
    }

    public void setChannelsList(List<subscribedChannels> channelsList) {
        this.channelsList = channelsList;
    }


    public User(){

    }

    public User(Integer id, String name, Date birthdate, boolean subscription, int previousSubscriptionAmount, int walletBalance) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.subscription = subscription;
        this.previousSubscriptionAmount = previousSubscriptionAmount;
        WalletBalance = walletBalance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", subscription=" + subscription +
                ", previousSubscriptionAmount=" + previousSubscriptionAmount +
                ", WalletBalance=" + WalletBalance +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isSubscription() {
        return subscription;
    }

    public void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }

    public int getPreviousSubscriptionAmount() {
        return previousSubscriptionAmount;
    }

    public void setPreviousSubscriptionAmount(int previousSubscriptionAmount) {
        this.previousSubscriptionAmount = previousSubscriptionAmount;
    }

    public int getWalletBalance() {
        return WalletBalance;
    }

    public void setWalletBalance(int walletBalance) {
        WalletBalance = walletBalance;
    }
}
