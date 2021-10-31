package com.ifmo.lesson3;

import java.net.SocketOption;
import java.util.Arrays;
import java.util.Random;

public class Random4 {
    /*
    Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в
    строку. Определить и вывести на экран сообщение о том, является ли массив строго
    возрастающей последовательностью.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();


        // TODO implement
        System.out.println(Arrays.toString(randomNumbers));
        boolean increasingSequence = isIncreasingSequence(randomNumbers);
        System.out.println(increasingSequence);

    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] cetire = new int[4];
        int count = 0;
        for (; count < 4; count++) {
            int min = 10;
            int max = 99;
            int diff = max - min;
            Random random = new Random();
            int i = random.nextInt(diff + 1);
            cetire[count] = i += min;
        }

        return cetire;
    }

    public static boolean isIncreasingSequence(int[] randomNumbers) {
        // TODO implement
        if (randomNumbers[0] < randomNumbers[1]) {
            if (randomNumbers[1]<randomNumbers[2]) {
                if (randomNumbers[2]<randomNumbers[3]) {
                    return true;
                }
            }
          }
            return false;
        }
}
