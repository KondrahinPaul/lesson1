package com.ifmo.Bank;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Bank{

    private ConcurrentMap<Long, Account> accMap = new ConcurrentHashMap<Long, Account>();

    public Account createAccount(long userId) throws RuntimeException {
        if (!accMap.containsKey(userId)) {
            Account newAcc = new Account(userId);
            accMap.put(userId, newAcc);
            return newAcc;
        } else {
            throw new RuntimeException("account already exists");
        }
    }

    public void blockAccount(long accId) {

    }

    public void transferMoney(long srcAccId, long dstAccId, double amount) throws RuntimeException {
        Account srcContact = accMap.get(srcAccId);
        Account dstContact = accMap.get(dstAccId);
        if (srcContact != null && dstContact != null) {
            if (srcContact.getAmount() - amount >= 0) {
                synchronized (srcContact) {
                    synchronized (dstContact) {
                        srcContact.setAmount(srcContact.getAmount() - amount);
                        dstContact.setAmount(dstContact.getAmount() + amount);
                        System.out.println( srcAccId + " src Account have money: " + srcContact.getAmount());
                        System.out.println(dstAccId + " dst Account have money: " + dstContact.getAmount());
                    }
                }
            } else {
                throw new RuntimeException("not enough money on srcAccount");
            }
        } else {
            throw new RuntimeException("some Account is null");
        }

    }
}
