package com.walking.intensive.chapter2.task8;

import java.util.Scanner;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a> Добираясь в школу
 */
public class Task8 {

  public static void main(String[] args) {
    System.out.printf("Вероятность выпадения счастливого билета составит: %.3f\n",
        getHappyTicketChance());

    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите номер билета: ");
    int ticketNumber = scanner.nextInt();
    scanner.close();

    System.out.println(checkHappyTicket(ticketNumber));
  }

  static double getHappyTicketChance() {
    int count = 0;
    for (int i = 0; i <= 999999; i++) {
      int firstThreeDigits = i / 1000;
      int secondThreeDigits = i % 1000;
      if (getSumOfDigits(firstThreeDigits) == getSumOfDigits(secondThreeDigits)) {
        count++;
      }
    }
    return (double) count / 1000000;
  }

  static String checkHappyTicket(int ticketNumber) {
    int firstThreeDigitsOfTicket = ticketNumber / 1000;
    int secondThreeDigitsOfTicket = ticketNumber % 1000;
    int sumFirstThreeDigits = 0;
    int sumSecondThreeDigits = 0;

    for (int i = 0; i < 3; i++) {
      sumFirstThreeDigits += firstThreeDigitsOfTicket % 10;
      sumSecondThreeDigits += secondThreeDigitsOfTicket % 10;
      firstThreeDigitsOfTicket /= 10;
      secondThreeDigitsOfTicket /= 10;
    }
    return (sumFirstThreeDigits == sumSecondThreeDigits) ? "Введенный билет является счастливым."
        : "Введенный билет не является счастливым.";
  }

  private static int getSumOfDigits(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }


}