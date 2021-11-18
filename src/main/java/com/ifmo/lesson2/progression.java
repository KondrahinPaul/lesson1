package com.ifmo.lesson2;

public class progression {
    /*
     Создайте программу, выводящую на экран все четырёхзначные числа последовательности
     1000 1003 1006 1009 1012 1015 ….
     */
    public static void main(String[] args) {
        // TODO implement
        int n = 1000;
        while (n<9999) {
            System.out.print(n+" ");
            n = n + 3;
        }
    }
}
