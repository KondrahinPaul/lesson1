package com.ifmo.lesson2;

public class First20 {
    /*
     Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8
     16 32 64 128 ….
     */
    public static void main(String[] args) {
        // TODO implement
        int i = 2;
        for (int connt = 1; connt <= 20; connt++)
        {
                            System.out.println(i);
            i = i * 2;
        }
    }
}
