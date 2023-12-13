package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {

  public static void main(String[] args) {

    System.out.println(
        "Наибольшее число из пары дружественных чисел(180848): " + getFriendlyPair(200001));
    System.out.println(
        "Наибольшее число из пары дружественных чисел(124155): " + getFriendlyPair(125325));
    System.out.println(
        "Наибольшее число из пары дружественных чисел(76084): " + getFriendlyPair(77001));
    System.out.println(
        "Наибольшее число из пары дружественных чисел(18416): " + getFriendlyPair(20001));
    System.out.println(
        "Наибольшее число из пары дружественных чисел(14595): " + getFriendlyPair(15035));
    System.out.println(
        "Наибольшее число из пары дружественных чисел(10856): " + getFriendlyPair(14033));
    System.out.println(
        "Наибольшее число из пары дружественных чисел(6368): " + getFriendlyPair(10000));
    System.out.println(
        "Наибольшее число из пары дружественных чисел(5564): " + getFriendlyPair(6000));
    System.out.println(
        "Наибольшее число из пары дружественных чисел(2924): " + getFriendlyPair(5000));
    System.out.println(
        "Наибольшее число из пары дружественных чисел(1210): " + getFriendlyPair(2000));
    System.out.println(
        "Наибольшее число из пары дружественных чисел(284): " + getFriendlyPair(300));
    System.out.println("Наибольшее число из пары дружественных чисел(0): " + getFriendlyPair(111));
    System.out.println("Наибольшее число из пары дружественных чисел(0): " + getFriendlyPair(0));
    System.out.println("Наибольшее число из пары дружественных чисел(0): " + getFriendlyPair(-1));
    System.out.println("Наибольшее число из пары дружественных чисел(0): " + getFriendlyPair(-111));
  }

  static int getFriendlyPair(int m) {

    if (m <= 0) {
      return 0;
    }

    while (m > 0 && !(m == getSumOfDivisors(getSumOfDivisors(m))) | getSumOfDivisors(m) >= m) {
      m--;
    }
    return m;
  }

  static int getSumOfDivisors(int m) {
    int sumOfDivisors = 0;

    for (int i = 1; i <= m / 2; i++) {

      if (m % i == 0) {
        sumOfDivisors += i;
      }
    }
    return sumOfDivisors;
  }
}