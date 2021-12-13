package com.ifmo.Bank;

import java.util.Scanner;
import java.util.concurrent.ConcurrentMap;

public class Bank implements Runnable {

    private ConcurrentMap<long, Account> accMap = new ConcurrentMap<long, Account>() {
        public Account createAccount(long userId) {
            createAccount(long userId);
            return null;
        }

        //        public doublegetAmount(long accId) {
//
//        }
        public void blockAccount(long accId) {
        }

        public void transferMoney(long srcAccId, long dstAccId, double amount) {
            srcAccId = 0;
            Scanner scanner = new Scanner(System.in);
            //for (; srcAccId<5; srcAccId++) {
            amount = scanner.nextDouble();
            accMap.put (srcAccId, Account);

            //}


        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        Account a1 = new Account();

        System.out.println(a1);

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            accMap<>.put ();
        }
    }
}
