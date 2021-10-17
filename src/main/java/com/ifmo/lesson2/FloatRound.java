package com.ifmo.lesson2;

public class FloatRound {
    /*
    В переменной n хранится вещественное число с ненулевой дробной частью.
    Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
     */
    public static void main(String[] args) {
        float n = - 1.55F;
        float rounded = round(n);
        System.out.println(rounded);
    }
    public static float round(float n) {
        // TODO implement
float m = n * 10 % 10;
        if (m >= 0) {
            if (m >= 5)
                n = n + (1 - m / 10);
            else
                n = n - m / 10;}
        else {
            if ( - m >= 5)
               n = n - ( 1 + m / 10);
            else
               n = n - ( m / 10);}
        return n ;
    }
}
