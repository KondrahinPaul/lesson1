package com.ifmo.Bank;

import java.util.Scanner;

public class Account {
    private long id;
    private double amount;
    private long userId;
    private boolean blocked = true;
Scanner s = new Scanner(System.in);
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        amount=s.nextDouble();
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
