package com.ifmo.lesson2;

public class Fibonacci {
    /*
     Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
     первый и второй члены последовательности равны единицам, а каждый следующий — сумме
     двух предыдущих.
     */
    public static void main(String[] args) {
        // TODO implement
        int per1 = 1;
        System.out.println(per1);
        int per2 = 1;
        for (int connt = 1; connt < 11; connt++) {

            System.out.println(per2);
            per2 = per1 + per2;
            per1 = per2 - per1;
        }
    }
}