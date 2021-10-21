package com.ifmo.lesson2;

import java.util.Scanner;

public class DigitsSum {
    /*
    Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех
    его цифр (заранее не известно сколько цифр будет в числе).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("ведите число");
        int n = scanner.nextInt();

        int digitSum = digitSum(n);

        System.out.println(digitSum);
    }

    public static int digitSum(int n) {
        // TODO implement
        int count = 0;
        n = Math.abs(n);
        while (n != 0) {
            count += (n%10);
            n=n/10;
        }
        return count;
    }
}
