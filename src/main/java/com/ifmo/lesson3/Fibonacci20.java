package com.ifmo.lesson3;

public class Fibonacci20 {
    /*
    Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
    что первый и второй члены последовательности равны единицам, а каждый следующий —
    сумме двух предыдущих.
     */
    public static void main(String[] args) {
        int[] fibonacciNumbers = fibonacciNumbers();

        // TODO implement
    }

    public static int[] fibonacciNumbers() {
        // TODO implement
        int per1 = 1;
        System.out.println(per1);
        int per2 = 1;
        for (int connt = 1; connt < 20; connt++) {

            System.out.println(per2);
            per2 = per1 + per2;
            per1 = per2 - per1;
        }

        return new int[0];
    }

}
