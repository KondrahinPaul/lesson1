package com.ifmo.lesson3;

import java.util.Random;

public class Random8 {
    /*
    Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран
    в строку. Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
    экран на отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
for (int i=0; i<8; i++) {
    System.out.print(randomNumbers[i]);
}
System.out.println();
        int[] replacedWithZeros = replaceWithZeros(randomNumbers);

        // TODO implement
        for (int i=0; i<8; i++){
            System.out.print(replacedWithZeros[i]);
        }
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] cetire = new int[8];
        int count = 0;
        for (; count < 8; count++) {
            int min = 1;
            int max = 10;
            int diff = max - min;
            Random random = new Random();
            int i = random.nextInt(diff + 1);
            cetire[count] = i += min;
        }
        return cetire;
    }

    public static int[] replaceWithZeros(int[] randomNumbers) {
        // TODO implement
int[] revers = randomNumbers;
for (int i=0; i<8; i++) {
    if (i%2!=0) {
        revers[i]=0;
    }
}
        return revers;
    }
}
