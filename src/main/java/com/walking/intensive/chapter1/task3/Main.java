package com.walking.intensive.chapter1.task3;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {

  public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите интересующий вас год: ");
    int year = scanner.nextInt();
    scanner.close();
    System.out.println(isLeap(year));
  }

  static boolean isLeap(int year) {
    return year % 400 == 0 | year % 4 == 0 ^ year % 100 == 0;
  }
}