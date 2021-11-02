package com.ifmo.lesson3;

import java.util.Random;

public class TwoArrays {
    /*
     Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
     массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
     каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
     сообщите, что их средние арифметические равны).
     */
    public static void main(String[] args) {
        int[] randomNumbers1 = randomNumbers();
        int[] randomNumbers2 = randomNumbers();

        // TODO implement
        for (int i=0;i<5;i++) {
            System.out.print(randomNumbers1[i]);
                    }
        System.out.println();
        for (int i=0;i<5;i++) {
            System.out.print(randomNumbers2[i]);
        }
        System.out.println();
        int average1 = average(randomNumbers1);
        int average2 = average(randomNumbers2);
System.out.println(average1);
System.out.println(average2);
        // TODO implement
        if (average1==average2){
            System.out.println("среднеарифмитические равны");
        } else if (average1>average2){
            System.out.println("для массива №1 среднеарифмитическое больше");
        } else {
            System.out.println("для массива №2 среднеарифмитическое больше");
        }
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] cetire1 = new int[5];
        int count = 0;
        for (; count < 5; count++) {
            int min = 0;
            int max = 5;
            int diff = max - min;
            Random random = new Random();
            int i = random.nextInt(diff + 1);
            cetire1[count] = i += min;
        }

        return cetire1;
    }

    public static int average(int[] randomNumbers) {
        // TODO implement

       int count = 0;
for (int i=0; i<5; i++) {
    count = count+randomNumbers[i];
};
  int even=count/5;
return even;
    }
}
