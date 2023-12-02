package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a> Напишите два
 * метода. Первый метод возвращает НОК двух чисел. Второй метод возвращает НОД двух чисел. P.S. По
 * желанию: Если знакомы с рекурсией напишите алгоритм Евклида поиска НОД. Требования к оформлению.
 * НОД = Greatest common divisor — GCD НОК = Least common multiple — LCM Удачи
 */
public class Task6 {

  public static void main(String[] args) {
    int m = 3;
    int n = 6;
    System.out.println("NOD: " + getNod(m, n));
    System.out.println("NOC: " + getNoc(m, n));
    System.out.println("NOD by Euclid: " + getNodByEuclideanAlgorithm(m, n));
  }

  static int getNoc(int m, int n) {
    return (m * n) / getNodByEuclideanAlgorithm(m, n);
  }

  static int getNod(int m, int n) {
    while (n != 0) {
      int temp = n;
      n = m % n;
      m = temp;
    }
    return m;
  }

  static int getNodByEuclideanAlgorithm(int m, int n) {
    if (n == 0) {
      return m;
    }
    return getNodByEuclideanAlgorithm(n, m % n);
  }
}