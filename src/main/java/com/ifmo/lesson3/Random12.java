package com.ifmo.lesson3;

import java.util.Random;

public class Random12 {
    /*
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой
    элемент является в этом массиве максимальным и сообщите индекс его последнего
    вхождения в массив.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement

        int max = max(randomNumbers);
        int maxLastIndex = lastIndexOf(randomNumbers, max);

        // TODO implement
        System.out.println("Максимальное число в массиве " + max);
        System.out.println("индекс последнего вхождения  в массив " + maxLastIndex);
    }

    public static int[] randomNumbers() {
        // TODO implement
        Random rand = new Random();
        int min = -15;
        int max = 15;
        int[] randNumber = new int[12];
        for (int i = 0; i < 12; i++) {
            randNumber[i] = rand.nextInt(max - min) + min;
            System.out.println(randNumber[i]);

        }
        return randNumber;
    }

    public static int max(int[] randomNumbers) {
        // TODO implement
        int max = -15;
        for (int i = 0; i < 12; i++)
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }

        return max;
    }

    public static int lastIndexOf(int[] randomNumbers, int val) {
        // TODO implement
        int max2 = -15;
        int lastIndex = 0;
        for (int i = 0; i < 12; i++)
            if (randomNumbers[i] >= max2) {
                max2 = randomNumbers[i];
                lastIndex = i;
            }

        return lastIndex;
    }
}
