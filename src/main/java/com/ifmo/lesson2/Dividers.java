package com.ifmo.lesson2;

import java.util.Scanner;

public class Dividers {
    /*
    Выведите на экран все положительные делители натурального числа, введённого
    пользователем с клавиатуры.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
n = Math.abs(n);
        // TODO implement
        System.out.println("Делители числа " + n);
        for (int i=1; i<=n; i++) {
           if ((n%i) ==0) System.out.println(i);
                  }
    }
}
