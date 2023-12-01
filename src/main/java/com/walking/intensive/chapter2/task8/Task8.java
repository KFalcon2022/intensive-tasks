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

        for (int i = 0; i < 1000000; i++) {
            if (isTicketHappy(i)) {
                count++;
            }
        }

        return count / 1000000.0;
    }

    static boolean isTicketHappy(int ticketNumber) {
        int leftSum = (ticketNumber / 100000) +
                      (ticketNumber / 10000) % 10 +
                      (ticketNumber / 1000) % 10;

        int rightSum = (ticketNumber / 100) % 10 +
                       (ticketNumber / 10) % 10 +
                        ticketNumber % 10;

        return leftSum == rightSum;
    }


}