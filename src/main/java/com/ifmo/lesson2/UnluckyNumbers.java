package com.ifmo.lesson2;

public class UnluckyNumbers {
    /*
    В американской армии считается несчастливым число 13, а в японской — 4. Перед
    международными учениями штаб российской армии решил исключить номера боевой
    техники, содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040), чтобы не
    смущать иностранных коллег. Если в распоряжении армии имеется 100 тыс. единиц боевой
    техники и каждая боевая машина имеет номер от 00001 до 99999, то сколько всего номеров
    придётся исключить?
     */
    public static void main(String[] args) {
        System.out.println(unluckyNumbersCount());
    }

    public static int unluckyNumbersCount() {
        // TODO implement
 int count = 0;
for (int i = 1; i<100000;i++) {
    if (i%10==4) {
        count++;

    }else if (i%100/10==4){
        count++;
    }else if (i%1000/100==4){
        count++;
    }else if (i%10000/1000==4){
        count++;
    }else if (i%100000/10000==4){
        count++;
    }else if (i%100==13){
        count++;
    }else if (i%1000/10==13){
        count++;
    }else if (i%10000/100==13){
        count++;
    }else if (i%100000/1000==13){
        count++;
    }
}
        return count;
    }
}
