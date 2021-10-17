package com.ifmo.lesson2;

public class First55 {
    /*
    Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
     */
    public static void main(String[] args) {
        // TODO implement
        int i = 1;
        int connt = 1;
        while (connt < 56) {
            System.out.println(i);
            i = i + 2;
            connt++;

        }
    }
}
