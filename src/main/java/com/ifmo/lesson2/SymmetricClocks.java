package com.ifmo.lesson2;

public class SymmetricClocks {
    /*
    Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько
    раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация
    для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51)
     */
    public static void main(String[] args) {
        System.out.println(symmetricTimes());
    }

    public static int symmetricTimes() {
        // TODO implement
        int count = 0;
              for (int x = 0; x <= 2; x++) {
                  if (x==0 && x==1) {
                      for (int y = 0; y <= 9; y++) {
                          for (int z = 0; z <= 5; z++) {
                              for (int q = 0; q <= 9; q++) {
                                  if (x == q) {
                                      if (y == z) {
                                          count++;
                                      }
                                  }
                              }
                          }
                      }
                  }
                  else {for (int y = 0; y <= 4; y++) {
                      for (int z = 0; z <= 5; z++) {
                          for (int q = 0; q <= 9; q++) {
                              if (x == q) {
                                  if (y == z) {
                                      count++;
                                  }
                              }
                          }
                      }
                  }
                  }

              }
        return count;

    }
}
