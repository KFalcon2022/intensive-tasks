package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance(1000000));

    }
    static double getHappyTicketChance(int ticketNumber) {
        double count = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if (sumDigit(i) == sumDigit(j)) {
                    count++;
                }
            }
        }
        return count / ticketNumber;
    }
    static int sumDigit(int num) {
        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }
}