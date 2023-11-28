package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance(999999));
    }

    static double getHappyTicketChance(int ticketNumber) {
        int collisionNumber = 0;

        for (int i = 0; i <= 999; i++) {
            for (int j = 0; j <= 999; j++) {

                if ((i == j) || (getSum(i) == getSum(j))) {
                    System.out.println(i + "\t" + j);
                    collisionNumber++;
                }
            }
        }

        return (double) collisionNumber / 1000000;
    }

    private static int getSum(int number) {
        int sum = 0;
        int currentDigit;

        while (number > 0) {
            currentDigit = number % 10;
            sum += currentDigit;
            number /= 10;
        }

        return sum;
    }
}