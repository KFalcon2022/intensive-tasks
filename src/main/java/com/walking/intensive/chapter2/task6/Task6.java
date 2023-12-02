package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 * Удачи
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