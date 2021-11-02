package com.ifmo.lesson3;

import java.util.Random;

public class Random15 {
    /*
     Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
     Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на
     отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
for (int i=0;i<15;i++){
    System.out.print(randomNumbers[i]+" ");
}
System.out.println();
        int evens = evens(randomNumbers);
System.out.println(evens);
        // TODO implement
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] cetire = new int[15];
        int count = 0;
        for (; count < 15; count++) {
            int min = 0;
            int max = 9;
            int diff = max - min;
            Random random = new Random();
            int i = random.nextInt(diff + 1);
            cetire[count] = i += min;
        }
        return cetire;
    }

    private static int evens(int[] randomNumbers) {
        // TODO implement
        int even =0;
int[] count = randomNumbers;
for (int i=0; i<15; i++){
    if (count[i]!=0){
    if (count[i]%2==0) {
        even++;
    }
    }
}

        return even;
    }
}
