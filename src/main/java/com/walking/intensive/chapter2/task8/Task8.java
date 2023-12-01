package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        int count = 0;
        for (int i = 0; i <= 999999; i++) {
            int firstHalf = i / 1000;
            int secondHalf = i % 1000;
            if (calculateSumDigits(firstHalf) == calculateSumDigits(secondHalf)) {
                count++;
            }
        }
        return (double) count / 999999;
    }

    private static int calculateSumDigits(int number) {
        return number / 100000 % 10 + number / 10000 % 10 + number
                / 1000 % 10 + number / 100 % 10 + number / 10 % 10 + number % 10;
    }
}