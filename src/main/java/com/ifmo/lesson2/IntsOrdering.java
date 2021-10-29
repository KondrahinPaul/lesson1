package com.ifmo.lesson2;

public class IntsOrdering {
    /*
     В три переменные a, b и c явно записаны программистом три целых попарно неравных
     между собой числа. Создать программу, которая переставит числа в переменных таким
     образом, чтобы при выводе на экран последовательность a, b и c оказалась строго
     возрастающей.

     Числа в переменных a, b и c: 3, 9, -1
     Возрастающая последовательность: -1, 3, 9

     Числа в переменных a, b и c: 2, 4, 3
     Возрастающая последовательность: 2, 3, 4

     Числа в переменных a, b и c: 7, 0, -5
     Возрастающая последовательность: -5, 0, 7
     */
    public static void main(String[] args) {
        int a = 2, b = 4, c = 3;

        String ordering = ordering(a, b, c);
        System.out.println(ordering);
    }

    public static String ordering(int a, int b, int c) {
        // TODO implement
        int max=0;
        int midle=0;
        int min =0;
if (a>b && a>c) {
     max = a;
    if (b>c) {
         midle = b;
         min = c;
            } else {
        midle = c;
        min = b;
    }
} else if (b>a && b>c) {
    max = b;
    if (a>c) {
        midle=a;
        min = c;
    } else {
        midle=c;
        min=a;
    }
} else if (c>a && c>b) {
    max = c;
    if (a>b) {
        midle = a;
        min = b;
    }else {
        midle=b;
        min=a;
    }
}
        return "Числа в переменных a, b и c: " + a + ", " + b + ", " + c + "\n" +
                "Возрастающая последовательность: " + min + ", " + midle + ", " + max;
    }
}
