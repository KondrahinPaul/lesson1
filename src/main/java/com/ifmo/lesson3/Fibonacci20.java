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
        int[] i = new int[20];
        i[0] = 1;
        i[1] = 1;
        System.out.println(i[0]);
        System.out.println(i[1]);
        for (int x=2; x< i.length;x++ ) {
            i[x] =i[x-1] +i[x-2];
            System.out.println(i[x]);
        }
        return i;
    }

}
