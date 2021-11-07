package com.ifmo.lesson3;

public class UnevenArray {
    /*
    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем
    этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3
    1)
     */
    public static void main(String[] args) {
        int[] unevenArray = unevenArray();

        // TODO implement
        for (int i = 0; i < unevenArray.length; i++) {
            System.out.print(" ");
            System.out.print(unevenArray[i]);
        }
        System.out.print(", ");
        for (int i = 49; i >= 0; i--) {
            System.out.print(" ");
            System.out.print(unevenArray[i]+" ");
        }

    }

    public static int[] unevenArray() {
        // TODO implement
        int[] necet = new int[50];
        necet[0] = 1;
        for (int i = 1; i < 50; i++) {
            necet[i] = necet[i - 1] + 2;
        }

        return necet;
    }
}
