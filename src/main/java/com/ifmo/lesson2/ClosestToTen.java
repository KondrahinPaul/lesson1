package com.ifmo.lesson2;

public class ClosestToTen {
    /*
     Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в
     переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
     */
    public static void main(String[] args) {
        float m = - 110.5f;
        float n = 111.45f;
        String closestToTen = closestToTen(m, n);
        System.out.println(closestToTen);
    }

    public static String closestToTen(float m, float n) {
        // TODO implement

if ( 10 -  m  > 10 - n ) return "среди чисел  " + m + "    " + n + "  ближе к 10  " + n;
else {
    return " среди чисел " + m + " пробел  " + n + " ближе к 10  - " + m;
        }
    }
}
